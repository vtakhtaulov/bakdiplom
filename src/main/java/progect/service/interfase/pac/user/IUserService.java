package progect.service.interfase.pac.user;

import progect.domain.user.UsersDomain;

import java.util.List;

public interface IUserService {
    List<UsersDomain> findAll();
    UsersDomain read(UsersDomain obj);
    boolean delete(UsersDomain obj);
    List<UsersDomain> update(UsersDomain obj,UsersDomain new_obj);
    List<UsersDomain> create(UsersDomain obj);
}
