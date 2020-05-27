package progect.controllers.journal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import progect.DTO.journal.ConfigurationDTO;
import progect.DTO.journal.CrossDevicesDTO;
import progect.service.interfase.pac.journal.IConfigurationService;
import progect.service.interfase.pac.journal.ICrossDevicesService;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping(value = "/CrossDevices/")
public class CrossDevicesController  {
    @Autowired
    private ICrossDevicesService crossDevicesService;

    @RequestMapping(value = "/CrossDevicesAll", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public List<CrossDevicesDTO> findAll() {
        return crossDevicesService.findAll();
    }

    @RequestMapping(value = "/SearchCrossDevices/{Id_crossdevices}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public CrossDevicesDTO read(@PathVariable("Id_crossdevices") CrossDevicesDTO obj) {
        return crossDevicesService.read(obj);
    }

    @RequestMapping(value = "/DeleteCrossDevices/{Id_crossdevices}", method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public List<CrossDevicesDTO> delete(@PathVariable("Id_crossdevices") Integer Id_crossdevices, @RequestBody CrossDevicesDTO obj) {
        return crossDevicesService.delete(Id_crossdevices ,obj);
    }

    @RequestMapping(value = "/UpdateCrossDevices/{Id_crossdevices}", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public List<CrossDevicesDTO> update(@PathVariable("Id_crossdevices") Integer Id_crossdevices, @RequestBody CrossDevicesDTO new_obj) {
        return crossDevicesService.update(Id_crossdevices, new_obj);
    }
    @RequestMapping(value = "/CreateCrossDevices", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public List<CrossDevicesDTO> create(@RequestBody CrossDevicesDTO obj){
        return crossDevicesService.create(obj);
    }

}