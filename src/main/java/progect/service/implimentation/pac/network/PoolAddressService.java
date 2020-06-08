package progect.service.implimentation.pac.network;

import org.apache.catalina.User;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import progect.DTO.network.Pool_address_DTO;
import progect.domain.network.Pool_address_Domain;
import progect.repository.RefStatusRepository;
import progect.repository.network.Pool_address_Repository;
import progect.repository.user.UserRepository;
import progect.service.interfase.pac.network.IPoolAddressService;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class PoolAddressService implements IPoolAddressService {

    @Autowired
    private Pool_address_Repository pool_address_repository;
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private RefStatusRepository refStatusRepository;

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
    public List<Pool_address_DTO> delete(Integer id_pool, Pool_address_DTO obj) {
        try {

            pool_address_repository.findById(id_pool).map(pool_address_domain -> {
                pool_address_domain.setDate_old(new Date());
                pool_address_domain.setId_user_old(userRepository.findById(obj.getId_user_old()).get());
                pool_address_domain.setIs_status(refStatusRepository.findById(2).get());
                return pool_address_repository.save(pool_address_domain);
            });

            return mapperEntityToDTO();
        }
        catch (Exception e){
            System.out.println(e.getMessage());
            return mapperEntityToDTO();
        }
    }

    @Override
    public List<Pool_address_DTO> update(Integer id_pool, Pool_address_DTO new_obj) {
        try {

            pool_address_repository.findById(id_pool).map(pool_address_domain -> {
                pool_address_domain.setDate_old(new Date());
                pool_address_domain.setId_user_old(userRepository.findById(new_obj.getId_user_old()).get());
                pool_address_domain.setIs_status(refStatusRepository.findById(2).get());
                return pool_address_repository.save(pool_address_domain);
            });

            Pool_address_Domain pool_address_domain = new Pool_address_Domain();
            pool_address_domain.setNewPool(
                    new_obj,
                    userRepository.findById(new_obj.getId_user_old()).get(),
                    userRepository.findById(0).get(),
                    refStatusRepository.findById(1).get(),
                    new Date(),
                    null
            );
            pool_address_repository.save(pool_address_domain);
            return mapperEntityToDTO();
        }
        catch (Exception e){
            System.out.println(e.getMessage());
            return mapperEntityToDTO();
        }
    }

    @Override
    public List<Pool_address_DTO> create(Pool_address_DTO obj) {
        try {

            Pool_address_Domain pool_address_domain = new Pool_address_Domain();
            pool_address_domain.setNewPool(
                    obj,
                    userRepository.findById(obj.getId_user_reg()).get(),
                    userRepository.findById(0).get(),
                    refStatusRepository.findById(1).get(),
                    new Date(),
                    null
            );
            pool_address_repository.save(pool_address_domain);
            return mapperEntityToDTO();
        }
        catch (Exception e){
            System.out.println(e.getMessage());
            return mapperEntityToDTO();
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
