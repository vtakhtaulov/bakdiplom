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
    public List<CrossesDomain> FindAllPool() {
        return crossesService.findAllPool();
    }

    @RequestMapping(value = "/SearchCrosses/{id_crosses_first}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public CrossesDomain ReadPool(@PathVariable("id_crosses_first") CrossesDomain crosses) {
        return crossesService.readPool(crosses);
    }

    @RequestMapping(value = "/DeleteCrosses/{id_crosses_first}", method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public boolean deleteUsers(@PathVariable("id_crosses_first") CrossesDomain crosses) {
        return crossesService.deletePool(crosses);
    }

    @RequestMapping(value = "/UpdateCrosses/{id_crosses_first}", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public List<CrossesDomain> UpdatePool(@PathVariable("id_crosses_first") CrossesDomain crosses, @RequestBody CrossesDomain new_crosses) {
        return crossesService.updatePool(crosses, new_crosses);
    }
    @RequestMapping(value = "/CreateCrosses", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public List<CrossesDomain> CreatePool (@RequestBody CrossesDomain crosses){
        return crossesService.createPool(crosses);
    }

}