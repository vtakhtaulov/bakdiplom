package progect.service.implimentation.pac.devices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import progect.DTO.devices.DevicesDTO;
import progect.DTO.network.Pool_address_DTO;
import progect.domain.devices.DevicesDomain;
import progect.domain.network.Pool_address_Domain;
import progect.repository.devices.DevicesRepository;
import progect.service.interfase.pac.device.IDeviceService;

import java.util.ArrayList;
import java.util.List;

@Service
public class DevicesService implements IDeviceService {
    @Autowired
    private DevicesRepository devicesRepository;

    @Override
    public List<DevicesDTO> findAll() {
        return mapperEntityToDTO();
    }

    @Override
    public DevicesDTO read(DevicesDTO obj) {
        return null;
    }

    @Override
    public boolean delete(DevicesDTO obj) {
        return false;
    }

    @Override
    public List<DevicesDTO> update(DevicesDTO obj, DevicesDTO new_obj) {
        return mapperEntityToDTO();
    }

    @Override
    public List<DevicesDTO> create(DevicesDTO obj) {
        return mapperEntityToDTO();
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
