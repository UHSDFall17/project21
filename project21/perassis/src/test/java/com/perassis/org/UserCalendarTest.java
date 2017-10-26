package com.perassis.org;

import org.junit.Assert;

import java.time.LocalDate;
import java.util.ArrayList;

public class UserCalendarTest {

    @org.junit.Test
    public void getTodaysTasks_dateMatchesOneTask_ShouldReturnOneTask() throws Exception {

        //Arrange
        User user1 = new User("Gustavo", "password");
        Task task1 = new Task("Homework",LocalDate.of(2017,10,10), "Get this done.", user1);
        ArrayList<Task> listOfTasks = new ArrayList<>();
        listOfTasks.add(task1);
        UserCalendar calendar1 = new UserCalendar(user1,listOfTasks);
        ArrayList<Task> taskConfirm;

        //Act
        taskConfirm = calendar1.getTodaysTasks(LocalDate.of(2017,10,10));

        //Assert
        Assert.assertEquals(task1.getDateTime(), taskConfirm.get(0).getDateTime());
        Assert.assertEquals(task1, taskConfirm.get(0));
    }

    @org.junit.Test
    public void getTodaysTasks_dateMatchesZeroTask_ShouldReturnZeroTask() throws Exception {

        //Arrange
        User user1 = new User("Gustavo", "password");
        Task task1 = new Task("Homework",LocalDate.of(2017,10,15), "Task doesn't match", user1);
        ArrayList<Task> listOfTasks = new ArrayList<>();
        listOfTasks.add(task1);
        UserCalendar calendar1 = new UserCalendar(user1,listOfTasks);
        ArrayList<Task> taskConfirm;

        //Act
        taskConfirm = calendar1.getTodaysTasks(LocalDate.of(2017,10,10));

        //Assert
        Assert.assertEquals(taskConfirm.size(), 0);
    }

    @org.junit.Test
    public void getTomorrowsTasks_dateMatchesOneTasks_ShouldReturnOneTask() throws Exception {

        //Arrange
        User user1 = new User("Gustavo", "password");
        Task task1 = new Task("HomeworkDueTomorrow",LocalDate.of(2017,10,12).plusDays(1), "Get this done.", user1);
        Task task2 = new Task("HomeworkDueTomorrow2",LocalDate.of(2017,10,10).plusDays(1), "Get this done as well.", user1);
        ArrayList<Task> listOfTasks = new ArrayList<>();
        listOfTasks.add(task1);
        listOfTasks.add(task2);
        UserCalendar calendar1 = new UserCalendar(user1,listOfTasks);
        ArrayList<Task> taskConfirm;

        //Act
        taskConfirm = calendar1.getTomorrowsTasks(LocalDate.of(2017,10,10).plusDays(1));

        //Assert
        Assert.assertEquals(task2.getDateTime(), taskConfirm.get(0).getDateTime());
        Assert.assertEquals(taskConfirm.size(), 1);
    }

    @org.junit.Test
    public void getTomorrowsTasks_dateMatchesTwoTasks_ShouldReturnTwoTask() throws Exception {

        //Arrange
        User user1 = new User("Gustavo", "password");
        Task task1 = new Task("HomeworkDueTomorrow",LocalDate.of(2017,10,10).plusDays(1), "Get this done.", user1);
        Task task2 = new Task("HomeworkDueTomorrow2",LocalDate.of(2017,10,10).plusDays(1), "Get this done as well.", user1);
        ArrayList<Task> listOfTasks = new ArrayList<>();
        listOfTasks.add(task1);
        listOfTasks.add(task2);
        UserCalendar calendar1 = new UserCalendar(user1,listOfTasks);
        ArrayList<Task> taskConfirm;

        //Act
        taskConfirm = calendar1.getTomorrowsTasks(LocalDate.of(2017,10,10).plusDays(1));

        //Assert
        Assert.assertEquals(task1.getDateTime(), taskConfirm.get(0).getDateTime());
        Assert.assertEquals(task2.getDateTime(), taskConfirm.get(1).getDateTime());
        Assert.assertArrayEquals(listOfTasks.toArray(), taskConfirm.toArray());
    }

    @org.junit.Test
    public void getUpcomingTasks_dateMatchesOneTasks_ShouldReturnOneTasks() throws Exception {

        //Arrange
        User user1 = new User("Gustavo", "password");
        Task task1 = new Task("UpcomingHW",LocalDate.of(2017,10,10), "Too much HW!", user1);
        Task task2 = new Task("UpcomingHW",LocalDate.of(2017,10,10).plusDays(4), "Yes, way too much HW!", user1);
        ArrayList<Task> listOfTasks = new ArrayList<>();
        listOfTasks.add(task1);
        listOfTasks.add(task2);
        UserCalendar calendar1 = new UserCalendar(user1,listOfTasks);
        ArrayList<Task> taskConfirm;

        //Act
        taskConfirm = calendar1.getUpcomingTasks(LocalDate.of(2017,10,10));

        //Assert
        Assert.assertEquals(task2.getDateTime(), taskConfirm.get(0).getDateTime());
        Assert.assertEquals(taskConfirm.size(), 1);
    }

    @org.junit.Test
    public void getUpcomingTasks_dateMatchesTwoTasks_ShouldReturnTwoTasks() throws Exception {

        //Arrange
        User user1 = new User("Gustavo", "password");
        Task task1 = new Task("UpcomingHW",LocalDate.of(2017,10,10).plusDays(3), "Get this done.", user1);
        Task task2 = new Task("UpcomingHW",LocalDate.of(2017,10,10).plusDays(4), "Get this done as well.", user1);
        ArrayList<Task> listOfTasks = new ArrayList<>();
        listOfTasks.add(task1);
        listOfTasks.add(task2);
        UserCalendar calendar1 = new UserCalendar(user1,listOfTasks);
        ArrayList<Task> taskConfirm;

        //Act
        taskConfirm = calendar1.getUpcomingTasks(LocalDate.of(2017,10,10));

        //Assert
        Assert.assertEquals(task1.getDateTime(), taskConfirm.get(0).getDateTime());
        Assert.assertEquals(task2.getDateTime(), taskConfirm.get(1).getDateTime());
        Assert.assertArrayEquals(listOfTasks.toArray(), taskConfirm.toArray());
    }

}

