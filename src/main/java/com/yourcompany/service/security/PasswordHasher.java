package com.yourcompany.service.security;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

    public class PasswordHasher {
        private final BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

        public String hashPassword(String plainPassword) {
            return passwordEncoder.encode(plainPassword);
        }

        public boolean checkPassword(String plainPassword, String hashedPassword) {
            return passwordEncoder.matches(plainPassword, hashedPassword);
        }
    }


