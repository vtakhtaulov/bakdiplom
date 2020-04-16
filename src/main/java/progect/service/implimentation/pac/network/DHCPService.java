package progect.service.implimentation.pac.network;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import progect.domain.network.Dhcp_poolDomain;
import progect.repository.network.DHСP_poolRepository;
import progect.service.interfase.pac.network.IDHCPService;

import java.util.List;

@Service
public class DHCPService implements IDHCPService {
    @Autowired
    private DHСP_poolRepository dhсp_poolRepository;

    @Override
    public List<Dhcp_poolDomain> findAll() {
        try {
            return dhсp_poolRepository.findAll();
        } catch (Exception e){
            System.out.println(e.getMessage());
            return null;
        }
    }

    @Override
    public Dhcp_poolDomain read(Dhcp_poolDomain pool_obj) {
        return null;
    }

    @Override
    public boolean delete(Dhcp_poolDomain obj) {
        return false;
    }

    @Override
    public List<Dhcp_poolDomain> update(Dhcp_poolDomain obj, Dhcp_poolDomain new_obj) {
        try {
            BeanUtils.copyProperties(new_obj,obj, "id_DHСP_pool");
            return dhсp_poolRepository.findAll();
        } catch (Exception e){
            System.out.println(e.getMessage());
            return null;
        }
    }

    @Override
    public List<Dhcp_poolDomain> create(Dhcp_poolDomain obj) {
        try {
            dhсp_poolRepository.save(obj);
            return dhсp_poolRepository.findAll();
        } catch (Exception e){
            System.out.println(e.getMessage());
            return null;
        }
    }
}
