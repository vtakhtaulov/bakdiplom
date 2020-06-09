package progect.service.interfase.pac.network;

import progect.DTO.network.NodesDTO;
import progect.domain.network.VlanDomain;
import progect.repository.network.VlanRepository;

import java.util.List;

public interface IVlanService {
    List<VlanDomain> findAll();
    VlanDomain read(VlanDomain obj);
    List<VlanDomain> delete(Integer id_vlan,  VlanDomain obj);
    List<VlanDomain> update(Integer id_vlan, VlanDomain obj);
    List<VlanDomain> create(VlanDomain obj);
}
