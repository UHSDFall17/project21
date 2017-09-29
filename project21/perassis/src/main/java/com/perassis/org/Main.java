package com.perassis.org;
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
        System.out.println("1. sign in");
        System.out.println("2. Register");
        System.out.print("Enter 1 or 2: ");
        option = userInput.nextInt();
        return option;
    }
    private static void signIn(){

        Scanner userInput = new Scanner(System.in);
        User user = new User();

        System.out.print("Enter user name: ");
        String tempUser = userInput.nextLine();
        user.setUserName(tempUser);

        System.out.print("\nEnter password: ");
        String tempPassword = userInput.nextLine();
        user.setPassword(tempPassword);

        connectToDatabase();
        if(verify()==true){
            //password and user are found in the database
        }else {

        }

    }
    private static void Register(){
        Scanner userInput = new Scanner(System.in);
        User user = new User();

        System.out.print("Enter first name: ");
        String tempFirst = userInput.nextLine();
        user.setFirstName(tempFirst);

        System.out.print("\nEnter last name: ");
        String tempLast = userInput.nextLine();
        user.setLastName(tempLast);

        System.out.print("\nEnter user name: ");
        String tempUser = userInput.nextLine();
        user.setUserName(tempUser);

        System.out.print("\nEnter password: ");
        String tempPassword = userInput.nextLine();
        user.setPassword(tempPassword);

        connectToDatabase();

    }
    private static void connectToDatabase(){
        //establish connection with database
    }

    private static boolean verify(){
        return true;
    }

    private static void saveToDatabase(){
        //saves new user to database;
    }
}
