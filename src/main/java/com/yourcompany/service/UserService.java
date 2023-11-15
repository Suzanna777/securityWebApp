package com.yourcompany.service;

import com.yourcompany.model.User;

import java.util.List;

public interface UserService {
    User getUserById(Long userId);
    List<User> getAllUsers();
    void createUser(UserDTO userDTO);
    void updateUser(Long userId, UserDTO userDTO);
    void deleteUser(Long userId);
}
