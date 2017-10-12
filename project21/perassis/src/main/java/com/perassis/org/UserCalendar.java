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

    public ArrayList<Task> getTodaysTasks(){

        LocalDate today = LocalDate.of(2017,10,10);

        for (Task task: tasks) {
            if(today.isEqual(task.getDateTime())){
                System.out.println("Title: " + task.getTitle() + " Date: " +  task.getDateTime());
                tasks.add(task);
                return tasks;
            } else {
                System.out.println("You have no task scheduled for today.");
                return null;
            }
        }
        return null;
    }

    public ArrayList<Task> getTomorrowsTasks(){

        LocalDate tomorrow = LocalDate.of(2017,10,10).plusDays(1);

        for (Task task: tasks) {
            if(tomorrow.isEqual(task.getDateTime())){
                System.out.println("Title: " + task.getTitle() + " Date: " +  task.getDateTime());
                tasks.add(task);
                return tasks;
            } else {
                System.out.println("You have no task scheduled for tomorrow.");
                return null;
            }
        }
        return null;
    }

    public ArrayList<Task> getUpcomingTasks(){

        LocalDate twoPlusDays = LocalDate.of(2017,10,10).plusDays(2);

        for (Task task: tasks) {
            if(task.getDateTime().isAfter(twoPlusDays)){
                System.out.println("Title: " + task.getTitle() + " Date: " +  task.getDateTime());
                tasks.add(task);
                return tasks;
            } else {
                System.out.println("You have no task scheduled in the near future.");
                return null;
            }
        }
        return null;
    }
}




