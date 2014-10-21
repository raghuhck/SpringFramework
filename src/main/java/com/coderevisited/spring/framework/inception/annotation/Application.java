package com.coderevisited.spring.framework.inception.annotation;

import com.coderevisited.spring.framework.inception.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
        Person person = context.getBean(Person.class);
        System.out.println(person);
    }
}
