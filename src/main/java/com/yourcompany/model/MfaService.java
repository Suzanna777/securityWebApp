package com.yourcompany.model;

import com.yourcompany.model.User;
import com.yourcompany.model.UserService;

public class MfaService {
    private UserService userService;

    public void enableMfa(User user, MfaMethod mfaMethod){
        user.setMfaEnabled(true);
        user.setMfaMethod(mfaMethod);
        userService.saveUser(user);

    }
}
// Other MFA-related methods