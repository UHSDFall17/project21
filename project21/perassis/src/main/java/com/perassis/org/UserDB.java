package com.perassis.org;

import java.util.ArrayList;
import java.util.List;

public class UserDB {

    ArrayList<User> users = new ArrayList<>();

    public ArrayList<User> getUsers() {
        return users;
    }

    public ArrayList<User> seedUserDB(){

        // Create users
        User rolando = new User("Rolando", "Rivera", "Roller", "pass123");
        User gustavo = new User("Gustavo","Arismendi","Goose","pass456");
        User senthilkumar = new User("Senthilkumar", "Sivaraman","Senter", "pass789");

        // TODO: Create tasks to add for users

        // TODO: Add tasks to user calendar
        users.add(rolando);
        users.add(gustavo);
        users.add(senthilkumar);
        return users;
    }

    public User verifyUserInDB(String name, String password){

        User returnUser = new User();

        for (User user: users) {
            // If user in DB return user
            if(user.getUserName().compareTo(name) == 0 && user.getPassword().compareTo(password) == 0){
                returnUser = user;
                break;
            } else {
            // If user not in DB return empty
                returnUser = null;
            }
        }
        return returnUser;
    }

    public User addUserToDB(String firstName, String lastName, String userName, String password){

        User returnRegisteredUser = new User();

        for (User user: users) {
            // If user doesn't exist in DB return user
            if(user.getUserName().compareTo(firstName) == 0 && user.getPassword().compareTo(password) == 0){
                returnRegisteredUser = null;
                break;
            } else {
                // If user not in DB return empty
                returnRegisteredUser = new User(firstName, lastName, userName, password);
            }
        }
        users.add(returnRegisteredUser);
        return returnRegisteredUser;
    }


}
