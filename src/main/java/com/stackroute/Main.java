package com.stackroute;

import com.stackroute.domain.Movie;
import com.stackroute.domain.SpringConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main {

    public static void main(String[] args) {
        
        //Using ApplicationContext
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        Movie movie1 = context.getBean(Movie.class);
        movie1.movie();
        Movie movie2=context.getBean(Movie.class);
        movie2.movie();
        
        //checking bean scope
        System.out.println(movie1==movie2);

    }

}

