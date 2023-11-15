package com.yourcompany.listener;


import org.springframework.stereotype.Component;

@Component
    public class SessionExpirationListener implements ApplicationListener<SessionExpiredEvent> {

        @Override
        public void onApplicationEvent(SessionExpiredEvent event) {
            // Custom logic for handling session expiry
            // ...
        }
    }


