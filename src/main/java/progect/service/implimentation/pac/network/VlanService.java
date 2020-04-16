package progect.service.implimentation.pac.network;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import progect.domain.network.VlanDomain;
import progect.repository.network.VlanRepository;
import progect.service.interfase.pac.network.IVlanService;

import java.util.List;

@Service
public class VlanService implements IVlanService {

    @Autowired
    private VlanRepository vlanRepository;

    @Override
    public List<VlanDomain> findAll() {
        return vlanRepository.findAll();
    }

    @Override
    public VlanDomain read(VlanDomain obj) {
        return null;
    }

    @Override
    public boolean delete(VlanDomain obj) {
        return false;
    }

    @Override
    public List<VlanDomain> update(VlanDomain obj, VlanDomain new_obj) {
        return vlanRepository.findAll();
    }

    @Override
    public List<VlanDomain> create(VlanDomain obj) {
        return vlanRepository.findAll();
    }
}
