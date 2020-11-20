package com.kodilla.stream.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.stream.IntStream;

public class ArrayOperationsTestSuite {
    @DisplayName("Test provide average of int[] numbers")
    @Test
    void testGetAverage(){
        //Given
        int [] numbers = new int[20];
        numbers[0] = 13;
        numbers[1] = 2;
        numbers[2] = 7;
        numbers[3] = 8;
        numbers[4] = 25;
        numbers[5] = 15;
        numbers[6] = 16;
        numbers[7] = 14;
        numbers[8] = 30;
        numbers[9] = 10;
        numbers[10] = 6;
        numbers[11] = 24;
        numbers[12] = 2;
        numbers[13] = 18;
        numbers[14] = 29;
        numbers[15] = 11;
        numbers[16] = 16;
        numbers[17] = 24;
        numbers[18] = 3;
        numbers[19] = 7;
//        int sum = 0;
//        for(int i =0; i<20; i ++){
//          sum = sum + i;
//        }
//        System.out.println("Average: " + sum/ numbers.length);
//        System.out.println("Sum: " + sum);

        int[] ints = {13, 2, 7, 8, 25, 15, 16, 14, 30, 10, 6, 24, 2, 18, 29, 11, 16, 24, 3, 7};
        Arrays
                .stream(numbers)
                .average()
                .ifPresent(System.out::println);

        //When
        OptionalDouble expectedResult = Arrays.stream(numbers).average();
   //     int result = ArrayOperations.getAverage(numbers);
//        int result =  Arrays.stream(numbers).average();
        OptionalDouble result = IntStream.range(0, numbers.length)
                .average();
        //Then
        Assertions.assertEquals(expectedResult,result);
    }
}
