// screen with multiple options

package com.perassis.org;

import java.util.Scanner;

public class Options {

    OptionFactory optionFactory = new OptionFactory();

    public int getOption(String ScreenOption){
        if(ScreenOption.equals("signIN")){
            Scanner userInput = new Scanner(System.in);
            int option;
            Option optionFromFactory;
//            System.out.println("Welcome to Perassis. Please select from the choices below:");
//            System.out.println("1: Sign in - existing user");
//            System.out.println("2: Register - new user");
//            System.out.println("3: exit");
//            System.out.print("Enter 1, 2, or 3: ");
            optionFromFactory = optionFactory.getOption("SignIn");
            optionFromFactory.display();
            option = userInput.nextInt();
            return option;
        }
        else if(ScreenOption.equals("loggedIN")){
            Scanner userInput = new Scanner(System.in);
            int option;
            System.out.println("1: Add a task");
            System.out.println("2: Delete a task");
            System.out.println("3: ViewTask tasks");
            System.out.println("4: Exit");
            option = userInput.nextInt();
            return option;
        }
        return 0;
    }
}
