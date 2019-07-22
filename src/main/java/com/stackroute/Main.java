package com.stackroute;

import com.stackroute.domain.Movie;
import com.stackroute.domain.SpringConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main {

    public static void main(String[] args) {

        //Using ApplicationContext
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        Movie movie = context.getBean("movieBean",Movie.class);
        movie.movie();
        
        //Using Beanfactory
        BeanFactory beanFactory = new ConfigurableBeanFactory(new ClassPathResource(Config.class));
        Movie movie1 = beanFactory.getBean("movie",Movie.class); movie1.displayActorDetails();
        
        //Using BeanDefinitionRegistry 
        DefaultListableBeanFactory factory = new DefaultListableBeanFactory(); 
        BeanDefinitionRegistry beanDefinitionRegistry = new GenericApplicationContext(factory); 
        BeanDefinitionReader reader = new XmlBeanDefinitionReader(beanDefinitionRegistry);
        reader.loadBeanDefinitions(Config.class);



    }

}

