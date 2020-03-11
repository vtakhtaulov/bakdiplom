package progect.service.UserService;

import progect.DTO.UserDTO;
import progect.domain.UsersDomain;

import java.util.List;

public interface IUserService {
    List<UsersDomain> getAllUsers();
    UsersDomain getOneUsers(UsersDomain users);
    void deleteUsers(UsersDomain users);
    List<UsersDomain> updateUser (UsersDomain users,UsersDomain newusers);
    List<UsersDomain> AddUser (UsersDomain users);
}
