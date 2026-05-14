package com.example.demo.Services;
import com.example.demo.Models.User;
import com.example.demo.Repositories.JDBCUserRepository;
import com.example.demo.Repositories.UserRepository;
import org.springframework.stereotype.Service;


@Service
public class UserService {
    private JDBCUserRepository userRepository = new JDBCUserRepository();
    public User login(String username, String password, String email) {

        if(!email.contains("@") ||
                !email.contains(".")) {

            System.out.println("Ugyldig email");
            return null;
        }

        if(password.length() < 8) {
            System.out.println("Password skal være mindst 8 tegn");
            return null;
        }

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
    this.userRepository = userRepository;
    }
        User user = userRepository.findByUsername(username);

        if(user != null && user.getPassword().equals(password)) {
            return user;
        }
        return null;
    }
}