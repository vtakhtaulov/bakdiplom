package progect.service.implimentation.pac.network;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import progect.DTO.network.Pool_address_DTO;
import progect.domain.network.Pool_address_Domain;
import progect.repository.network.Pool_address_Repository;
import progect.service.interfase.pac.network.IPoolAddressService;

import java.util.ArrayList;
import java.util.List;

@Service
public class PoolAddressService implements IPoolAddressService {

    @Autowired
    private Pool_address_Repository pool_address_repository;

    @Override
    public List<Pool_address_DTO> findAllPool() {
        try {
            return mapperEntityToDTO();
        } catch (Exception e){
            System.out.println(e.getMessage());
            return null;
        }
    }

    @Override
    public Pool_address_DTO readPool(Pool_address_DTO pool_address) {
        return pool_address;
    }

    @Override
    public boolean deletePool(Pool_address_DTO pool) {
       try {
        //pool_address_repository.delete(pool);
        return true;
        } catch (Exception e){
           System.out.println(e.getMessage());
           return false;
        }
    }

    @Override
    public List<Pool_address_DTO> updatePool(Pool_address_DTO pool, Pool_address_DTO new_pool) {
        try {
        BeanUtils.copyProperties(new_pool,pool, "id_pool_address");
            return mapperEntityToDTO();
        } catch (Exception e){
            System.out.println(e.getMessage());
            return null;
        }
    }

    @Override
    public List<Pool_address_DTO> createPool(Pool_address_DTO pool) {
        try {
            //pool_address_repository.save(pool);
           // mapperEntityToDTO();
            return  mapperEntityToDTO();
        }catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    private List<Pool_address_DTO> mapperEntityToDTO()
        {
            List<Pool_address_DTO> listPoolDTO = new ArrayList<>();
            List<Pool_address_Domain> listPoolDom = pool_address_repository.findAll();
            for(int i = 0; i<listPoolDom.size(); i++) {
            Pool_address_Domain pooldom = listPoolDom.get(i);
            listPoolDTO.add(new Pool_address_DTO(pooldom));
            }
        return listPoolDTO;
    }
}
