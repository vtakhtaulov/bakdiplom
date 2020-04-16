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
    public List<Pool_address_DTO> findAll() {
        try {
            return mapperEntityToDTO();
        } catch (Exception e){
            System.out.println(e.getMessage());
            return null;
        }
    }

    @Override
    public Pool_address_DTO read(Pool_address_DTO obj) {
        return obj;
    }

    @Override
    public boolean delete(Pool_address_DTO obj) {
       try {
        //pool_address_repository.delete(pool);
        return true;
        } catch (Exception e){
           System.out.println(e.getMessage());
           return false;
        }
    }

    @Override
    public List<Pool_address_DTO> update(Pool_address_DTO obj, Pool_address_DTO new_obj) {
        try {
        BeanUtils.copyProperties(new_obj,obj, "id_pool_address");
            return mapperEntityToDTO();
        } catch (Exception e){
            System.out.println(e.getMessage());
            return null;
        }
    }

    @Override
    public List<Pool_address_DTO> create(Pool_address_DTO obj) {
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
            List<Pool_address_DTO> listDTO = new ArrayList<>();
            List<Pool_address_Domain> listDom = pool_address_repository.findAll();
            for(int i = 0; i<listDom.size(); i++) {
            Pool_address_Domain obj_dom = listDom.get(i);
            listDTO.add(new Pool_address_DTO(obj_dom));
            }
        return listDTO;
    }
}
