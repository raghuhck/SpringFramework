package com.coderevisited.spring.framework.inception.config;

import com.coderevisited.spring.framework.inception.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

    public static void main(String[] args) {

        ApplicationContext ctx = new ClassPathXmlApplicationContext("com/coderevisited/spring/framework/inception/config/Config.xml");
        Person person = ctx.getBean(Person.class);
        System.out.println(person);

    }
}

