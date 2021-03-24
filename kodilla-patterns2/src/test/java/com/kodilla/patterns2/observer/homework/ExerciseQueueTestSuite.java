package com.kodilla.patterns2.observer.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExerciseQueueTestSuite {

    @Test
    void testUpdate(){
        //Given
        ExerciseQueue firstStudentExercise = new FirstStudentExerciseQueue();
        ExerciseQueue secondStudentExercise = new SecondStudentExerciseQueue();
        ExerciseQueue thirdStudentExercise = new ThirdStudentExerciseQueue();
        Mentor mentor1 = new Mentor("Grzegorz");
        Mentor mentor2 = new Mentor("Adam");
        firstStudentExercise.registerObserver(mentor1);
        secondStudentExercise.registerObserver(mentor2);
        thirdStudentExercise.registerObserver(mentor1);
        //When
        firstStudentExercise.addExercise("my homework");
        firstStudentExercise.addExercise("my second homework");
        secondStudentExercise.addExercise("last exercise");
        secondStudentExercise.addExercise("another homework");
        thirdStudentExercise.addExercise("only one homework");

        //Then
        assertEquals(3, mentor1.getUpdateCount());
        assertEquals(2, mentor2.getUpdateCount());
    }
}
