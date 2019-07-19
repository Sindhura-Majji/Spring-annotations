package com.stackroute.demo;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;



@Component
//Implementing InitializingBean, DisposableBean
public class BeanLifecycleDemoBean implements InitializingBean, DisposableBean {
    @Override
    public void destroy() throws Exception {
        System.out.println("destroy");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Initializer");
    }

    //customInit method
    public void customInit()
    {
        System.out.println("customInit Bean");
    }

    //customDestroy method
    public void customDestroy()
    {
        System.out.println("customDestroy Bean");
    }
}
