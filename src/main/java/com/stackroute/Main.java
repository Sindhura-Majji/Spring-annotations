package com.stackroute;

import com.stackroute.domain.Movie;
import com.stackroute.domain.SpringConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import java.util.Map;


public class Main {

    public static void main(String[] args) {

        //Using ApplicationContext
        AbstractApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        Movie movie = context.getBean(Movie.class);
        movie.movie();
        context.registerShutdownHook();

    }

}

