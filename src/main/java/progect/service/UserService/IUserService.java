package progect.service.UserService;

import progect.domain.user.UsersDomain;

import java.util.List;

public interface IUserService {
    List<UsersDomain> getAllUsers();
    UsersDomain getOneUsers(UsersDomain users);
    void deleteUsers(UsersDomain users);
    List<UsersDomain> updateUser (UsersDomain users,UsersDomain newusers);
    List<UsersDomain> AddUser (UsersDomain users);
}
