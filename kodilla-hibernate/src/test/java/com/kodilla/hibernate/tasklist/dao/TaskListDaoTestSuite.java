package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.taskList.TaskList;
import com.kodilla.hibernate.taskList.TaskListDao;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class TaskListDaoTestSuite {
    @Autowired
    private TaskListDao taskListDao;
    private static final String DESCRIPTION = "Test: Learn Hibernate";
    private static final String TODO = "To do List";

    @Test
    void testFindByListName() {
        //Given
        TaskList taskList = new TaskList(TODO, DESCRIPTION);
        taskListDao.save(taskList);
        String listName = taskList.getListName();
        //When
        List<TaskList> readTaskList = taskListDao.findByListName(listName);
        //Then
        Assertions.assertEquals(1, readTaskList.size());
        //CleanUp
        int id = readTaskList.get(1).getId();
        int id2 = readTaskList.get(2).getId();
        int id3 = readTaskList.get(3).getId();

        taskListDao.deleteById(id);
        taskListDao.deleteById(id2);
        taskListDao.deleteById(id3);
    }
}
