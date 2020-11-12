package com.kodilla.testing.forum;

import com.kodilla.testing.user.ForumUser;
import org.junit.Test;

import org.junit.jupiter.api.*;

@DisplayName("Forum Test Suite")
public class ForumTestSuite {
    @BeforeEach
    public void before() {
        System.out.println("Test Case: begin -beforeEach");
    }

    @AfterEach
    public void after() {
        System.out.println("Test Case: end -AfterEach");
    }

    @BeforeAll
    public static void beforeAll() {
        System.out.println("Test Suite: begin -BeforeAll");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("Test Suite: end -AfterAll");
    }
    @DisplayName(
                    "When create SimpleUser with realName, " +
                    "then getRealName should return correct real user name"
    )
    @Test
    void testCaseRealName() {
        //Given
        SimpleUser simpleUser = new SimpleUser("theForumUser", "John Smith");
        //When
        String result = simpleUser.getRealName();
        System.out.println("Testing " + result);
        //Then
        Assertions.assertEquals("John Smith", result);
    }
    @Test
    void testCaseUsername(){
        @DisplayName(
                    "When created SimpleUser with name, " +
                    "then getUsername should return correct name"
        )
        //Given
        SimpleUser simpleUser = new SimpleUser ("theForumUser");

        //When
        String result = simpleUser.getUsername();

        String expectedResult = "theForumUser";

        //Then
        Assertion.assertEquals(expectedResult, result);

    }
}
