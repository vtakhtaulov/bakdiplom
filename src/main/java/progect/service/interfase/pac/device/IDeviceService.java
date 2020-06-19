package progect.service.interfase.pac.device;

import progect.DTO.devices.DevicesDTO;
import progect.DTO.devices.InfoCrossDeviceEndDTO;
import progect.DTO.filter.NetworkJournalDeviceFilter;

import java.util.List;

public interface IDeviceService {
    List<DevicesDTO> findAll();
    DevicesDTO read(DevicesDTO obj);
    InfoCrossDeviceEndDTO searchCrossDeviceInfo(Integer id_devices);
    List<InfoCrossDeviceEndDTO> getAllCrossDevicesInfo();
    List<DevicesDTO> delete(Integer id_devices);
    List<DevicesDTO> update(DevicesDTO obj,Integer id_devices);
    List<DevicesDTO> create(DevicesDTO obj);
    List<NetworkJournalDeviceFilter> getAllDeviceFilter();
}
