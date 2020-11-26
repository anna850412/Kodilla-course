package com.kodilla.testing.collection;
import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.List;

@DisplayName("Collection Test Suite")

public class CollectionTestSuite {

    @BeforeEach
    public void before() {
        System.out.println("Test Case: begin -beforeEach");
    }

    @AfterEach
    public void after() {
        System.out.println("Test Case: end -AfterEach");
    }

    @BeforeAll
    static void beforeAll() {
        System.out.println("Test Suite: begin -BeforeAll");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("Test Suite: end -AfterAll");
    }

    @DisplayName(
                    "When created even List," +
                        "Then List should return even number from List"
    )
    @Test
    void testCaseOddNumbersExterminatorNormalList() {
        //Given
        List<Integer> numbers = new ArrayList<Integer>();
        numbers.add(1);
        numbers.add(3);
        numbers.add(2);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);

        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        List<Integer> expectedResult = new ArrayList<Integer>();
        expectedResult.add(2);
        expectedResult.add(4);
        expectedResult.add(6);

        //When
        List<Integer> result = oddNumbersExterminator.exterminate(numbers);


        //Then
        Assertions.assertEquals(expectedResult, result);
    }
    @DisplayName(
            "When  I exterminate empty List," +
                    "The List should return empty list"
    )
    @Test
    void testOddNumbersExterminatorEmptyList() {
        //Given
        List<Integer> emptyList = new ArrayList<Integer>();

        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();

        //When
        List<Integer> result = oddNumbersExterminator.exterminate(emptyList);
        List<Integer> expectedResult = new ArrayList<Integer>();

        //Then
        Assertions.assertEquals(expectedResult, result);
    }

}


