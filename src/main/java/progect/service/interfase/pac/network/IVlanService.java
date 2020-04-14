package progect.service.interfase.pac.network;

import progect.DTO.network.NodesDTO;
import progect.domain.network.VlanDomain;
import progect.repository.network.VlanRepository;

import java.util.List;

public interface IVlanService {
    List<VlanDomain> findAllVlan();
    VlanDomain readVlan(VlanDomain obj);
    boolean deleteVlan(VlanDomain obj);
    List<VlanDomain> updateVlan (VlanDomain obj, VlanDomain new_obj);
    List<VlanDomain> createVlan (VlanDomain obj);
}
