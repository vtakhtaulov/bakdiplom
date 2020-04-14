package progect.controllers.network;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import progect.domain.network.Dhcp_poolDomain;
import progect.service.interfase.pac.network.IDHCPService;

import java.util.*;

@RestController
@CrossOrigin("*")
@RequestMapping(value = "/DHCP/")
public class DhcpController {
    @Autowired
    private IDHCPService pool_service;

    @RequestMapping(value = "/DHCPAll", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public List<Dhcp_poolDomain> findAllDHCP() {
        return pool_service.findAllDHCP();
    }

    @RequestMapping(value = "/SearchDHCP/{id_DHСP_pool}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public Dhcp_poolDomain readDHCP(@PathVariable("id_DHСP_pool") Dhcp_poolDomain pool) {
        return pool_service.readDHCP(pool);
    }

    @RequestMapping(value = "/DeleteDHCP/{id_DHСP_pool}", method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public boolean deleteDHCP(@PathVariable("id_DHСP_pool") Dhcp_poolDomain pool) {
        return pool_service.deleteDHCP(pool);
    }

    @RequestMapping(value = "/UpdateDHCP/{id_DHСP_pool}", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public List<Dhcp_poolDomain> updateDHCP(@PathVariable("id_DHСP_pool") Dhcp_poolDomain pool, @RequestBody Dhcp_poolDomain new_pool) {
        return pool_service.updateDHCP(pool, new_pool);
    }
    @RequestMapping(value = "/CreateDHCP", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public List<Dhcp_poolDomain> createDHCP (@RequestBody Dhcp_poolDomain pool){
        return pool_service.createDHCP(pool);
    }

}



