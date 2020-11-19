package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.book.Book;
import com.kodilla.stream.book.BookDirectory;
import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.util.Map;
import java.util.stream.Collectors;


public class StreamMain {
    public static void main(String[] args) {
//        PoemBeautifier poemBeautifier = new PoemBeautifier();
     //   poemBeautifier.beautify(()-> System.out.println("Welcome in my World"));
//        ForumUser forumUser = new ForumUser(forumUserList);
        Forum theForum = new Forum();

        theForum.getUserList().stream().map(sex -> 'M')
//                .filter(forumUser -> forumUser.getBirthDate().getYear() < 2000)
                .map(publishedPostNumber -> publishedPostNumber>1).forEach(System.out::println);


        Map<Integer, ForumUser> theForumMap = theForum.getUserList().stream()
                .filter(forumUser -> forumUser.getBirthDate().getYear() < 2000)
                .collect(Collectors.toMap(ForumUser::getIdNumber, forumUser -> forumUser));             // [1]

        System.out.println("# elements: " + theForumMap.size());             // [2]
        theForumMap.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())                   // [3]
                .forEach(System.out::println);                                            // [4]
    }
}

