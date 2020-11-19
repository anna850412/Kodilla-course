package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public final class ForumUser {
    private final int idNumber;
    private final String name;
    private final char sex;
    private final LocalDate birthDate;
    private final int publishedPostNumber;

    public ForumUser(int idNumber, String name, char sex, int yearOfBirth,
                     int monthOfBirth, int dayOfBirth, int publishedPostNumber) {
        this.idNumber = idNumber;
        this.name = name;
        this.sex = sex;
        this.birthDate = LocalDate.of(yearOfBirth, monthOfBirth, dayOfBirth);
        this.publishedPostNumber = publishedPostNumber;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public String getName() {
        return name;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public int getPublishedPostNumber() {
        return publishedPostNumber;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "idNumber=" + idNumber +
                ", name='" + name + '\'' +
                ", sex=" + sex +
                ", dateOfBirth=" + birthDate +
                ", publishedPostNumber=" + publishedPostNumber +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ForumUser)) return false;

        ForumUser forumUser = (ForumUser) o;

        if (getIdNumber() != forumUser.getIdNumber()) return false;
        if (getSex() != forumUser.getSex()) return false;
        if (getPublishedPostNumber() != forumUser.getPublishedPostNumber()) return false;
        if (!getName().equals(forumUser.getName())) return false;
        return getBirthDate().getYear()==(forumUser.getBirthDate().getYear());
    }

    @Override
    public int hashCode() {
        int result = getIdNumber();
        result = 31 * result + getName().hashCode();
        result = 31 * result + (int) getSex();
        result = 31 * result + birthDate.getYear()*100;
        result = 31 * result + getPublishedPostNumber();
        return result;
    }
}
