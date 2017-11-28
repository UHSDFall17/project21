package com.perassis.org;

import javax.xml.bind.SchemaOutputResolver;

public class SignIn implements Option {

    @Override
    public void display(){
        System.out.println("");
        System.out.println("Welcome to Perassis. Please select from the choices below:");
        System.out.println("1: Sign in - existing user");
        System.out.println("2: Register - new user");
        System.out.println("3: Exit - quit program");
        System.out.print("Please enter 1, 2, or 3: ");
        System.out.println("");
    }

}
