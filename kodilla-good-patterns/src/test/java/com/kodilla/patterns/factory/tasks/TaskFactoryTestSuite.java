package com.kodilla.patterns.factory.tasks;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TaskFactoryTestSuite {
    @Test
    void testFactoryDriving() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task driving = factory.makeTask(TaskFactory.DRIVING);
        //Then
        Assertions.assertEquals("Drive slowly", driving.getTaskName());
    }
    @Test
    void testFactoryPainting(){
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task painting = factory.makeTask(TaskFactory.PAINTING);
        //Then
        Assertions.assertEquals("Painting task is executed", painting.executeTask());
    }
    @Test
    void testFactoryShopping(){
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task shopping = factory.makeTask(TaskFactory.SHOPPING);
        //Then
        Assertions.assertEquals(true,shopping.isTaskExecuted());
        Assertions.assertEquals("Shopping task is executed",shopping.executeTask());
    }
}