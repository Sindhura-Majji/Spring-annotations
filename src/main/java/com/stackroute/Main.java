package com.stackroute;

import com.stackroute.demo.BeanLifecycleDemoBean;
import com.stackroute.domain.SpringConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;


public class Main {

    public static void main(String[] args) {

        //Using ApplicationContext
        AbstractApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        BeanLifecycleDemoBean beanLifecycleDemoBean = context.getBean(BeanLifecycleDemoBean.class);
        context.registerShutdownHook();

    }

}

