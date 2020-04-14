package progect.controllers.network;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import progect.DTO.network.Pool_address_DTO;
import progect.service.interfase.pac.network.IPoolAddressService;

import java.util.*;

@RestController
@CrossOrigin("*")
@RequestMapping(value = "/Pool/")
public class PoolController  {
    @Autowired
    private IPoolAddressService pool_service;

    @RequestMapping(value = "/PoolAll", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public List<Pool_address_DTO> FindAllPool() {
        return pool_service.findAllPool();
    }

    @RequestMapping(value = "/SearchPool/{id_pool_address}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public Pool_address_DTO ReadPool(@PathVariable("id_pool_address") Pool_address_DTO pool) {
        return pool_service.readPool(pool);
    }

    @RequestMapping(value = "/DeletePool/{id_pool_address}", method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public boolean deleteUsers(@PathVariable("id_pool_address") Pool_address_DTO pool) {
        return pool_service.deletePool(pool);
    }

    @RequestMapping(value = "/UpdatePool/{id_pool_address}", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public List<Pool_address_DTO> UpdatePool(@PathVariable("id_pool_address") Pool_address_DTO pool, @RequestBody Pool_address_DTO new_pool) {
        return pool_service.updatePool(pool, new_pool);
    }
    @RequestMapping(value = "/CreatePool", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public List<Pool_address_DTO> CreatePool (@RequestBody Pool_address_DTO pool){
        return pool_service.createPool(pool);
    }

}



