package com.yourcompany.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
    @RequestMapping("/com/yourcompany")
    public class MfaController {

        @Autowired
        private MfaService mfaService;

        @PostMapping("/enable")
        public ResponseEntity<String> enableMfa(@RequestParam("userId") Long userId,
                                                @RequestParam("method") MfaMethod mfaMethod) {
            User user = userService.getUserById(userId);
            if (user != null) {
                mfaService.enableMfa(user, mfaMethod);
                return ResponseEntity.ok("MFA enabled successfully");
            } else {
                return ResponseEntity.status(HttpStatus.NOT_FOUND).body("User not found");
            }
        }

        // Other MFA-related endpoints
    }


