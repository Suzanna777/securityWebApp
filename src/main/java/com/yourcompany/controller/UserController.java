// UserController.java
package com.yourcompany.controller;

import com.yourcompany.model.User;
import com.yourcompany.model.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/register")
public class UserController extends HttpServlet {

    private final UserService userService = new UserService();

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Process registration form submission
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        // Validate input (you may want to add more validation)
        if (username == null || password == null || username.isEmpty() || password.isEmpty()) {
            // Handle invalid input
            response.sendRedirect(request.getContextPath() + "/register?error=invalidInput");
            return;
        }

        // Create a new user
        User newUser = new User("suzanna","Ruslan");
        newUser.setUsername(username);
        newUser.setPassword(password);

        // Register the user (which includes hashing the password)
        userService.registerUser(newUser);

        // Redirect to a success page
        response.sendRedirect(request.getContextPath() + "/success");
    }
}



