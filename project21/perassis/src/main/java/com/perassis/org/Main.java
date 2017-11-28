package com.perassis.org;
import com.sun.org.apache.regexp.internal.RE;

import java.sql.*;
import java.util.Scanner;

public class Main {

    public static void main(String [] args) {

        OptionFactory optionFactory = new OptionFactory();
        Option userOption;

        userOption = optionFactory.getOption("SignIn");
        userOption.display();

        // Select main menu option
        Scanner userInput = new Scanner(System.in);
        int userChoice = Integer.parseInt(userInput.nextLine());

        if(userChoice == 1){
            signIn();
        } else if(userChoice == 2){
            Register();
        } else if(userChoice == 3){
            Option quitOption = optionFactory.getOption("QuitApp");
            quitOption.display();
        }
    }

    private static void signIn(){

        Scanner userInput = new Scanner(System.in);


        System.out.print("Enter user name: ");
        String tempUser = userInput.nextLine();

        System.out.print("Enter password: ");
        String tempPassword = userInput.nextLine();

        User user = new User(tempUser,tempPassword);

        String query = "SELECT user.Password FROM user WHERE User_Name = '"+user.getUserName()+"'";
        ConnectToDatabase connect = new ConnectToDatabase("jdbc:mysql://localhost:3306/anydo?useSSL=false","root","password");
        tempPassword = connect.Select(query, "Password");

        // logged in options

        if(user.getPassword().equals(tempPassword)){

            Options menu = new Options();
            int counter = menu.getOption("loggedIN");
            while (counter != 4){
                //ADD TASK
                if(counter == 1){
                    Scanner useroptions = new Scanner(System.in);
                    System.out.println("Enter due date yyyy-mm-dd: ");
                    String tDueDate = useroptions.nextLine();
                    System.out.println("Enter task Title: ");
                    String tTitle = useroptions.nextLine();
                    System.out.print("Enter details: ");
                    String tDetails = useroptions.nextLine();
                    query = "INSERT INTO task(Title,Notes,UserName,dueDate) VALUES ('"+tTitle+"','"+tDetails+"','"+user.getUserName()+"','"+tDueDate+"')";
                    connect.insert(query);
                }
                // DELETE TASK
                else if(counter == 2){
                    query = "SELECT Title FROM task WHERE UserName = '"+user.getUserName()+"'";
                    //task object??
                    System.out.println("1--Title: " +connect.Select(query, "Title"));
                    //display taskID--- user picks taskID---- delete task

                }
                else {
                    //option1 ---- today
                    //option2 ---- tomorrow
                    //option3 ---- the rest
                }
                counter = menu.getOption("loggedIN");
            }
            }


    }
    private static void Register() {
        Scanner userInput = new Scanner(System.in);


        System.out.print("Enter first name: ");
        String tempFirst = userInput.nextLine();


        System.out.print("Enter last name: ");
        String tempLast = userInput.nextLine();


        System.out.print("Enter user name: ");
        String tempUser = userInput.nextLine();


        System.out.print("Enter password: ");
        String tempPassword = userInput.nextLine();

        User user = new User(tempFirst, tempLast, tempUser, tempPassword);
        String query = "INSERT INTO user (First_Name,Last_name,User_Name,Password) VALUES ('"+tempFirst+"','"+tempLast+"','"+tempUser+"','"+tempPassword+"')";
        ConnectToDatabase connect = new ConnectToDatabase("jdbc:mysql://localhost:3306/anydo","root","password");
        connect.insert(query);

    }


}
