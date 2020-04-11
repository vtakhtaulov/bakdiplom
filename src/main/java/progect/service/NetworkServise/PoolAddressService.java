package progect.service.NetworkServise;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import progect.domain.network.Pool_address_Domain;
import progect.repository.network.Pool_address_Repository;

import java.util.ArrayList;
import java.util.List;

@Service
public class PoolAddressService implements IPoolAddressService {

    @Autowired
    private Pool_address_Repository pool_address_repository;


    @Override
    public List<Pool_address_Domain> getAllPool() {
        return new ArrayList<Pool_address_Domain>(pool_address_repository.findAll());
    }

    @Override
    public Pool_address_Domain getOnePool(Pool_address_Domain pool_address) {
        return pool_address;
    }

    @Override
    public void deletePool(Pool_address_Domain pool) {
        pool_address_repository.delete(pool);
    }

    @Override
    public List<Pool_address_Domain> updatePool(Pool_address_Domain pool, Pool_address_Domain new_pool) {
        BeanUtils.copyProperties(new_pool,pool, "id_pool_address");
        return null;
    }

    @Override
    public List<Pool_address_Domain> AddPool(Pool_address_Domain pool) {
        try {
            pool_address_repository.save(pool);
            return pool_address_repository.findAll();
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
            return new ArrayList<>();
        }
    }
}
