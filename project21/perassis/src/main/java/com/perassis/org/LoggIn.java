package com.perassis.org;

public class LoggIn implements Option {

    @Override
    public void display(){
        System.out.println("");
        System.out.println("Welcome to the main user menu. Please select a choice:");
        System.out.println("1: Add a task");
        System.out.println("2: Delete a task");
        System.out.println("3: ViewTask tasks");
        System.out.println("4: Exit");
        System.out.println("");
    }

}
