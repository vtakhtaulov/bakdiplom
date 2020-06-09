package progect.service.interfase.pac.network;

import progect.DTO.network.Pool_address_DTO;
import progect.domain.network.Dhcp_poolDomain;
import progect.domain.network.Pool_address_Domain;

import java.util.List;

public interface IDHCPService {

    List<Dhcp_poolDomain> findAll();
    Dhcp_poolDomain read(Dhcp_poolDomain pool_address);
    List<Dhcp_poolDomain> delete(Integer id_dhcp_pool);
    List<Dhcp_poolDomain> update(Integer pool,Dhcp_poolDomain new_pool);
    List<Dhcp_poolDomain> create(Dhcp_poolDomain pool);
}
