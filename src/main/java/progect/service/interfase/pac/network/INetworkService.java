package progect.service.interfase.pac.network;

import progect.DTO.network.NetworkDTO;
import progect.DTO.network.Pool_address_DTO;
import progect.domain.network.NetworkDomain;
import progect.domain.network.Pool_address_Domain;

import java.util.List;

public interface INetworkService {
    List<NetworkDTO> findAll();
    NetworkDTO read(NetworkDTO obj);
    boolean delete(NetworkDTO obj);
    List<NetworkDTO> update(NetworkDTO obj, NetworkDTO new_obj);
    List<NetworkDTO> create(NetworkDTO obj);
}
