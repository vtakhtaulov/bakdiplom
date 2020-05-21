package progect.controllers.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import progect.domain.user.UsersDomain;
import progect.service.interfase.pac.user.IUserService;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping(value = "/User/")
public class UserController  {
    @Autowired
    private IUserService userservice;

    @RequestMapping(value = "/AllUser", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public List<UsersDomain> findAll() {
            return userservice.findAll();
    }

    @RequestMapping(value = "/SearchUser/{user_id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public UsersDomain read(@PathVariable("user_id") UsersDomain obj) {
        return userservice.read(obj);
    }

    @RequestMapping(value = "/DeleteUser/{user_id}", method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public List<UsersDomain> delete(@PathVariable("user_id") Integer obj) {
        try {
            return userservice.delete(obj);
        }
        catch (Exception e){
            return  userservice.findAll();
        }
    }

    @RequestMapping(value = "/UpdateUser/{user_id}", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public List<UsersDomain> update(@RequestBody UsersDomain obj,
                                    @PathVariable("user_id") Integer user_id) {
        return userservice.update(obj, user_id);
    }
    @RequestMapping(value = "/AddUser", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public List<UsersDomain> create (@RequestBody UsersDomain obj){
        try {
            return userservice.create(obj);
        }
        catch (Exception e){
            return userservice.findAll();
        }
    }

    @RequestMapping(value = "/loginUser", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public UsersDomain loginUserSearch (@RequestParam(value = "user_login") String login, @RequestParam (value = "user_password") String password){
        return userservice.loginUserSearch(login, password);
    }
}



