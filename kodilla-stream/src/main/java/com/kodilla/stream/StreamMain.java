package com.kodilla.stream;

import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class StreamMain {
    public static void main(String[] args) {
       // PoemBeautifier poemBeautifier = new PoemBeautifier();
       // poemBeautifier.beautify((PoemDecorator poemDecorator)-> System.out.println("Welcome in my World"));

        List<ForumUser> forumUserList;
        ForumUser forumUser1 = new ForumUser(1,"Smith",'M',2000,3,25,0);
        ForumUser forumUser2 = new ForumUser(2,"Wnuk",'K',1990,1,1,3);
        ForumUser forumUser3 = new ForumUser(3,"Kowalski",'M',2005,9,12,10);
        ForumUser forumUser4 = new ForumUser(4,"Herr",'M',2010,4,26,4);


        Forum theForum = new Forum();

        theForum.getUserList().stream()
                .map(sex -> 'M')
//                .filter(forumUser -> forumUser.getBirthDate().getYear() < 2000)
                .map(publishedPostNumber -> publishedPostNumber>1)
                .forEach(System.out::println);


        Map<Integer, ForumUser> theForumMap = theForum.getUserList().stream()
                .filter(forumUser -> forumUser.getBirthDate().getYear() < 2000)
                .collect(Collectors.toMap(ForumUser::getIdNumber, forumUser -> forumUser));             // [1]

        System.out.println("# elements: " + theForumMap.size());             // [2]
        theForumMap.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())                   // [3]
                .forEach(System.out::println);                                            // [4]
        }
}

