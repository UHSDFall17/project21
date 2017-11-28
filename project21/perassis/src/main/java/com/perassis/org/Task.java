package com.perassis.org;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Task
{
    private String title;
    private String description;
    private String date;
    private int hour;
    private int minute;
    private User user;
    private Scanner scan;
    private String time;

    Task(String title, String description, String date, User user)
    {
        this.title = title;
        this.description = description;
        this.date = date;
        this.user = user;
    }


    public String getTitle()

    {
        System.out.println("Enter the title of the task");
        String tempTitle = scan.nextLine();
        title = "I want to" + tempTitle;
        return title;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public String getDescription()

    {
        System.out.println("Enter the Task Description");
        String tempDescription = scan.nextLine();
        description = tempDescription;
        return description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }


    public String getDate()
    {
        SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yyyy");
        Scanner sc = new Scanner(System.in);

        System.out.println("Example: 12-25-2017");
        System.out.print("Enter date: ");
        String str = sc.nextLine();

        try
        {
            Date date = sdf.parse(str);

            sdf = new SimpleDateFormat("EEE, d MMM yyyy");
            System.out.println("Date: " + sdf.format(date));
        }
        catch (ParseException e)
        {

            System.out.println("Parse Exception - Invaid Input");
        }
        return date;

    }

    public void setDate()
    {

        this.date = date;
    }

    public int getHour()
    {
        System.out.print("Enter the Hour (0-23) ");
        hour = scan.nextInt();
        while(hour < 0 || hour > 23)
        {
            System.out.print("Invalid Input, Kindly enter between (0-23)");
            hour = scan.nextInt();
        }
        return hour;
    }

    public int hour()
    {
        return hour;
    }

    public int getMinute()
    {
        System.out.print("Enter the Minute (0-59): ");
        minute = scan.nextInt();
        while(minute < 0 || minute > 59)
        {
            System.out.print("Invalid Input, Kindly enter between(0-23): ");
            minute = scan.nextInt();
        }
        return minute;
    }

    public int minute()
    {
        return minute;
    }




    public void setTime()
    {
        System.out.println("Enter the time task has to be done");
        int temp1 = getHour();
        int temp2 = getMinute();
        String time = temp1+":"+ temp2;
        this.time=time;
    }



    public User getUser()
    {
        return user;
    }

    public void setUser(User user)
    {
        this.user = user;
    }
}


