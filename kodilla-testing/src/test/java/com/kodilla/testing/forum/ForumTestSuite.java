package com.kodilla.testing.forum;

import com.kodilla.testing.user.SimpleUser;
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
                    "When created SimpleUser with realName, " +
                    "the getRealName should return real user name"
    )
    @Test
    void testCaseRealName(){
        //Given
        SimpleUser simpleUser = new SimpleUser ("theForumUser", "Will Smith");

        //When
        String result = simpleUser.getRealName();
        System.out.println("Testing " + result);

        //Then
        Assertions.assertEquals("Will Smith", result);

    }




    @DisplayName(
            "When created SimpleUser with name," +
            "the getUsername should return correct name"
    )
    @Test
    void testCaseUsername(){
        //Given
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        //When
        String result = simpleUser.getUsername();

        String expectedResult = "theForumUser";

        //Then
        Assertions.assertEquals(expectedResult, result);

    }
}
