package com.yourcompany.model;


import com.yourcompany.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
        Optional<User> findByUsername(String username);
        // Additional query methods can be added here if needed

    }


