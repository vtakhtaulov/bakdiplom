package progect.service.interfase.pac.network;

import progect.DTO.network.Pool_address_DTO;
import progect.domain.network.Pool_address_Domain;

import java.util.List;

public interface IPoolAddressService {

    List<Pool_address_DTO> findAll();
    Pool_address_DTO read(Pool_address_DTO obj);
    boolean delete(Pool_address_DTO obj);
    List<Pool_address_DTO> update(Pool_address_DTO obj,Pool_address_DTO new_obj);
    List<Pool_address_DTO> create(Pool_address_DTO obj);
}
