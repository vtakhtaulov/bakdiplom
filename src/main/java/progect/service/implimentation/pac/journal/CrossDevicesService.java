package progect.service.implimentation.pac.journal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import progect.DTO.journal.CrossDevicesDTO;
import progect.domain.journal.CrossDevicesDomain;
import progect.domain.network.CrossesDomain;
import progect.repository.RefStatusRepository;
import progect.repository.devices.DevicesRepository;
import progect.repository.journal.CrossDevicesRepository;
import progect.repository.journal.NetworkJournalRepository;
import progect.repository.network.CrossesRepository;
import progect.repository.network.VlanRepository;
import progect.repository.user.UserRepository;
import progect.service.interfase.pac.journal.ICrossDevicesService;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class CrossDevicesService implements ICrossDevicesService {
    @Autowired
    private CrossDevicesRepository crossDevicesRepository;
    @Autowired
    private DevicesRepository devicesRepository;
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private VlanRepository vlanRepository;
    @Autowired
    private NetworkJournalRepository networkJournalRepository;
    @Autowired
    private RefStatusRepository refStatusRepository;
    @Autowired
    private CrossesRepository crossesRepository;


    @Override
    public List<CrossDevicesDTO> findAll() {
        return mapperEntityToDTO();
    }

    @Override
    public CrossDevicesDTO read(CrossDevicesDTO obj) {
        return null;
    }

    @Override
    public List<CrossDevicesDTO>  delete(Integer id_cross_dev, CrossDevicesDTO obj) {
        if(crossDevicesRepository.findById(id_cross_dev).get().getIs_status().getId_status() == 2){
            return mapperEntityToDTO();
        }
        else{
        crossDevicesRepository.findById(id_cross_dev).map(crossDevicesDomain -> {
            crossDevicesDomain.setDate_old(new Date());
            crossDevicesDomain.setId_user_old(userRepository.findById(obj.getId_user_old()).get());
            crossDevicesDomain.setDescription(obj.getDescription());
            crossDevicesDomain.setIs_status(refStatusRepository.findById(2).get());
            return crossDevicesRepository.save(crossDevicesDomain);
        });


        return mapperEntityToDTO();
        }
    }

    @Override
    public List<CrossDevicesDTO> update(Integer id_cross_dev, CrossDevicesDTO obj) {
       if(crossDevicesRepository.findById(id_cross_dev).get().getIs_status().getId_status() == 2){
           return mapperEntityToDTO();
       }
       else {
           crossDevicesRepository.findById(id_cross_dev).map(crossDevicesDomainDel -> {
               crossDevicesDomainDel.setDate_old(new Date());
               crossDevicesDomainDel.setId_user_old(userRepository.findById(obj.getId_user_old()).get());
               crossDevicesDomainDel.setDescription(obj.getDescription());
               crossDevicesDomainDel.setIs_status(refStatusRepository.findById(2).get());
               return crossDevicesRepository.save(crossDevicesDomainDel);
           });

           CrossDevicesDomain crossDevicesDomain = new CrossDevicesDomain();

           crossDevicesDomain.setCrossDevicesDomain(
                   devicesRepository.findById(obj.getId_devices_first()).get(),
                   devicesRepository.findById(obj.getId_devices_end()).get(),
                   userRepository.findById(obj.getId_user_old()).get(),
                   userRepository.findById(0).get(),
                   networkJournalRepository.findById(obj.getId_network_journal()).get(),
                   null,
                   new Date(),
                   null,
                   vlanRepository.findById(obj.getId_vlan()).get(),
                   crossesRepository.findById(obj.getId_crosses()).get(),
                   refStatusRepository.findById(1).get()
           );
           crossDevicesRepository.save(crossDevicesDomain);
           return mapperEntityToDTO();
       }
    }

    @Override
    public List<CrossDevicesDTO> create(CrossDevicesDTO obj) {
        CrossDevicesDomain crossDevicesDomain = new CrossDevicesDomain();

        crossDevicesDomain.setCrossDevicesDomain(
               devicesRepository.findById(obj.getId_devices_first()).get(),
               devicesRepository.findById(obj.getId_devices_end()).get(),
               userRepository.findById(obj.getId_user_otv()).get(),
               userRepository.findById(obj.getId_user_old()).get(),
               networkJournalRepository.findById(obj.getId_network_journal()).get(),
               null,
               new Date(),
               null,
               vlanRepository.findById(obj.getId_vlan()).get(),
               crossesRepository.findById(obj.getId_crosses()).get(),
               refStatusRepository.findById(1).get()
        );
        crossDevicesRepository.save(crossDevicesDomain);
        return mapperEntityToDTO();
    }

    private List<CrossDevicesDTO> mapperEntityToDTO()
    {
        List<CrossDevicesDTO> listDTO = new ArrayList<>();
        List<CrossDevicesDomain> listDom = crossDevicesRepository.findAll();
        for(int i = 0; i<listDom.size(); i++) {
            CrossDevicesDomain obj_dom = listDom.get(i);
            listDTO.add(new CrossDevicesDTO(obj_dom));
        }
        return listDTO;
    }
}
