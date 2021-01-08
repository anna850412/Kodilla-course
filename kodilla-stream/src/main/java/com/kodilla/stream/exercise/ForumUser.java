package com.kodilla.stream.exercise;

import java.time.LocalDate;

public class ForumUser {
    private int LoginID;
        private String name;
    private char sex;
    private LocalDate birthDate;
    private int publishedPostNumber;

    public ForumUser(int loginID, char sex, String name, int yearOfBirth,
                     int monthOfBirth, int dayOfBirth, int publishedPostNumber) {
        LoginID = loginID;

        this.name = name;
        this.sex = sex;
        this.birthDate = LocalDate.of(yearOfBirth, monthOfBirth, dayOfBirth);
        this.publishedPostNumber = publishedPostNumber;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "LoginID=" + LoginID +

                ", name='" + name + '\'' +
                ", sex=" + sex +
                ", dateOfBirth=" + birthDate +
                ", publishedPostNumber=" + publishedPostNumber +
                '}';
    }

    public int getLoginID() {
        return LoginID;
    }

    public char getSex() {
        return sex;
    }

    public String getName() {
        return name;
    }

    public LocalDate getDateOfBirth() {
        return birthDate;
    }

    public int getPublishedPostNumber() {
        return publishedPostNumber;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
