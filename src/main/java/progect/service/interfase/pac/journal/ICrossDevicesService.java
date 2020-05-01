package progect.service.interfase.pac.journal;

import progect.DTO.journal.ConfigurationDTO;
import progect.DTO.journal.CrossDevicesDTO;

import java.util.List;

public interface ICrossDevicesService {
    List<CrossDevicesDTO> findAll();
    CrossDevicesDTO read(CrossDevicesDTO obj);
    boolean delete(CrossDevicesDTO obj);
    List<CrossDevicesDTO> update(CrossDevicesDTO obj, CrossDevicesDTO new_obj);
    List<CrossDevicesDTO> create(CrossDevicesDTO obj);
}
