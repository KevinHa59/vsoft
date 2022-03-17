package com.vsoft.account_management.service;

import com.vsoft.account_management.model.User;
import com.vsoft.account_management.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User Login(String username, String password){
        return userRepository.findUserByUsernameAndPassword(username, password);
    }

    public User Register(User user){
        return userRepository.save(user);
    }

    public List<User> getUsers(){
        return userRepository.findAll();
    }
}
