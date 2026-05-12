package com.example.demo.Repositories;

import com.example.demo.Models.UserRoles;
import com.example.demo.Models.User;

import java.sql.*;

public class JDBCUserRepository implements UserRepository {

    String url = System.getenv("DB_URL");
    String user = System.getenv("DB_USER");
    String password = System.getenv("DB_PASSWORD");

    @Override
    public User findByUsername(String username) {

        String sql = "SELECT * FROM users WHERE username = ?";

        try (Connection connection = DriverManager.getConnection(url, user, password)) {

            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, username);

            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
                return new User(
                        resultSet.getInt("user_id"),
                        resultSet.getString("username"),
                        resultSet.getString("password"),
                        UserRoles.valueOf(resultSet.getString("role"))
                );
            }

        } catch (SQLException e) {
            System.out.println("Der er fejl i findByUsername: " + e.getMessage());
        }

        return null;
    }
}