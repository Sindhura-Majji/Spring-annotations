package com.stackroute.domain;

import org.springframework.beans.factory.annotation.Value;


public class Actor {


    @Value("${actor1.name}")
    private String name;

    @Value("${actor1.gender}")
    private String gender;

    @Value("${actor1.age}")
    private int age;


    //Display method which display injected values
    public void display()
    {
        System.out.println("name is: " +name + " gender is: " +gender + " and age is: " +age );
    }

}
