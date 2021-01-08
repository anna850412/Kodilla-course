package com.kodilla.stream.exercise;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class CollectionTestSuite {
    @DisplayName("Verification if method exterminator works corretly when we have normal List")

    @Test
    void testCaseOddNumbersExterminatorNormalList() {
        //Given
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        OddNumberExterminator oddNumberExterminator = new OddNumberExterminator();

        //When
        List<Integer> result = oddNumberExterminator.exterminate(numbers);
        List<Integer> expectedResult = new ArrayList<>();
        expectedResult.add(2);
        expectedResult.add(4);
        expectedResult.add(6);

        //Then
        Assertions.assertEquals(expectedResult, result);

    }
    @DisplayName("Verification if method exterminator works corretly when List is empty")
    @Test
    void testCaseOddNumbersExterminatorEmptyList() {
        //Given
        List<Integer> emptyList = new ArrayList<>();
        OddNumberExterminator oddNumberExterminator = new OddNumberExterminator();
        //When
        List<Integer> expectedResult = new ArrayList<Integer>();
        List<Integer> result = oddNumberExterminator.exterminate(emptyList);

        //Then
        Assertions.assertEquals(expectedResult, result);


    }
}

