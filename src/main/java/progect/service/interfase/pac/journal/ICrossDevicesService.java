package progect.service.interfase.pac.journal;

import progect.DTO.journal.ConfigurationDTO;
import progect.DTO.journal.CrossDevicesDTO;

import java.util.List;

public interface ICrossDevicesService {
    List<CrossDevicesDTO> findAll();
    CrossDevicesDTO read(CrossDevicesDTO obj);
    List<CrossDevicesDTO> delete(Integer id_cross_dev, CrossDevicesDTO obj);
    List<CrossDevicesDTO> update(Integer id_cross_dev, CrossDevicesDTO new_obj);
    List<CrossDevicesDTO> create(CrossDevicesDTO obj);
}
