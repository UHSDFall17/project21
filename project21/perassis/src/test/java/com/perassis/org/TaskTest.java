package com.perassis.org;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.util.ArrayList;

import static org.junit.Assert.*;

public class TaskTest
{
    @Test
    public void task_setting_the_values() throws Exception
    {
        //Arrange
        Task task;
        User user1 = new User("Senthilkumar","12345");

        //Act
        task = new Task("My first task", LocalDate.of(2017,11,12),"Don't forget", user1);

        //Assert
        Assert.assertEquals(task.getDateTime(), LocalDate.of(2017,11,12));
        Assert.assertEquals(task.getNotes(), "Don't forget");
        Assert.assertEquals(task.getTitle(), "My first task");
    }



}