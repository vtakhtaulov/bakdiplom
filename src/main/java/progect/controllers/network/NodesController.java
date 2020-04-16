package progect.controllers.network;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import progect.DTO.network.NodesDTO;
import progect.domain.network.NetworkDomain;
import progect.domain.network.NodesDomain;
import progect.service.interfase.pac.network.INodesService;

import java.util.*;

@RestController
@CrossOrigin("*")
@RequestMapping(value = "/Nodes/")
public class NodesController  {
    @Autowired
    private INodesService nodesService;

    @RequestMapping(value = "/NodesAll", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public List<NodesDTO> findAll() {
        return nodesService.findAll();
    }

    @RequestMapping(value = "/NodesNetwork/{id_nodes}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public NodesDTO read(@PathVariable("id_nodes") NodesDTO obj) {
        return nodesService.read(obj);
    }

    @RequestMapping(value = "/DeleteNodes/{id_nodes}", method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public boolean delete(@PathVariable("id_nodes") NodesDTO obj) {
        return nodesService.delete(obj);
    }

    @RequestMapping(value = "/UpdateNetwork/{id_nodes}", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public List<NodesDTO> update(@PathVariable("id_nodes") NodesDTO obj, @RequestBody NodesDTO new_obj) {
        return nodesService.update(obj, new_obj);
    }
    @RequestMapping(value = "/CreateNetwork", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public List<NodesDTO> create(@RequestBody NodesDTO obj){
        return nodesService.create(obj);
    }

}



