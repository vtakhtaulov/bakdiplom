package progect.service.implimentation.pac.user;


import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import progect.domain.user.UsersDomain;
import progect.repository.user.UserRepository;
import progect.service.interfase.pac.user.IUserService;

import java.util.List;

@Service
public class UserService implements IUserService {
    @Autowired
    private UserRepository userrepository;

    @Override
    public List<UsersDomain> findAll() {
        try {
            return userrepository.findAll();
        } catch (Exception e){
            System.out.println(e.getMessage());
            return null;
        }
    }

    @Override
    public UsersDomain read(UsersDomain obj) {
       try {
           return obj;
       }catch (Exception e) {
           System.out.println(e.getMessage());
           return null;
       }
    }

    @Override
    public boolean delete(UsersDomain obj) {
        try {
            userrepository.delete(obj);
            return true;
        }catch (Exception e){
            System.out.println(e.getMessage());
            return false;
        }
    }

    @Override
    public List<UsersDomain> update(UsersDomain obj, UsersDomain new_obj) {
        BeanUtils.copyProperties(new_obj, obj,"user_id" );
        return userrepository.findAll();
    }

    @Override
    public List<UsersDomain> create(UsersDomain obj) {
        try {
            userrepository.save(obj);
            return userrepository.findAll();
        }
        catch (Exception e) {
             System.out.println(e.getMessage());
             return null;
        }
    }
}
