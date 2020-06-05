package progect.controllers.devices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import progect.DTO.devices.DevicesDTO;
import progect.DTO.devices.InfoCrossDeviceEndDTO;
import progect.service.interfase.pac.device.IDeviceService;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping(value = "/Devices/")
public class DevicesController {
    @Autowired
    private IDeviceService deviceService;

    @RequestMapping(value = "/DevicesAll", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public List<DevicesDTO> findAll() {
        return deviceService.findAll();
    }

    @RequestMapping(value = "/SearchDevices/{id_devices}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public DevicesDTO read(@PathVariable("id_devices") DevicesDTO obj) {
        return deviceService.read(obj);
    }

    @RequestMapping(value = "/DeleteDevices/{id_devices}", method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public List<DevicesDTO> delete(@PathVariable("id_devices") Integer id_devices) {
        return deviceService.delete(id_devices);
    }

    @RequestMapping(value = "/SearchCrossDevicesInfo/{id_devices}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public InfoCrossDeviceEndDTO searchCrossDeviceInfo(@PathVariable("id_devices") Integer id_devices) {
        return deviceService.searchCrossDeviceInfo(id_devices);
    }

    @RequestMapping(value = "/getAllCrossDevicesInfo", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public List<InfoCrossDeviceEndDTO> getAllCrossDevicesInfo() {
        return deviceService.getAllCrossDevicesInfo();
    }

    @RequestMapping(value = "/UpdateDevices/{id_devices}", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public List<DevicesDTO> update(@RequestBody DevicesDTO obj,
                                   @PathVariable("id_devices")  Integer id_devices) {
        return deviceService.update(obj, id_devices);
    }
    @RequestMapping(value = "/CreateDevices", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public List<DevicesDTO> create(@RequestBody DevicesDTO obj){
        try {
            return deviceService.create(obj);
        }catch (Exception e){
            return deviceService.findAll();
        }
    }

}
