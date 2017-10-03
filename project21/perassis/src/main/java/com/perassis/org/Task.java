package com.perassis.org;

import java.util.Date;

public class Task
{
    private int taskID;
    private String title;
    private Date dateTime;
    private String notes;
    private UserCalendar userCalendar;

    public Task(String title, Date dateTime, String notes, User user) {
        this.title = title;
        this.dateTime = dateTime;
        this.notes = notes;
        this.user = user;
    }


    public String getTitle()

    {
        return title;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public Date getDateTime()
    {
        return dateTime;
    }

    public void setDateTime(Date dateTime)
    {
        this.dateTime = dateTime;
    }

    public String getNotes()
    {
        return notes;
    }

    public void setNotes(String notes)
    {
        this.notes = notes;
    }

    public User getUser()
    {
        return user;
    }

    public void setUser(User user)
    {
        this.user = user;
    }

    public void addTask(User user)
    {

    }

    public void editTask()
    {
    }

    public void deleteTask()
    {

    }
}


