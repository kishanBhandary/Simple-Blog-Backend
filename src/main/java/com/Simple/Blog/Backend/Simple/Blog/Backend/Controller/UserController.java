package com.Simple.Blog.Backend.Simple.Blog.Backend.Controller;

import com.Simple.Blog.Backend.Simple.Blog.Backend.Model.User;
import com.Simple.Blog.Backend.Simple.Blog.Backend.Service.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
     private  UserService userService;
    @PostMapping
        public void addUser(User user){
            userService.addUser(user);
        }
    @PutMapping
    public List<User> updateUser(User user){
        userService
    }
}