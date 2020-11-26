package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.beautifier.PoemDecorator;
import com.kodilla.stream.calculator.Calculator;
import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class StreamMain {
    public static void main(String[] args) {
        PoemBeautifier poemBeautifier = new PoemBeautifier();
        poemBeautifier.beautify("Welcome in my World", (text) -> "ABC" + " " + text + " " + "ABC");
        poemBeautifier.beautify("My Name is Anna", String::toUpperCase);
        poemBeautifier.beautify("nothing is important in this sentence", (text) -> text.toLowerCase());
        poemBeautifier.beautify("Welcome in my World", (text) ->text.replace("World", "Life"));

        Calculator calculator = new Calculator();
        calculator.calculate(5,2, (a,b)-> a +b);
        calculator.calculate(5,2, (a,b)-> a *b);

        List<ForumUser> forumUserList;
        ForumUser forumUser1 = new ForumUser(1,"Smith",'M',2000,3,25,0);
        ForumUser forumUser2 = new ForumUser(2,"Wnuk",'K',1990,1,1,3);
        ForumUser forumUser3 = new ForumUser(3,"Kowalski",'M',2005,9,12,10);
        ForumUser forumUser4 = new ForumUser(4,"Herr",'M',1999,4,26,4);

        Forum theForum = new Forum();
        theForum.getUserList().stream()
                .filter(forumUser -> forumUser.getSex() == 'M')
                .filter(forumUser -> forumUser.getBirthDate().isBefore(LocalDate.now().minusYears(20)))
                .filter(forumUser -> forumUser.getPublishedPostNumber() >= 1)
                .forEach(v -> System.out.println(v));

        Map<Integer, ForumUser> theForumMap = theForum.getUserList().stream()
                .filter(forumUser -> forumUser.getSex() == 'M')
                .filter(forumUser -> forumUser.getBirthDate().isBefore(LocalDate.now().minusYears(20)))
                .filter(forumUser -> forumUser.getPublishedPostNumber() >= 1)
                .collect(Collectors.toMap(ForumUser::getIdNumber, forumUser -> forumUser));

        System.out.println("# elements: " + theForumMap.size());
        theForumMap.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);
        }
}

