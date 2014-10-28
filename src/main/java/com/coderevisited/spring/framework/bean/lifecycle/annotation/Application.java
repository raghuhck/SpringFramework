package com.coderevisited.spring.framework.bean.lifecycle.annotation;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

/**
 * Demonstration of bean lifecycle using annotations
 */
public class Application
{
    public static void main(String[] args)
    {
        AbstractApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
        Person person = context.getBean(Person.class);
        System.out.println(person);
        context.close();

    }
}
