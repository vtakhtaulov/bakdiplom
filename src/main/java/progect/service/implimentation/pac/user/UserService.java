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
    public List<UsersDomain> delete(Integer obj) {
        try {
            userrepository.delete(obj);
            return userrepository.findAll();
        }catch (Exception e){
            System.out.println(e.getMessage());
            return userrepository.findAll();
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
            if(obj.getFioUser().length() > 0 && obj.getUser_login().length()>0
                && obj.getUser_password().length()>3 && obj.getPhone().length()>0 && obj.getEmail().length()>0) {
                userrepository.save(obj);
                return userrepository.findAll();
            }
            else {
                return userrepository.findAll();
            }
        }
        catch (Exception e) {
             System.out.println(e.getMessage());
             return null;
        }
    }
    @Override
    public UsersDomain loginUserSearch(String login,String password) {
        try {
            return userrepository.findAllByLogin(login, password);
        }catch (Exception e){
            return null;
        }

    }
}
