package com.example.demo.Services;

import com.example.demo.Models.User;
import com.example.demo.Repositories.JDBCUserRepository;
import com.example.demo.Repositories.UserRepository;

public class UserService {

    private UserRepository userRepository;

    public UserService() {
        this.userRepository = new JDBCUserRepository();
    }

    public User login(String username, String password) {

        User user = userRepository.findByUsername(username);

        if (user != null && user.getPassword().equals(password)) {
            return user;
        }

        return null;
    }
}