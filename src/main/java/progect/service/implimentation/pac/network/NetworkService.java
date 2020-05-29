package progect.service.implimentation.pac.network;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import progect.DTO.MapperStringToEntity;
import progect.DTO.network.NetworkDTO;
import progect.DTO.network.Pool_address_DTO;
import progect.domain.network.Dhcp_poolDomain;
import progect.domain.network.NetworkDomain;
import progect.domain.network.Pool_address_Domain;
import progect.repository.network.DHСP_poolRepository;
import progect.repository.network.NetworkRepository;
import progect.service.interfase.pac.network.INetworkService;

import java.util.ArrayList;
import java.util.List;

@Service
public class NetworkService implements INetworkService {
    @Autowired
    private NetworkRepository networkRepository;
    @Autowired
    private DHСP_poolRepository dhсp_poolRepository;

    @Override
    public List<NetworkDTO> findAll() {
        return mapperEntityToDTO();
    }

    @Override
    public NetworkDTO read(NetworkDTO obj) {
        return null;
    }

    @Override
    public List<NetworkDTO> delete(Integer id_network, NetworkDTO obj) {
        return mapperEntityToDTO();
    }

    @Override
    public List<NetworkDTO> update(NetworkDTO obj, NetworkDTO new_obj) {
        return mapperEntityToDTO();
    }

    @Override
    public List<NetworkDTO> create(NetworkDTO obj) {
        return mapperEntityToDTO();
    }

    @Override
    public Integer createNetworkDhcp(MapperStringToEntity obj) {


        return null;
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
