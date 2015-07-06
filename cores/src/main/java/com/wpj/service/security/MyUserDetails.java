/*
 * Copyright (c) 2015 /5 /12
 * 	      7 :45 : 9
 *               Byï¼šwupeiji
 *               Q  Qï¼?757671834
 * 	      It is not easy to meet each other in such a big world
 */

package com.wpj.service.security;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

import java.util.Collection;

/**
 * Created by wpj on 2015/3/27.
 * ×÷Õß£ºÎâÅà»ù
 */
@Component
public class MyUserDetails implements UserDetails {

    private String username;
    private String password;
    private boolean enabled;
    private Collection<? extends GrantedAuthority>  authorities;
    public void setPassword(String password) {
        this.password = password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public void setAuthorities( Collection<? extends GrantedAuthority>   authorities) {
        this.authorities = authorities;
    }


    public Collection<? extends GrantedAuthority> getAuthorities() {
        return authorities;
    }

    public String getPassword() {
        return password;
    }

    public String getUsername() {
        return username;
    }

    public boolean isAccountNonExpired() {
        return enabled;
    }

    public boolean isAccountNonLocked() {
        return enabled;
    }

    public boolean isCredentialsNonExpired() {
        return enabled;
    }

    public boolean isEnabled() {
        return enabled;
    }
}
