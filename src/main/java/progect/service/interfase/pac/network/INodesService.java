package progect.service.interfase.pac.network;

import progect.DTO.network.NetworkDTO;
import progect.DTO.network.NodesDTO;
import progect.domain.network.NetworkDomain;
import progect.domain.network.NodesDomain;

import java.util.List;

public interface INodesService {
    List<NodesDTO> findAll();
    NodesDTO read(NodesDTO obj);
    List<NodesDTO> delete(Integer id_nodes);
    List<NodesDTO> update(Integer id_nodes, NodesDTO new_obj);
    List<NodesDTO> create(NodesDTO obj);
}
