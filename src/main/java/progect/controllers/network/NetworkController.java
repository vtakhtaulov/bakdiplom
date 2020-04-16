package progect.controllers.network;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import progect.DTO.network.NetworkDTO;
import progect.domain.network.NetworkDomain;
import progect.service.interfase.pac.network.INetworkService;

import java.util.*;

@RestController
@CrossOrigin("*")
@RequestMapping(value = "/Network/")
public class NetworkController  {
    @Autowired
    private INetworkService networkService;

    @RequestMapping(value = "/NetworkAll", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public List<NetworkDTO> findAll() {
        return networkService.findAll();
    }

    @RequestMapping(value = "/SearchNetwork/{id_network}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public NetworkDTO read(@PathVariable("id_network") NetworkDTO obj) {
        return networkService.read(obj);
    }

    @RequestMapping(value = "/DeleteNetwork/{id_network}", method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public boolean delete(@PathVariable("id_network") NetworkDTO obj) {
        return networkService.delete(obj);
    }

    @RequestMapping(value = "/UpdateNetwork/{id_network}", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public List<NetworkDTO> update(@PathVariable("id_network") NetworkDTO obj, @RequestBody NetworkDTO new_obj) {
        return networkService.update(obj, new_obj);
    }
    @RequestMapping(value = "/CreateNetwork", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public List<NetworkDTO> create(@RequestBody NetworkDTO obj){
        return networkService.create(obj);
    }

}



