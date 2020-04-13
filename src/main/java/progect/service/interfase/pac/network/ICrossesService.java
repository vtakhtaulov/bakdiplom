package progect.service.interfase.pac.network;

import progect.DTO.network.Pool_address_DTO;
import progect.domain.network.CrossesDomain;
import progect.domain.network.Pool_address_Domain;

import java.util.List;

public interface ICrossesService {
    List<CrossesDomain> findAllPool();
    CrossesDomain readPool(CrossesDomain crosses);
    boolean deletePool(CrossesDomain crosses);
    List<CrossesDomain> updatePool (CrossesDomain crosses,CrossesDomain new_crosses);
    List<CrossesDomain> createPool (CrossesDomain crosses);
}
