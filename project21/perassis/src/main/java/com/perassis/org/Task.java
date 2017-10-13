package com.perassis.org;

import java.time.LocalDate;

public class Task
{
    private String title;
    private LocalDate dateTime;
    private String notes;
    private User user;

    public Task(String title, LocalDate dateTime, String notes, User user) {
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

    public LocalDate getDateTime()
    {
        return dateTime;
    }

    public void setDateTime(LocalDate dateTime)
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


