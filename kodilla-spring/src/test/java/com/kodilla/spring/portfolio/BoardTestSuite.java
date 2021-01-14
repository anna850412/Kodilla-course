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
        TaskList result1 =  board.getToDoList();
        TaskList result2 =  board.getInProgressList();
        TaskList result3 =  board.getDoneList();

        //Then
        Assertions.assertEquals("to be done", result1);
        Assertions.assertEquals("still in progress", result2);
        Assertions.assertEquals("already done", result3);

    }
}
