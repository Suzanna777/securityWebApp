package com.yourcompany.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.session.SessionRegistry;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
    public class SessionMonitoringController {

        @Autowired
        private SessionRegistry sessionRegistry;

        @GetMapping("/active-sessions")
        public String getActiveSessions(Model model) {
            List<Object> principals = sessionRegistry.getAllPrincipals();
            model.addAttribute("activeUsers", principals.size());
            return "active-sessions";
        }
    }

