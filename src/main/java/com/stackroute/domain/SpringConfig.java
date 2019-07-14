package com.stackroute.domain;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;

@Configuration
@PropertySource("classpath:Actor-info.properties")
public class SpringConfig {


    @Bean
    public Actor actorBean()
    {
        return new Actor();
    }

    @Bean
    @Scope("prototype")
    public Movie movieBean()
    {
        Movie movie = new Movie(actorBean());
        return movie;
    }


}
