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
    public List<NodesDTO> findAllPool() {
        return nodesService.findAllNodes();
    }

    @RequestMapping(value = "/NodesNetwork/{id_nodes}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public NodesDTO readPool(@PathVariable("id_nodes") NodesDTO obj) {
        return nodesService.readNodes(obj);
    }

    @RequestMapping(value = "/DeleteNodes/{id_nodes}", method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public boolean deleteUsers(@PathVariable("id_nodes") NodesDTO obj) {
        return nodesService.deleteNodes(obj);
    }

    @RequestMapping(value = "/UpdateNetwork/{id_nodes}", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public List<NodesDTO> UpdatePool(@PathVariable("id_nodes") NodesDTO obj, @RequestBody NodesDTO new_obj) {
        return nodesService.updateNodes(obj, new_obj);
    }
    @RequestMapping(value = "/CreateNetwork", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public List<NodesDTO> createPool (@RequestBody NodesDTO obj){
        return nodesService.createNodes(obj);
    }

}



