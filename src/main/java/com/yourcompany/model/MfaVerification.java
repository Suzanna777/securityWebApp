package com.yourcompany.model;

import com.yourcompany.model.User;

public class MfaVerification {


        public boolean verifyMfa(User user, String code) {
            switch (user.getMfaMethod()) {
                case SMS:
                    return verifySmsMfa(user, code);
                case EMAIL:
                    return verifyEmailMfa(user, code);
                case AUTHENTICATOR_APP:
                    return verifyAuthenticatorAppMfa(user, code);
                default:
                    return false;
            }
        }
    public boolean verifySmsMfa(User user, String code) {
        // Retrieve the stored secret for the user (this should be securely stored)
        String secret = user.getMfaSecret();

        // Use a library to validate the provided code against the stored secret
        boolean isValid = SmsMfaValidator.validateCode(secret, code);

        if (isValid) {
            // Update the user's last MFA verification timestamp or perform other actions
            user.setLastMfaVerification(LocalDateTime.now());
            userService.saveUser(user);
        }

        return isValid;
    }
    public boolean verifyEmailMfa(User user, String code) {
        // Retrieve the stored secret for the user (this should be securely stored)
        String secret = user.getMfaSecret();

        // Use a library to validate the provided code against the stored secret
        boolean isValid = EmailMfaValidator.validateCode(secret, code);

        if (isValid) {
            // Update the user's last MFA verification timestamp or perform other actions
            user.setLastMfaVerification(LocalDateTime.now());
            userService.saveUser(user);
        }

        return isValid;
    }
    public boolean verifyAuthenticatorAppMfa(User user, String code) {
        // Retrieve the stored secret for the user (this should be securely stored)
        String secret = user.getMfaSecret();

        // Use a library to validate the provided code against the stored secret
        boolean isValid = AuthenticatorAppMfaValidator.validateCode(secret, code);

        if (isValid) {
            // Update the user's last MFA verification timestamp or perform other actions
            user.setLastMfaVerification(LocalDateTime.now());
            userService.saveUser(user);
        }

        return isValid;
    }

        // Implement methods for verifying MFA based on the chosen method
        // (verifySmsMfa, verifyEmailMfa, verifyAuthenticatorAppMfa)
    }


