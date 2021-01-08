package com.kodilla.stream.exercise;

import com.kodilla.stream.exercise.Continent;
import com.kodilla.stream.exercise.Country;
import com.kodilla.stream.exercise.World;
import com.kodilla.stream.portfolio.Board;
import com.kodilla.stream.portfolio.Task;
import com.kodilla.stream.portfolio.TaskList;
import com.kodilla.stream.portfolio.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static java.time.temporal.ChronoUnit.DAYS;

public class Exercise {
    @DisplayName("WorldTestSuite verify the total quantity of People on the World")

    @Test
    void testGetPeopleQuantity() {
        //Given
        Country china = new Country("China", new BigDecimal(1379000000));
        Country india = new Country("India", new BigDecimal(1281000000));
        Country russia = new Country("Russia", new BigDecimal(142000000));
        Country usa = new Country("USA", new BigDecimal(32600000));
        Country ethiopia = new Country("Ethiopia", new BigDecimal(105000000));
        Country egypt = new Country("Egypt", new BigDecimal(97000000));
        List<Country> asianCountries = new ArrayList<>();
        asianCountries.add(china);
        asianCountries.add(india);
        asianCountries.add(russia);
        List<Country> africanCountries = new ArrayList<>();
        africanCountries.add(egypt);
        africanCountries.add(ethiopia);
        List<Country> americanCountries = new ArrayList<>();
        americanCountries.add(usa);

        Continent asia = new Continent("Asia", asianCountries);
        Continent america = new Continent("America", americanCountries);
        Continent africa = new Continent("Africa", africanCountries);
        List<Continent> continents = new ArrayList<>();
        continents.add(asia);
        continents.add(america);
        continents.add(africa);

        World world = new World(continents);

        //When
        BigDecimal result = world.getPopeleQuantity();
        BigDecimal expectedResult = new BigDecimal("3036600000");

        //Then
        Assertions.assertEquals(expectedResult, result);


    }

    private Board prepareTestData() {
        //users
        User user1 = new User("developer1", "John Smith");
        User user2 = new User("projectmanager1", "Nina White");
        User user3 = new User("developer2", "Emilia Stephanson");
        User user4 = new User("developer3", "Konrad Bridge");

        //tasks
        Task task1 = new Task("Microservice for taking temperature",
                "Write and test the microservice taking\n" +
                        "the temperaure from external service",
                user1,
                user2,
                LocalDate.now().minusDays(20),
                LocalDate.now().plusDays(30));
        Task task2 = new Task("HQLs for analysis",
                "Prepare some HQL queries for analysis",
                user1,
                user2,
                LocalDate.now().minusDays(20),
                LocalDate.now().minusDays(5));
        Task task3 = new Task("Temperatures entity",
                "Prepare entity for temperatures",
                user3,
                user2,
                LocalDate.now().minusDays(20),
                LocalDate.now().plusDays(15));
        Task task4 = new Task("Own logger",
                "Refactor company logger to meet our needs",
                user3,
                user2,
                LocalDate.now().minusDays(10),
                LocalDate.now().plusDays(25));
        Task task5 = new Task("Optimize searching",
                "Archive data searching has to be optimized",
                user4,
                user2,
                LocalDate.now(),
                LocalDate.now().plusDays(5));
        Task task6 = new Task("Use Streams",
                "use Streams rather than for-loops in predictions",
                user4,
                user2,
                LocalDate.now().minusDays(15),
                LocalDate.now().minusDays(2));

        //taskLists
        TaskList taskListToDo = new TaskList("To do");
        taskListToDo.addTask(task1);
        taskListToDo.addTask(task3);
        TaskList taskListInProgress = new TaskList("In progress");
        taskListInProgress.addTask(task5);
        taskListInProgress.addTask(task4);
        taskListInProgress.addTask(task2);
        TaskList taskListDone = new TaskList("Done");
        taskListDone.addTask(task6);

        //board
        Board project = new Board("Project Weather Prediction");
        project.addTaskList(taskListToDo);
        project.addTaskList(taskListInProgress);
        project.addTaskList(taskListDone);
        return project;
    }
@DisplayName("Verification of average working days on task")
    @Test
    void testAddTaskListAverageWorkingOnTask() {
        //Given
        Board project = prepareTestData();
        //When
    Long sumOfDaysBetweenTodayAndTaskCreated = project.getTaskLists().stream()
            .filter(taskList -> taskList.getName().equals("In progress"))
            .flatMap(taskList -> taskList.getTasks().stream())
            .map(task -> task.getCreated().until(LocalDate.now(), DAYS))
            .reduce(0L,(sum, current) -> sum = sum + current);
    Long numberOfTasks = project.getTaskLists().stream()
            .filter(taskList -> taskList.getName().equals("In progress"))
            .flatMap(taskList -> taskList.getTasks().stream()).count();
    long average = sumOfDaysBetweenTodayAndTaskCreated/numberOfTasks;

        //Then
    Assertions.assertEquals(10L, average);
    }
}
