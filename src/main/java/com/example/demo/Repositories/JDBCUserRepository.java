package com.example.demo.Repositories;

import com.example.demo.Models.UserRoles;
import com.example.demo.Models.User;
import org.springframework.stereotype.Repository;

import java.sql.*;
@Repository
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
    @Override
    public void save(User userObj) {
        String sql = "INSERT INTO user (username, password) VALUES (?, ?)";

        try (Connection connection = DriverManager.getConnection(url, user, password);
             PreparedStatement statement = connection.prepareStatement(sql)) {

            statement.setString(1, userObj.getUsername());
            statement.setString(2, userObj.getPassword());

            statement.executeUpdate();

        } catch (SQLException e) {
            System.out.println("fejl: kunne ikke gemme bruger " + e.getMessage());
        }
    }
}