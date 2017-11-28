package com.perassis.org;

import com.sun.org.apache.xpath.internal.SourceTree;

public class ViewTask implements Option {

    @Override
    public void display(){
        System.out.println("");
        System.out.println("1. Today's tasks");
        System.out.println("2. Tomorrow's tasks");
        System.out.println("3. Remaining tasks");
        System.out.println("4. Exit");
        System.out.println("");
    }

}
