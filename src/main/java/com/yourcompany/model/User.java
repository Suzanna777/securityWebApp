package com.yourcompany.model;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import java.util.Collection;
import java.util.Collections;

@Entity
public class User implements UserDetails {
    // User.java
        private String username;
        private String password;

        private Long id;

    public long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setId(long id) {
        this.id = id;
    }


    public User(String username, String password, long id, boolean mfaEnabled, MfaMethod mfaMethod) {
        this.username = username;
        this.password = password;
        this.id = id;
        this.mfaEnabled = mfaEnabled;
        this.mfaMethod = mfaMethod;
    }




    private boolean mfaEnabled;

    public boolean isMfaEnabled() {
        return mfaEnabled;
    }

    public void setMfaEnabled(boolean mfaEnabled) {
        this.mfaEnabled = mfaEnabled;
    }

    public MfaMethod getMfaMethod() {
        return mfaMethod;
    }

    public void setMfaMethod(MfaMethod mfaMethod) {
        this.mfaMethod = mfaMethod;
    }

    @Enumerated(EnumType.STRING)
    private MfaMethod mfaMethod;

        // Constructors, getters, and setters

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    @Override
    public boolean isAccountNonExpired() {
        return false;
    }

    @Override
    public boolean isAccountNonLocked() {
        return false;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return false;
    }

    @Override
    public boolean isEnabled() {
        return false;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        // Define user authorities
        return Collections.singleton(new SimpleGrantedAuthority("ROLE_USER"));
    }

    public void setHashedPassword(String hashedPassword){

    }
}


