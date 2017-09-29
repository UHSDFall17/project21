package com.perassis.org;

public class User {

    private String firstName;
    private String lastName;
    private String userName;
    private String password;

    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public String getUserName(){
        return userName;
    }
    public String getPassword(){
        return password;
    }
//    public User(String newUserName, String newPassword){
//        this.userName = newUserName;
//        this.password = newPassword;
//    }
//    public User(String newFirstName, String newLastName, String newUserName, String newPassword){
//        this.firstName = newFirstName;
//        this.lastName = newLastName;
//        this.userName = newUserName;
//        this.password = newPassword;
//    }
    public void setFirstName(String newFirstName){
        this.firstName = newFirstName;
    }
    public void setLastName(String newLastName){
        this.lastName = newLastName;
    }
    public void setUserName(String newUserName){
        this.userName = newUserName;
    }
    public void setPassword(String newPassword){
        this.password = newPassword;
    }
}
