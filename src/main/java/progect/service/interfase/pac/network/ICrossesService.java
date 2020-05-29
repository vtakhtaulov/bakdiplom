package progect.service.interfase.pac.network;

import progect.DTO.network.Pool_address_DTO;
import progect.domain.network.CrossesDomain;
import progect.domain.network.Pool_address_Domain;

import java.util.List;

public interface ICrossesService {
    List<CrossesDomain> findAll();
    CrossesDomain read(CrossesDomain obj);
    boolean delete(CrossesDomain obj);
    List<CrossesDomain> update(Integer id, CrossesDomain new_obj);
    List<CrossesDomain> create(CrossesDomain obj);
}
