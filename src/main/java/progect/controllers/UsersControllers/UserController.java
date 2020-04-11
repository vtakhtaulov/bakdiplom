package progect.controllers.UsersControllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import progect.domain.user.UsersDomain;
import progect.repository.user.UserRepository;
import progect.service.UserService.UserService;

import java.util.*;

@RestController
@CrossOrigin("*")
@RequestMapping(value = "/User/")
public class UserController  {
    @Autowired
    private UserRepository userRepository;

    @RequestMapping(value = "/AllUser", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public List<UsersDomain> getAllUsers() {
        try {

            //List<UsersDomain> users = userRepository.findAll();
           // Map<Integer, UsersDomain> mapuser = userRepository.allUser();
            List<UsersDomain> users = userRepository.findAll() ;

            return users;
        }
        catch (Exception e){
            System.out.println(e.getMessage());
            return null;
        }
    }

    @RequestMapping(value = "/SearchUser/{user_id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public UsersDomain getOneUsers(@PathVariable("user_id") UsersDomain users) {
        try {
        return new UserService(userRepository).getOneUsers(users);
       }
        catch (Exception e){
        System.out.println(e.getMessage());
        return null;
      }
    }

    @RequestMapping(value = "/DeleteUser/{user_id}", method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public boolean deleteUsers(@PathVariable("user_id") UsersDomain users) {
        try{
            new UserService(userRepository).deleteUsers(users);
        return true;
        }
        catch (Exception e){
        return false;
        }
    }

    @RequestMapping(value = "/UpdateUser/{user_id}", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public List<UsersDomain> updateUser(@PathVariable("user_id") UsersDomain users, @RequestBody UsersDomain newuser) {
        List<UsersDomain> user = new UserService(userRepository).updateUser(users, newuser);
        return user;
    }
    @RequestMapping(value = "/AddUser", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public List<UsersDomain> AddUser (@RequestBody UsersDomain users){
        try {
            List<UsersDomain> listUser = new UserService(userRepository).AddUser(users);
            return listUser;
        }
        catch (Exception e){
            System.out.println(users.toString());
            return new ArrayList<>();
        }
    }
}



