package com.Simple.Blog.Backend.Simple.Blog.Backend.Controller;

import com.Simple.Blog.Backend.Simple.Blog.Backend.Model.User;
import com.Simple.Blog.Backend.Simple.Blog.Backend.Service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
     private  UserService userService;
    @PutMapping
        public ResponseEntity<User> updateUser(@RequestBody User user){
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        String userName = authentication.getName();
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