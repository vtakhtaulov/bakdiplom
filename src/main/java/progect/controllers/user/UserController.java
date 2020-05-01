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
    public boolean delete(@PathVariable("user_id") UsersDomain obj) {
           return userservice.delete(obj);
    }

    @RequestMapping(value = "/UpdateUser/{user_id}", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public List<UsersDomain> update(@PathVariable("user_id") UsersDomain obj, @RequestBody UsersDomain new_obj) {
        return userservice.update(obj, new_obj);
    }
    @RequestMapping(value = "/AddUser", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public List<UsersDomain> create (@RequestBody UsersDomain obj){
            return userservice.create(obj);
    }

    @RequestMapping(value = "/loginUser", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public UsersDomain loginUserSearch (@RequestParam(value = "user_login") String login, @RequestParam (value = "user_password") String password){
        System.out.println(login +" "+password);
        return userservice.loginUserSearch(login, password);
    }
}



