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
    public List<Dhcp_poolDomain> findAllDHCP() {
        try {
            return dhсp_poolRepository.findAll();
        } catch (Exception e){
            System.out.println(e.getMessage());
            return null;
        }
    }

    @Override
    public Dhcp_poolDomain readDHCP(Dhcp_poolDomain pool_address) {
        return null;
    }

    @Override
    public boolean deleteDHCP(Dhcp_poolDomain pool) {
        return false;
    }

    @Override
    public List<Dhcp_poolDomain> updateDHCP(Dhcp_poolDomain pool, Dhcp_poolDomain new_pool) {
        try {
            BeanUtils.copyProperties(new_pool,pool, "id_DHСP_pool");
            return dhсp_poolRepository.findAll();
        } catch (Exception e){
            System.out.println(e.getMessage());
            return null;
        }
    }

    @Override
    public List<Dhcp_poolDomain> createDHCP(Dhcp_poolDomain pool) {
        try {
            dhсp_poolRepository.save(pool);
            return dhсp_poolRepository.findAll();
        } catch (Exception e){
            System.out.println(e.getMessage());
            return null;
        }
    }
}
