package progect.service.interfase.pac.network;

import progect.DTO.network.NodesDTO;
import progect.domain.network.VlanDomain;
import progect.repository.network.VlanRepository;

import java.util.List;

public interface IVlanService {
    List<VlanDomain> findAll();
    VlanDomain read(VlanDomain obj);
    boolean delete(VlanDomain obj);
    List<VlanDomain> update(VlanDomain obj, VlanDomain new_obj);
    List<VlanDomain> create(VlanDomain obj);
}
