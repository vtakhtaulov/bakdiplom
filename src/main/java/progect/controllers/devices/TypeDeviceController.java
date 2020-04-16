package progect.controllers.devices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import progect.domain.devices.TypeDeviceDomain;
import progect.service.interfase.pac.device.ITypeDeviceService;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping(value = "/TypeDevices/")
public class TypeDeviceController {
    @Autowired
    private ITypeDeviceService typeDeviceService;

    @RequestMapping(value = "/TypeDevicesAll", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public List<TypeDeviceDomain> findAll() {
        return typeDeviceService.findAll();
    }

    @RequestMapping(value = "/SearchTypeDevices/{id_type_dev}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public TypeDeviceDomain read(@PathVariable("id_type_dev") TypeDeviceDomain obj) {
        return typeDeviceService.read(obj);
    }

    @RequestMapping(value = "/DeleteTypeDevices/{id_type_dev}", method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public boolean delete(@PathVariable("id_type_dev") TypeDeviceDomain obj) {
        return typeDeviceService.delete(obj);
    }

    @RequestMapping(value = "/UpdateTypeDevices/{id_devices}", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public List<TypeDeviceDomain> update(@PathVariable("id_type_dev") TypeDeviceDomain obj, @RequestBody TypeDeviceDomain new_obj) {
        return typeDeviceService.update(obj, new_obj);
    }
    @RequestMapping(value = "/CreateDTypeDevices", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public List<TypeDeviceDomain> create(@RequestBody TypeDeviceDomain obj){
        return typeDeviceService.create(obj);
    }

}
