package com.stackroute.domain;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class Movie implements ApplicationContextAware, BeanFactoryAware, BeanNameAware {


    //Actor Class Initialisation
    //Using Autowired annotation
    @Autowired
    private Actor actor;

    public Movie(Actor actor) {
        this.actor = actor;
    }


    //Method movie which point to Actor class display method
    public void movie()
    {
        System.out.println("In the movie");

        actor.display();
    }


    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("BeanFactory is: "+beanFactory);
    }

    @Override
    public void setBeanName(String beanName) {
        System.out.println("The name of the bean is:" +beanName);

    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("Implemented ApplicationContextAware");
    }
}

