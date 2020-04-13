package progect.service.interfase.pac.network;

import progect.DTO.network.Pool_address_DTO;
import progect.domain.network.Dhcp_poolDomain;
import progect.domain.network.Pool_address_Domain;

import java.util.List;

public interface IDHCPService {

    List<Dhcp_poolDomain> findAllDHCP();
    Dhcp_poolDomain readDHCP(Dhcp_poolDomain pool_address);
    boolean deleteDHCP(Dhcp_poolDomain pool);
    List<Dhcp_poolDomain> updateDHCP(Dhcp_poolDomain pool,Dhcp_poolDomain new_pool);
    List<Dhcp_poolDomain> createDHCP(Dhcp_poolDomain pool);
}
