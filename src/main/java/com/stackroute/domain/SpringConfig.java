package com.stackroute.domain;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;

@Configuration
@PropertySource("classpath:Actor-info.properties")
public class SpringConfig {

    //Bean for Actor class
    @Bean
    public Actor actorBean()
    {
        return new Actor();
    }

    //Bean for Movie class and setting scope to prototype
    @Bean
    @Scope("prototype")
    public Movie movieBean()
    {
        Movie movie = new Movie(actorBean());
        return movie;
    }
}
