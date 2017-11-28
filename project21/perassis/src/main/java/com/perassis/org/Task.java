package com.perassis.org;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

class Task
{
    private String title;
    private String description;
    private String date;
    private int hour;
    private int minute;
    private Scanner scan;

    Task(String title, String description, String date, User user)
    {
        this.title = title;
        this.description = description;
        this.date = date;
        User user1 = user;
    }


    String getTitle()

    {
        System.out.println("Enter the title of the task");
        String tempTitle = scan.nextLine();
        title = "I want to" + tempTitle;
        return title;
    }

    void setTitle(String title)
    {
        this.title = title;
    }

    String getDescription()

    {
        System.out.println("Enter the Task Description");
        description = scan.nextLine();
        return description;
    }

    void setDescription(String description)
    {
        this.description = description;
    }


    String getDate()
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

    void setDate()
    {

        this.date = date;
    }

    private int getHour()
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

    int hour()
    {
        return hour;
    }

    private int getMinute()
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

    int minute()
    {
        return minute;
    }

    void setTime()
    {
        System.out.println("Enter the time task has to be done");
        int temp1 = getHour();
        int temp2 = getMinute();
        String time = temp1+":"+ temp2;
    }


}


