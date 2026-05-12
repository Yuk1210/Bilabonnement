package com.example.demo.Models;

import javax.management.relation.Role;

public class User {
    private int user_id;
    private String username;
    private String password;
    private UserRoles role;

    public User(int user_id, String username,String password, UserRoles role){
        this.user_id = user_id;
        this.username = username;
        this.password = password;
        this.role = role;
    }

    public int getUser_Id() {
        return user_id;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public UserRoles getRole() {
        return role;
    }
}
