package com.example.hei.security;

import com.example.hei.entity.User;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;

import java.util.Collection;

public class CurrentUser extends org.springframework.security.core.userdetails.User {

    private User user;

    public CurrentUser(User user) {
        super(user.getEmail(), user.getPassword(), AuthorityUtils.NO_AUTHORITIES);
        this.user = user;
    }

    public User getUser() {
        return user;
    }

}
