package progect.service.interfase.pac.device;

import progect.DTO.devices.DevicesDTO;
import progect.domain.network.CrossesDomain;

import java.util.List;

public interface IDeviceService {
    List<DevicesDTO> findAll();
    DevicesDTO read(DevicesDTO obj);
    boolean delete(DevicesDTO obj);
    List<DevicesDTO> update(DevicesDTO obj,DevicesDTO new_obj);
    List<DevicesDTO> create(DevicesDTO obj);
}
