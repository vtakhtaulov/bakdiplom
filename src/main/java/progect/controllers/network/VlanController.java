package progect.controllers.network;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import progect.domain.network.VlanDomain;
import progect.service.interfase.pac.network.IVlanService;

import java.util.*;

@RestController
@CrossOrigin("*")
@RequestMapping(value = "/Vlan/")
public class VlanController {
    @Autowired
    private IVlanService vlanService;

    @RequestMapping(value = "/VlanAll", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public List<VlanDomain> FindAllPool() {
        return vlanService.findAllVlan();
    }

    @RequestMapping(value = "/SearchVlan/{id_vlan}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public VlanDomain ReadPool(@PathVariable("id_vlan") VlanDomain obj) {
        return vlanService.readVlan(obj);
    }

    @RequestMapping(value = "/DeleteVlan/{id_vlan}", method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public boolean deleteUsers(@PathVariable("id_vlan") VlanDomain pool) {
        return vlanService.deleteVlan(pool);
    }

    @RequestMapping(value = "/UpdateVlan/{id_vlan}", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public List<VlanDomain> UpdatePool(@PathVariable("id_vlan") VlanDomain obj, @RequestBody VlanDomain new_obj) {
        return vlanService.updateVlan(obj, new_obj);
    }
    @RequestMapping(value = "/CreateVlan", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public List<VlanDomain> CreatePool (@RequestBody VlanDomain obj){
        return vlanService.createVlan(obj);
    }

}



