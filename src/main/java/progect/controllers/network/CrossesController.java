package progect.controllers.network;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import progect.domain.network.CrossesDomain;
import progect.service.interfase.pac.network.ICrossesService;

import java.util.*;

@RestController
@CrossOrigin("*")
@RequestMapping(value = "/Crosses/")
public class CrossesController  {
    @Autowired
    private ICrossesService crossesService;

    @RequestMapping(value = "/CrossesAll", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public List<CrossesDomain> findAll() {
        return crossesService.findAll();
    }

    @RequestMapping(value = "/SearchCrosses/{id_crosses_first}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public CrossesDomain read(@PathVariable("id_crosses_first") CrossesDomain obj) {
        return crossesService.read(obj);
    }

    @RequestMapping(value = "/DeleteCrosses/{id_crosses_first}", method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public boolean delete(@PathVariable("id_crosses_first") CrossesDomain obj) {
        return crossesService.delete(obj);
    }

    @RequestMapping(value = "/UpdateCrosses/{id_crosses_first}", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public List<CrossesDomain> update(@PathVariable("id_crosses_first") CrossesDomain obj, @RequestBody CrossesDomain new_obj) {
        return crossesService.update(obj, new_obj);
    }
    @RequestMapping(value = "/CreateCrosses", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public List<CrossesDomain> create(@RequestBody CrossesDomain obj){
        return crossesService.create(obj);
    }

}