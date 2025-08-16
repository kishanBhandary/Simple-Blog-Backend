package com.Simple.Blog.Backend.Simple.Blog.Backend.Controller;

import com.Simple.Blog.Backend.Simple.Blog.Backend.Model.User;
import com.Simple.Blog.Backend.Simple.Blog.Backend.Service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
     private  UserService userService;
    @PutMapping("/{userName}")
        public ResponseEntity<User> updateUser(@RequestBody User user, @PathVariable String userName){


        User byUserName = userService.findByUserName(userName);
        if(byUserName!=null){
            byUserName.setUserName(user.getUserName());
            byUserName.setPassword(user.getPassword());
            userService.addUser(byUserName);
            return new ResponseEntity<>(byUserName, HttpStatus.OK);
        }
        else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}