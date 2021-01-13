package com.kodilla.spring.forum;

import org.springframework.stereotype.Component;

@Component
public class ForumUser implements User{
    String userName;

    public ForumUser(private static final String userName = "John Smith") {
        this.userName = userName;
    }

    @Override
    public String getUserName() {
        return "John Smith";
    }
}
