package com.perassis.org;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static ArrayList<User> usersInDB = new ArrayList<>();
    static UserDB users = new UserDB();

    public static void main(String [] args) {

        users.seedUserDB();
        int userChoice = mainLoggingScreen();
        switch (userChoice) {

            case 1:
                signIn();
                break;
            case 2:
                Register();
                break;
            case 3:
                quitPerassis();
        }
    }


    private static int mainLoggingScreen(){

        Scanner userInput = new Scanner(System.in);
        int option;
        System.out.println("");
        System.out.println("###########################################################");
        System.out.println("Welcome to Perassis. Please select from the choices below:");
        System.out.println("1. Sign in - existing user");
        System.out.println("2. Register - new user");
        System.out.println("3. Exit - quit program");
        System.out.print("Please enter your choice: ");
        option = userInput.nextInt();
        return option;

    }


    private static void signIn(){

        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter user name: ");
        String tempUser = userInput.nextLine();
        System.out.print("Enter password: ");
        String tempPassword = userInput.nextLine();

        User verifiedUser = users.verifyUserInDB(tempUser, tempPassword);

        if(verifiedUser == null){
            // If user not found send to register
            System.out.println("ERROR: Username and password combination not found. Please try again or register.");
            mainLoggingScreen();
        } else {
            // If user found, send to main menu
            mainUserMenu(verifiedUser);
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

        User newUserRegistered = users.addUserToDB(tempFirst, tempLast, tempUser, tempPassword);

        if(newUserRegistered == null){
            // If user not found send to register
            System.out.println("ERROR: Username already exist. Please try a different username or sign in.");
            mainLoggingScreen();
        }else {
            // If user found, send to main menu
            mainUserMenu(newUserRegistered);
        }
    }

    private static int mainUserMenu(User user){

        Scanner inputMainUserMenu = new Scanner(System.in);
        int optionMainUserMenu;
        System.out.println("");
        System.out.println("###########################################################");
        System.out.println("Welcome " + user.getUserName() + ". What would you like to do?");
        System.out.println("1. View my tasks - view your calendar");
        System.out.println("2. Add a task - add a new task to your calendar");
        System.out.println("3. Delete a task - delete an existint task from your calendar:");
        System.out.print("Please enter your choice: ");
        optionMainUserMenu = inputMainUserMenu.nextInt();
        return optionMainUserMenu;
    }

    private static void quitPerassis(){

        System.out.print("Leaving perassis. Come back again soon!");
        System.exit(0);

    }



// Removed code
//    private static void saveToDatabase(){
//        //saves new user to database;
//    }


    //    private static boolean verify(){
//        return true;
//    }

    // Taken out of register method
// User user = new User(tempFirst, tempLast, tempUser, tempPassword);
//        String query = "INSERT INTO user (UserID,First_Name,Last_name,User_Name,Password) VALUES ('1','tempFirst','tempLast','tempUser','tempPassword')";
//        ConnectToDatabase connect = new ConnectToDatabase("jdbc:mysql://localhost:3306/anydo","root","password");
//        connect.insert(query);
}
