package com.kodilla.spring.forum;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ForumUserTestSuite {
    @Test
    void testGetUsername(){
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        User user = context.getBean(ForumUser.class);
        //When
        String result = user.getUserName();

        //Then
        Assertions.assertEquals("John Smith",result);
    }
    @Test
    void contextLoads() {
    }
}
