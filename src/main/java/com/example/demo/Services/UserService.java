package com.example.demo.Services;

import com.example.demo.Models.User;
import com.example.demo.Repositories.JDBCUserRepository;
import com.example.demo.Repositories.UserRepository;

public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User login(String username, String password) {

        User user = userRepository.findByUsername(username);

        if (user != null && user.getPassword().equals(password)) {
            return user;
        }

        return null;
    }
}