package progect.controllers.network;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import progect.DTO.network.NetworkDTO;
import progect.service.interfase.pac.network.INetworkService;

import java.util.*;

@RestController
@CrossOrigin("*")
@RequestMapping(value = "/Network/")
public class NetworkController  {
    @Autowired
    private INetworkService networkService;

    @RequestMapping(value = "/NetworkAll", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public List<NetworkDTO> FindAllPool() {
        return networkService.findAllNetwork();
    }

    @RequestMapping(value = "/SearchNetwork/{id_network}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public NetworkDTO ReadPool(@PathVariable("id_network") NetworkDTO obj) {
        return networkService.readNetwork(obj);
    }

    @RequestMapping(value = "/DeleteNetwork/{id_network}", method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public boolean deleteUsers(@PathVariable("id_network") NetworkDTO obj) {
        return networkService.deleteNetwork(obj);
    }

    @RequestMapping(value = "/UpdateNetwork/{id_network}", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public List<NetworkDTO> UpdatePool(@PathVariable("id_network") NetworkDTO obj, @RequestBody NetworkDTO new_obj) {
        return networkService.updateNetwork(obj, new_obj);
    }
    @RequestMapping(value = "/CreateNetwork", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public List<NetworkDTO> CreatePool (@RequestBody NetworkDTO obj){
        return networkService.createNetwork(obj);
    }

}



