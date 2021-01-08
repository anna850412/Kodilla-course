package com.kodilla.good.patterns.challenges.order;

public class User {
    private String userName;
    private String nickName;

    public User(String userName, String nickName) {
        this.userName = userName;
        this.nickName = nickName;
    }

    public String getUserName() {
        return userName;
    }

    public String getNickName() {
        return nickName;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", nickName='" + nickName + '\'' +
                '}';
    }
}
