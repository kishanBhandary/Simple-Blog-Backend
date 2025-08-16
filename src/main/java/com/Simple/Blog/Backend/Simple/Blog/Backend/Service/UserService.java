package com.Simple.Blog.Backend.Simple.Blog.Backend.Service;

import com.Simple.Blog.Backend.Simple.Blog.Backend.Model.User;
import com.Simple.Blog.Backend.Simple.Blog.Backend.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UserService {
    @Autowired
    private UserRepository userRepository;

    public void addUser(User user){
        userRepository.save(user);
    }
    public List<User> getAllUser(){
        return userRepository.findAll();
    }

}
