package com.perassis.org;

import java.time.LocalDate;
import java.util.ArrayList;

public class UserCalendar {

    private User user;
    private ArrayList<Task> tasks;

    public UserCalendar(User user, ArrayList<Task> tasks){
        this.user = user;
        this.tasks = tasks;
    }

    public User getUser() {
        return user;
    }

    // TODO: Implement method that sorts tasks by date and time.

    public ArrayList<Task> getTasks() {
        return tasks;
    }

    public ArrayList<Task> getTodaysTasks(LocalDate today){

        ArrayList<Task> localTaskList = new ArrayList<>();

        for (Task task: tasks) {
            if(today.isEqual(task.getDateTime())){
                localTaskList.add(task);
            }
        }
        return localTaskList;
    }

    public ArrayList<Task> getTomorrowsTasks(LocalDate tomorrow){

        ArrayList<Task> localTaskList = new ArrayList<>();

        for (Task task: tasks) {
            if(tomorrow.isEqual(task.getDateTime())){
                localTaskList.add(task);
            }
        }
        return localTaskList;
    }

    public ArrayList<Task> getUpcomingTasks(LocalDate twoPlusDays){

        ArrayList<Task> localTaskList = new ArrayList<>();

        for (Task task: tasks) {
            if(task.getDateTime().isAfter(twoPlusDays)){
                localTaskList.add(task);
            }
        }
        return localTaskList;
    }

    public ArrayList<Task> addTask(Task task)
    {
        // TODO: Question: how do we validate data in the task? DB does that or should we have logic to account for it?
        this.tasks.add(task);
        return tasks;
    }

    public Task editTask(Task task)
    {
        // TODO: Question: do we separate concerns by doing the try/catch in the UI? So if tasks doesn't exist
        // do we return error in the UI?
        int indexOftask = 0;
        Task editedTask;

        for (int i = 0; i < tasks.size(); i++) {
            if(tasks.get(i).getTitle().compareTo(task.getTitle()) == 0){
                indexOftask = i;
            }
        }
        editedTask = this.tasks.get(indexOftask);
        editedTask.setTitle(task.getTitle()) ;
        editedTask.setDateTime(task.getDateTime());
        editedTask.setNotes(task.getNotes());
        // Possible problem allowing users to edit user of a task.

        return editedTask;
    }

    public ArrayList<Task> deleteTask(Task task)
    {
        // TODO: Question: do we separate concerns by doing the try/catch in the UI? So if tasks doesn't exist
        // do we return error in the UI?
        int indexOftask = 0;

        for (int i = 0; i < tasks.size(); i++) {
            if(tasks.get(i).getTitle().compareTo(task.getTitle()) == 0){
                indexOftask = i;
            }
        }
        this.tasks.remove(indexOftask);

        return tasks;
    }
}




