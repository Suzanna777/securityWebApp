package com.yourcompany.controller;


    @Controller
    public class LoginController {

        @GetMapping("/login")
        public String login() {
            return "login";
        }
    }


