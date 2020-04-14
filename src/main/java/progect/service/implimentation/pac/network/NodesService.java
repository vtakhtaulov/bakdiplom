package progect.service.implimentation.pac.network;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import progect.DTO.network.NetworkDTO;
import progect.DTO.network.NodesDTO;
import progect.domain.network.NetworkDomain;
import progect.domain.network.NodesDomain;
import progect.repository.network.NodesRepository;
import progect.service.interfase.pac.network.INodesService;

import java.util.ArrayList;
import java.util.List;

@Service
public class NodesService implements INodesService {
    @Autowired
    private NodesRepository nodesRepository;
    @Override
    public List<NodesDTO> findAllNodes() {
        return mapperEntityToDTO();
    }

    @Override
    public NodesDTO readNodes(NodesDTO obj) {
        return null;
    }

    @Override
    public boolean deleteNodes(NodesDTO obj) {
        return false;
    }

    @Override
    public List<NodesDTO> updateNodes(NodesDTO obj, NodesDTO new_obj) {
        return mapperEntityToDTO();
    }

    @Override
    public List<NodesDTO> createNodes(NodesDTO obj) {
        return mapperEntityToDTO();
    }

    private List<NodesDTO> mapperEntityToDTO()
    {
        List<NodesDTO> listDTO = new ArrayList<>();
        List<NodesDomain> listDom = nodesRepository.findAll();
        for(int i = 0; i<listDom.size(); i++) {
            NodesDomain domain = listDom.get(i);
            listDTO.add(new NodesDTO(domain));
        }
        return listDTO;
    }
}
