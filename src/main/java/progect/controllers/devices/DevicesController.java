package progect.controllers.network;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import progect.DTO.devices.DevicesDTO;
import progect.domain.network.VlanDomain;
import progect.service.interfase.pac.device.IDeviceService;
import progect.service.interfase.pac.network.IVlanService;

import java.util.*;

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
    public boolean delete(@PathVariable("id_devices") DevicesDTO obj) {
        return deviceService.delete(obj);
    }

    @RequestMapping(value = "/UpdateDevices/{id_devices}", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public List<DevicesDTO> update(@PathVariable("id_devices") DevicesDTO obj, @RequestBody DevicesDTO new_obj) {
        return deviceService.update(obj, new_obj);
    }
    @RequestMapping(value = "/CreateDevices", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public List<DevicesDTO> create(@RequestBody DevicesDTO obj){
        return deviceService.create(obj);
    }

}
