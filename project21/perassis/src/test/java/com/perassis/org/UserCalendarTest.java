package com.perassis.org;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.util.ArrayList;

public class UserCalendarTest {

    @Test
    public void createUserCalendar_calendarHasTwoTasks_ShouldReturnCalendarWithTwoTasks() throws Exception{

        // Arrange
        User user1 = new User("Gustavo", "testOne");
        Task task1 = new Task("T1",LocalDate.of(2017,10,10), "First task", user1);
        Task task2 = new Task("T2",LocalDate.of(2017,10,13), "Second task", user1);
        ArrayList<Task> listOfTasks = new ArrayList<>();
        listOfTasks.add(task1);
        listOfTasks.add(task2);

        // Act
        UserCalendar userCalendar = new UserCalendar(user1, listOfTasks);

        // Assert
        Assert.assertEquals(userCalendar.getTasks().get(0).getDateTime(), task1.getDateTime());
        Assert.assertEquals(userCalendar.getTasks().get(1).getTitle(), task2.getTitle());
    }

    @Test
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

    @Test
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

    @Test
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

    @Test
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

    @Test
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

    @Test
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

    @Test
    public void addTask_addOneTaskAtEnd_ShouldReturnListWithAddedTaskAtEnd() throws Exception
    {
        // Arrange
        ArrayList<Task> listOfTasks = new ArrayList<>();
        User user = new User("Senthilkumar","1234");
        UserCalendar userCalendar = new UserCalendar(user,listOfTasks);
        Task task = new Task("Homework", LocalDate.of(2017,10,10),"Need to do this!", user );
        listOfTasks.add(task);

        Task taskToBeAdded = new Task("Project", LocalDate.of(2017,10,11), "Finish this project", user);
        ArrayList<Task> result;

        // Act
        result = userCalendar.addTask(taskToBeAdded);

        // Assert
        Assert.assertEquals(listOfTasks.size(), result.size());
        Assert.assertEquals(listOfTasks.get(1).getTitle(), result.get(1).getTitle());
    }

    @Test
    public void editTask_editNotesInOnlyTaskInTheCalendar_ShouldReturnTaskWithEditedNotes() throws Exception
    {
        // Arrange
        ArrayList<Task> listOfTasks = new ArrayList<>();
        User user1 = new User("Senthilkumar","1234");
        UserCalendar userCalendar = new UserCalendar(user1,listOfTasks);

        Task task1 = new Task("Homework", LocalDate.of(2017,10,10),"Need to complete by next week!", user1 );
        listOfTasks.add(task1);
        Task task2 = new Task("Homework", LocalDate.of(2017,10,10),"Need to complete by tomorrow!", user1 );
        Task modifiedTask;

        //Act
        modifiedTask = userCalendar.editTask(task2);

        //Assert
        Assert.assertEquals(task2.getNotes(),modifiedTask.getNotes());
        Assert.assertEquals(userCalendar.getTasks().size(), 1);
    }

    @Test
    public void deleteTask_calendarHasTwoTasksDeletingFirst_ShouldReturnCalendarWithSecondTaskOnly() throws Exception
    {
        // Arrange
        ArrayList<Task> listOfTasks = new ArrayList<>();
        User user1 = new User("Senthilkumar","1111");
        UserCalendar userCalendar = new UserCalendar(user1,listOfTasks);

        Task task1 = new Task("Presentation", LocalDate.of(2017,10,10),"Need to complete by tomorrow!", user1 );
        Task task2 = new Task("Presentation2", LocalDate.of(2017,10,11),"Need to complete by next week!", user1 );
        listOfTasks.add(task1);
        listOfTasks.add(task2);
        ArrayList<Task> resultingList = new ArrayList<>();

        //Act
        resultingList = userCalendar.deleteTask(task1);

        //Assert
        Assert.assertEquals(resultingList.get(0).getTitle(), task2.getTitle());
        Assert.assertEquals(resultingList.size(), 1);
    }
}

