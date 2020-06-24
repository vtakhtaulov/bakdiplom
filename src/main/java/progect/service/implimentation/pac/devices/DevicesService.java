package progect.service.implimentation.pac.devices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import progect.DTO.devices.DevicesDTO;
import progect.DTO.devices.InfoCrossDeviceEndDTO;
import progect.DTO.filter.NetworkJournalDeviceFilter;
import progect.domain.RefStatusDomain;
import progect.domain.devices.DevicesDomain;
import progect.domain.devices.PropsPortDomain;
import progect.domain.devices.TypeDeviceDomain;
import progect.domain.journal.CrossDevicesDomain;
import progect.domain.journal.NetworkJournalDomain;
import progect.domain.room.RoomDomain;
import progect.domain.user.UsersDomain;
import progect.repository.RefStatusRepository;
import progect.repository.devices.DevicesRepository;
import progect.repository.devices.PropsPortRepository;
import progect.repository.devices.TypeDeviceRepository;
import progect.repository.journal.CrossDevicesRepository;
import progect.repository.journal.NetworkJournalRepository;
import progect.repository.network.CrossesRepository;
import progect.repository.room.RoomRepository;
import progect.repository.user.UserRepository;
import progect.service.interfase.pac.device.IDeviceService;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class DevicesService implements IDeviceService {
    @Autowired
    private DevicesRepository devicesRepository;
    @Autowired
    private PropsPortRepository propsPortRepository;
    @Autowired
    private RoomRepository roomRepository;
    @Autowired
    private TypeDeviceRepository typeDeviceRepository;
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private RefStatusRepository refStatusRepository;
    @Autowired
    private NetworkJournalRepository networkJournalRepository;
    @Autowired
    private CrossDevicesRepository crossDevicesRepository;
    @Autowired
    private EntityManager em;

    @Override
    public List<DevicesDTO> findAll() {
        return mapperEntityToDTO();
    }

    @Override
    public DevicesDTO read(DevicesDTO obj) {
        return null;
    }

    @Override
    public InfoCrossDeviceEndDTO searchCrossDeviceInfo(Integer id_devices) {
        try {
            Query deviceEnd = em.createNativeQuery("select * from network.infocrossedevice inf where inf.id_devices = ?1", InfoCrossDeviceEndDTO.class);
            deviceEnd.setParameter(1, id_devices);
            return (InfoCrossDeviceEndDTO) deviceEnd.getResultList().get(0);
        }
        catch (Exception e){
            return null;
        }
    }

    @Override
    public List<InfoCrossDeviceEndDTO> getAllCrossDevicesInfo() {
      Query deviceEnd =  em.createNativeQuery("select * from network.infocrossedevice inf", InfoCrossDeviceEndDTO.class);

        List<InfoCrossDeviceEndDTO> infoCrossDeviceEndDTOList = (List<InfoCrossDeviceEndDTO>) deviceEnd.getResultList();
        return infoCrossDeviceEndDTOList;
    }

    @Override
    public List<DevicesDTO> delete(Integer id_devices, Integer id_user_old) {
        Optional<DevicesDomain> devicesDomain = devicesRepository.findById(id_devices);

        propsPortRepository.delete(devicesDomain.get().getId_props_port());
        devicesRepository.delete(id_devices);
        List<NetworkJournalDomain> networkJournalDomains = networkJournalRepository.findBy_AndId_devices(id_devices);
        for(NetworkJournalDomain networkJournalDomain : networkJournalDomains){
            networkJournalDomain.setIs_status(refStatusRepository.findById(2).get());
            networkJournalDomain.setDate_old(new Date());
            networkJournalDomain.setId_user_old(userRepository.findById(id_user_old).get());
            networkJournalRepository.save(networkJournalDomain);
        }

       try {
           try {
               List<CrossDevicesDomain> crossDevicesDomains = crossDevicesRepository.findBy_deviceFirst(id_devices);
                for(CrossDevicesDomain crossDevicesDomain : crossDevicesDomains){
                   crossDevicesDomain.setIs_status(refStatusRepository.findById(2).get());
                   crossDevicesDomain.setDescription("Удалено устройство");
                   crossDevicesDomain.setId_user_old(userRepository.findById(id_user_old).get());
                   crossDevicesDomain.setDate_old(new Date());
                   crossDevicesRepository.save(crossDevicesDomain);
               }
           } catch (Exception e) {
               CrossDevicesDomain crossDevicesDomain = crossDevicesRepository.findBy_deviceEnd(id_devices);
               crossDevicesDomain.setIs_status(refStatusRepository.findById(2).get());
               crossDevicesDomain.setDescription("Удалено устройство");
               crossDevicesDomain.setId_user_old(userRepository.findById(id_user_old).get());
               crossDevicesDomain.setDate_old(new Date());
               crossDevicesRepository.save(crossDevicesDomain);
           }
       }catch (Exception e){
           System.out.println("Не удалось удалить запись в журнале подключений: "+ e.getMessage());
       }
        return mapperEntityToDTO();
    }

    @Override
    public List<DevicesDTO> update(DevicesDTO obj, Integer id_devices) {
        PropsPortDomain propsPortDomain = new PropsPortDomain(obj.getCountOptPort(),obj.getCountEthernetPort());

        Optional<TypeDeviceDomain> typeDeviceDomain = typeDeviceRepository.findById(obj.getId_type_devices());
        Optional<UsersDomain> usersDomain = userRepository.findById(obj.getId_user_otv());
        Optional<RoomDomain> roomDomain = roomRepository.findById(obj.getId_room());
        Optional<RefStatusDomain> refStatusDomain = refStatusRepository.findById(obj.getId_status());

            devicesRepository.findById(id_devices).map(employee -> {
                employee.setId_type_devices(typeDeviceDomain.get());
                employee.setUser_otv(usersDomain.get());
                employee.setHostname(obj.getHostname());
                employee.setMac_address(obj.getMac_address());
                employee.setInventar_number(obj.getInventar_number());
                employee.setId_room(roomDomain.get());
                employee.setId_props_port(propsPortDomain);
                employee.setIs_status(refStatusDomain.get());
            return devicesRepository.save(employee);
        });

        System.out.println(devicesRepository.findById(obj.getId_devices()));
        return mapperEntityToDTO();
    }

    @Override
    public List<DevicesDTO> create(DevicesDTO obj) {
        PropsPortDomain propsPortDomain = new PropsPortDomain(obj.getCountOptPort(),obj.getCountEthernetPort());
        propsPortRepository.save(propsPortDomain);

        Optional<TypeDeviceDomain> typeDeviceDomain = typeDeviceRepository.findById(obj.getId_type_devices());
        Optional<UsersDomain> usersDomain = userRepository.findById(obj.getId_user_otv());
        Optional<RoomDomain> roomDomain = roomRepository.findById(obj.getId_room());
        Optional<RefStatusDomain> refStatusDomain = refStatusRepository.findById(obj.getId_status());

        DevicesDomain devicesDomain = new DevicesDomain(typeDeviceDomain.get(),
                usersDomain.get(), obj.getHostname(),obj.getMac_address(),
                obj.getInventar_number(), roomDomain.get(), propsPortDomain, refStatusDomain.get());

        devicesRepository.save(devicesDomain);

        return mapperEntityToDTO();
    }

    @Override
    public List<NetworkJournalDeviceFilter> getAllDeviceFilter() {
        List<DevicesDomain> devicesDomains = devicesRepository.getInfoConnectDevice();
        List<NetworkJournalDeviceFilter> networkJournalDeviceFilters = new ArrayList<>();

        for (DevicesDomain devices: devicesDomains) {
            NetworkJournalDeviceFilter net = new NetworkJournalDeviceFilter();
            net.setId_devices(devices.getId_devices());
            net.setHostname(devices.getHostname());
            networkJournalDeviceFilters.add(net);
        }
        return networkJournalDeviceFilters;
    }

    private List<DevicesDTO> mapperEntityToDTO()
    {
        List<DevicesDTO> listDTO = new ArrayList<>();
        List<DevicesDomain> listDom = devicesRepository.findAll();
        for(int i = 0; i<listDom.size(); i++) {
            DevicesDomain dom = listDom.get(i);
            listDTO.add(new DevicesDTO(dom));
        }
        return listDTO;
    }
}
