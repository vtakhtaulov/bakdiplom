package progect.service.implimentation.pac.network;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import progect.DTO.network.NetworkDTO;
import progect.DTO.network.Pool_address_DTO;
import progect.domain.network.NetworkDomain;
import progect.domain.network.Pool_address_Domain;
import progect.repository.network.NetworkRepository;
import progect.service.interfase.pac.network.INetworkService;

import java.util.ArrayList;
import java.util.List;

@Service
public class NetworkService implements INetworkService {
    @Autowired
    private NetworkRepository networkRepository;
    @Override
    public List<NetworkDTO> findAllNetwork() {
        return mapperEntityToDTO();
    }

    @Override
    public NetworkDTO readNetwork(NetworkDTO net) {
        return null;
    }

    @Override
    public boolean deleteNetwork(NetworkDTO net) {
        return false;
    }

    @Override
    public List<NetworkDTO> updateNetwork(NetworkDTO net, NetworkDTO new_net) {
        return mapperEntityToDTO();
    }

    @Override
    public List<NetworkDTO> createNetwork(NetworkDTO net) {
        return mapperEntityToDTO();
    }


    private List<NetworkDTO> mapperEntityToDTO()
    {
        List<NetworkDTO> listNetDTO = new ArrayList<>();
        List<NetworkDomain> listNetDom = networkRepository.findAll();
        for(int i = 0; i<listNetDom.size(); i++) {
            NetworkDomain net_dom = listNetDom.get(i);
            listNetDTO.add(new NetworkDTO(net_dom));
        }
        return listNetDTO;
    }
}
