package com.kodilla.stream.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class ArrayOperationsTestSuite {
    @DisplayName("Test provide average of int[] numbers")
    @Test
    void testGetAverage() {
        //Given
        double[] numbers = new double[20];
        int[] intNumbers = new int[20];
        numbers[0] = 13;
        numbers[1] = 2.5;
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

        //When
        double intResult = IntStream.range(0, numbers.length)
                .map(item -> intNumbers[item])
                .average()
                .getAsDouble();

        double expectedResult = 14.025;
        DoubleStream stream = Arrays.stream(numbers);
        OptionalDouble average = stream
                // .map(item -> numbers[item])
                .average();
        double result = average.getAsDouble();

        //IntStream.range(0, numbers.length)
               // .map(item -> numbers[item])
              //  .forEach(v -> System.out.println(v));

        //Then
        Assertions.assertEquals(expectedResult, result);
    }
}
