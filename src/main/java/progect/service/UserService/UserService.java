package progect.service.UserService;


import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import progect.domain.user.UsersDomain;
import progect.repository.user.UserRepository;
import java.util.ArrayList;
import java.util.List;

@Service
public class UserService implements IUserService {
    @Autowired
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<UsersDomain> getAllUsers() {
        List<UsersDomain> users = userRepository.findAll();
        return users;
    }

    @Override
    public UsersDomain getOneUsers(UsersDomain users) {
        return users;
    }

    @Override
    public void deleteUsers(UsersDomain users) {
        userRepository.delete(users);
    }

    @Override
    public List<UsersDomain> updateUser(UsersDomain users, UsersDomain newuser) {
        BeanUtils.copyProperties(newuser, users,"user_id" );
        return userRepository.findAll();
    }

    @Override
    public List<UsersDomain> AddUser(UsersDomain users) {
        try {
            userRepository.save(users);
            return userRepository.findAll();
        }
        catch (Exception e) {
             System.out.println(e.getMessage());
             return new ArrayList<>();
        }
    }
}
