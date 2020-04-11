package progect.service.NetworkServise;

import progect.domain.network.Pool_address_Domain;
import progect.domain.user.UsersDomain;

import java.util.List;

public interface IPoolAddressService {

    List<Pool_address_Domain> getAllPool();
    Pool_address_Domain getOnePool(Pool_address_Domain pool_address);
    void deletePool(Pool_address_Domain pool);
    List<Pool_address_Domain> updatePool (Pool_address_Domain pool,Pool_address_Domain new_pool);
    List<Pool_address_Domain> AddPool (Pool_address_Domain pool);
}
