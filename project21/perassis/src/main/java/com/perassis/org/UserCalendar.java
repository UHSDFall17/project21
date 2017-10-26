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
}




