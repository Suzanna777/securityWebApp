package com.yourcompany.model;

import org.springframework.security.core.GrantedAuthority;

import java.util.Collection;

public class CustomUserDetails implements UserDetails{
    private final User user;


    public CustomUserDetails(User user) {
        this.user = user;

    }

    @Override
    public String getUsername() {
        return user.getUsername();
    }

    @Override
    public String getPassword() {
        return user.getPassword();
    }


    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return user.getAuthorities();
    }

    @Override
    public boolean isAccountNonExpired(){
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return false;
    }

    public boolean isEnabled(){
        return user.isEnabled();
    }

    @Override
    public boolean isCredentialsNonExpired(){
        return true;
    }

    @Override
    public boolean isAccountNotLocked(){
        return true;

    }
@Override
    public boolean isAccountNotExpired(){
        return true;
    }
}
