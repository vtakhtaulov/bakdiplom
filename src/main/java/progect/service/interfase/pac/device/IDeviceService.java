package progect.service.interfase.pac.device;

import progect.DTO.devices.DevicesDTO;
import progect.domain.network.CrossesDomain;

import java.util.List;

public interface IDeviceService {
    List<DevicesDTO> findAll();
    DevicesDTO read(DevicesDTO obj);
    List<DevicesDTO> delete(Integer id_devices);
    List<DevicesDTO> update(DevicesDTO obj,Integer id_devices);
    List<DevicesDTO> create(DevicesDTO obj);
}
