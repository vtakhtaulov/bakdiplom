package progect.controllers.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import progect.DTO.user.UserDTO;
import progect.domain.user.UsersDomain;
import progect.service.interfase.pac.user.IUserService;

import java.util.*;

@RestController
@CrossOrigin("*")
@RequestMapping(value = "/User/")
public class UserController  {
    @Autowired
    private IUserService userservice;

    @RequestMapping(value = "/AllUser", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public List<UsersDomain> getAllUsers() {
            return userservice.getAllUsers();
    }

    @RequestMapping(value = "/SearchUser/{user_id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public UsersDomain getOneUsers(@PathVariable("user_id") UsersDomain users) {
        return userservice.getOneUsers(users);
    }

    @RequestMapping(value = "/DeleteUser/{user_id}", method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public boolean deleteUsers(@PathVariable("user_id") UsersDomain users) {
           return userservice.deleteUsers(users);
    }

    @RequestMapping(value = "/UpdateUser/{user_id}", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public List<UsersDomain> updateUser(@PathVariable("user_id") UsersDomain users, @RequestBody UsersDomain newuser) {
        return userservice.updateUser(users, newuser);
    }
    @RequestMapping(value = "/AddUser", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public List<UsersDomain> AddUser (@RequestBody UsersDomain users){
            return userservice.AddUser(users);
    }


    @RequestMapping(value = "/testuser", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public List<UserDTO> testuser() {
        return userservice.testuser();
    }
}



