package com.stackroute.domain;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Actor {

    //Injecting name value
    @Value("${actor1.name}")
    private String name;

    //Injecting gender value
    @Value("${actor1.gender}")
    private String gender;

    //Injecting age value
    @Value("${actor1.age}")
    private int age;


    //Display method which display injected values
    public void display()
    {
        System.out.println("name is: " +name + " gender is: " +gender + " and age is: " +age );
    }

}
