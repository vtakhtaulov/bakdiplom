package progect.service.interfase.pac.network;

import progect.DTO.network.NetworkDTO;
import progect.DTO.network.Pool_address_DTO;
import progect.domain.network.NetworkDomain;
import progect.domain.network.Pool_address_Domain;

import java.util.List;

public interface INetworkService {
    List<NetworkDTO> findAllNetwork();
    NetworkDTO readNetwork(NetworkDTO net);
    boolean deleteNetwork(NetworkDTO net);
    List<NetworkDTO> updateNetwork (NetworkDTO net, NetworkDTO new_net);
    List<NetworkDTO> createNetwork (NetworkDTO net);
}
