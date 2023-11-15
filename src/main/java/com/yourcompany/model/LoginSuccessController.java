package com.yourcompany.model;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
    public class LoginSuccessController {

        @GetMapping("/loginSuccess")
        public String loginSuccess() {
            // Implement logic for a successful login
            return "redirect:/dashboard";
        }
    }


