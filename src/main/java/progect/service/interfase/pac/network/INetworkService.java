package progect.service.interfase.pac.network;

import progect.DTO.MapperStringToEntity;
import progect.DTO.network.NetworkDTO;
import progect.DTO.network.Pool_address_DTO;
import progect.domain.network.NetworkDomain;
import progect.domain.network.Pool_address_Domain;

import java.util.List;

public interface INetworkService {
    List<NetworkDTO> findAll();
    NetworkDTO read(NetworkDTO obj);
    List<NetworkDTO> delete(Integer id_network, NetworkDTO obj);
    List<NetworkDTO> update(Integer id_network, NetworkDTO obj);
    List<NetworkDTO> create(NetworkDTO obj);
    Integer createNetworkDhcp(MapperStringToEntity obj);
}
