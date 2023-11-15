package com.yourcompany.model;

import com.yourcompany.service.security.PasswordHasher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class UserService {
        private final PasswordHasher passwordHasher = new PasswordHasher();

        @Autowired
        private UserRepository userRepository;
        public void registerUser(User user) {
            // Hash the user's password before storing it
            String hashedPassword = passwordHasher.hashPassword(user.getPassword());
            user.setHashedPassword(hashedPassword);

            userRepository.save(user);

            // Save the user (this is a simplified example)
            // userRepository.save(user);
        }

        // Other user-related methods
    }



