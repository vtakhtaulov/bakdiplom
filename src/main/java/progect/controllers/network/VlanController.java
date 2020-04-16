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
    public List<VlanDomain> findAll() {
        return vlanService.findAll();
    }

    @RequestMapping(value = "/SearchVlan/{id_vlan}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public VlanDomain read(@PathVariable("id_vlan") VlanDomain obj) {
        return vlanService.read(obj);
    }

    @RequestMapping(value = "/DeleteVlan/{id_vlan}", method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public boolean delete(@PathVariable("id_vlan") VlanDomain obj) {
        return vlanService.delete(obj);
    }

    @RequestMapping(value = "/UpdateVlan/{id_vlan}", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public List<VlanDomain> update(@PathVariable("id_vlan") VlanDomain obj, @RequestBody VlanDomain new_obj) {
        return vlanService.update(obj, new_obj);
    }
    @RequestMapping(value = "/CreateVlan", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public List<VlanDomain> create(@RequestBody VlanDomain obj){
        return vlanService.create(obj);
    }

}



