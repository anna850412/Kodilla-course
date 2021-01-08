package com.kodilla.stream.exercise;

import java.time.LocalDate;
import java.util.Map;
import java.util.stream.Collectors;

public class Application {
    public static void main (String [] args){
PoemBeautifier poemBeautifier = new PoemBeautifier();
poemBeautifier.beautify("Hello Wolrd", String::toUpperCase);
poemBeautifier.beautify("My name is Anna",(text) -> "ABC" + text + "ABC");

        Forum forum = new Forum();
        forum.getUserList().stream()
                .filter(s -> s.getSex() == 'M')
                .filter(n -> n.getDateOfBirth().isBefore(LocalDate.now().minusYears(20)))
                .filter(i -> i.getPublishedPostNumber()>=1)
                .forEach(v -> System.out.println(v));

                Map<Integer, ForumUser> forumMap = forum.getUserList().stream()
                 .filter(forumUser -> forumUser.getSex() == 'M')
                 .filter(forumUser -> forumUser.getDateOfBirth().isBefore(LocalDate.now().minusYears(20)))
                 .filter(forumUser -> forumUser.getPublishedPostNumber()>=1)
                 .collect(Collectors.toMap(ForumUser::getLoginID,forumUser -> forumUser));

                System.out.println("#elements :" + forumMap.size());
                forumMap.entrySet().stream()
                        .forEach(System.out::println);
    }
}
