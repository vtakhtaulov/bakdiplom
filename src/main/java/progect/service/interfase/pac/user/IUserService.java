package progect.service.interfase.pac.user;

import progect.DTO.user.UserDTO;
import progect.domain.user.UsersDomain;

import java.util.List;

public interface IUserService {
    List<UsersDomain> getAllUsers();
    UsersDomain getOneUsers(UsersDomain users);
    boolean deleteUsers(UsersDomain users);
    List<UsersDomain> updateUser (UsersDomain users,UsersDomain newusers);
    List<UsersDomain> AddUser (UsersDomain users);
    List<UserDTO> testuser ();
}
