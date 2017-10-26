package com.perassis.org;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.util.ArrayList;

import static org.junit.Assert.*;

public class TaskTest {
    @Test
    public void addTask() throws Exception
    {
        // Arranges
        User user = new User("Senthilkumar","1234");
        Task task = new Task("Homework", LocalDate.of(2017,10,10),"Need to do this!", user );
        String result;

        // Act
        result = task.addTask(user);

        // Assert
        Assert.assertEquals("Task added",result);
    }

    @Test
    public void editTask() throws Exception
    {
        // Arranges
        ArrayList<Task> listOfTasks = new ArrayList<>();
        User user1 = new User("Senthilkumar","1234");
        UserCalendar userCalendar = new UserCalendar(user1,listOfTasks);

        Task task1 = new Task("Homework", LocalDate.of(2017,10,10),"Need to complete by next week!", user1 );
        Task task2 = new Task("Homework", LocalDate.of(2017,10,10),"Need to complete in 2 days!", user1 );
        task2=task1;
        String modifiedTask;

        //Act
        modifiedTask = task2.editTask(user1);

        //Assert
        Assert.assertEquals("Edited Task",modifiedTask);
    }

}