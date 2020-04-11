package progect.service.UserService;


import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import progect.domain.user.UsersDomain;
import progect.repository.user.UserRepository;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

@Service
public class UserService implements IUserService {
    @Autowired
    private UserRepository userrepository;

    @Override
    public List<UsersDomain> getAllUsers() {
        try {
            return userrepository.findAll();
        }
        catch (Exception e){
            return null;
        }
    }

    @Override
    public UsersDomain getOneUsers(UsersDomain users) {
       try {
           return users;
       }catch (Exception e) {
           return null;
       }
    }

    @Override
    public boolean deleteUsers(UsersDomain users) {
        try {
            userrepository.delete(users);
            return true;
        }catch (Exception e){
            return false;
        }
    }

    @Override
    public List<UsersDomain> updateUser(UsersDomain users, UsersDomain newuser) {
        BeanUtils.copyProperties(newuser, users,"user_id" );
        return userrepository.findAll();
    }

    @Override
    public List<UsersDomain> AddUser(UsersDomain users) {
        try {
            userrepository.save(users);
            return userrepository.findAll();
        }
        catch (Exception e) {
             System.out.println(e.getMessage());
             return new ArrayList<>();
        }
    }
}
