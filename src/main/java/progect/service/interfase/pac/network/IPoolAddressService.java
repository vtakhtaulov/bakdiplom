package progect.service.interfase.pac.network;

import progect.DTO.network.Pool_address_DTO;
import progect.domain.network.Pool_address_Domain;

import java.util.List;

public interface IPoolAddressService {

    List<Pool_address_DTO> findAllPool();
    Pool_address_Domain readPool(Pool_address_Domain pool_address);
    boolean deletePool(Pool_address_Domain pool);
    List<Pool_address_DTO> updatePool (Pool_address_Domain pool,Pool_address_Domain new_pool);
    List<Pool_address_DTO> createPool (Pool_address_Domain pool);
}
