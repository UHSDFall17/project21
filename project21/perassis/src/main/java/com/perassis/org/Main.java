package com.perassis.org;
import java.sql.*;
import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        if(option()== 1){
            signIn();
        }else {
            Register();
        }

    }
    private static int option (){
        Scanner userInput = new Scanner(System.in);
        int option;
        System.out.println("Welcome to Perassis. Please select from the choices below:");
        System.out.println("1. Sign in - existing user");
        System.out.println("2. Register - new user");
        System.out.print("Enter 1 or 2: ");
        option = userInput.nextInt();
        return option;
    }
    private static void signIn(){

        Scanner userInput = new Scanner(System.in);


        System.out.print("Enter user name: ");
        String tempUser = userInput.nextLine();

        System.out.print("Enter password: ");
        String tempPassword = userInput.nextLine();

        User user = new User(tempUser,tempPassword);


        if(verify()==true){
            //password and user are found in the database
        }else {

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
        String query = "INSERT INTO user (UserID,First_Name,Last_name,User_Name,Password) VALUES ('1','tempFirst','tempLast','tempUser','tempPassword')";
        ConnectToDatabase connect = new ConnectToDatabase("jdbc:mysql://localhost:3306/anydo","root","password");
        connect.insert(query);

    }

    private static boolean verify(){
        return true;
    }

    private static void saveToDatabase(){
        //saves new user to database;
    }

}
