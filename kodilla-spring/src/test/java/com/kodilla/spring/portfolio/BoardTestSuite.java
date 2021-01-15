package com.kodilla.spring.portfolio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
public class BoardTestSuite {
    @Test
    void testTaskAdd() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);
        board.getToDoList().getTasks().add("to be done");
        board.getInProgressList().getTasks().add("still in progress");
        board.getDoneList().getTasks().add("already done");
        //When
        int result1 =  board.getToDoList().getTasks().size();
        int result2 =  board.getInProgressList().getTasks().size();
        String result3 =  board.getDoneList().getTasks().get(0);

        //Then
        Assertions.assertEquals(1, result1);
        Assertions.assertEquals(1, result2);
        Assertions.assertEquals("already done", result3);

    }
}
