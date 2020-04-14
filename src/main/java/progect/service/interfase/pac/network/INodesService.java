package progect.service.interfase.pac.network;

import progect.DTO.network.NetworkDTO;
import progect.DTO.network.NodesDTO;
import progect.domain.network.NetworkDomain;
import progect.domain.network.NodesDomain;

import java.util.List;

public interface INodesService {
    List<NodesDTO> findAllNodes();
    NodesDTO readNodes(NodesDTO obj);
    boolean deleteNodes(NodesDTO obj);
    List<NodesDTO> updateNodes (NodesDTO obj, NodesDTO new_obj);
    List<NodesDTO> createNodes (NodesDTO obj);
}
