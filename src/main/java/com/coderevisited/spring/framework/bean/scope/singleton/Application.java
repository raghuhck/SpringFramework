package com.coderevisited.spring.framework.bean.scope.singleton;


import com.coderevisited.spring.framework.bean.scope.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Demonstration of singleton scope
 */
public class Application
{
    public static void main(String[] args)
    {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("com/coderevisited/spring/framework/bean/scope/singleton/Config.xml");
        Person person1 = ctx.getBean(Person.class);
        person1.setName("Surseh");
        person1.setLastName("Sajja");
        System.out.println("Person1: " + person1);

        Person person2 = ctx.getBean(Person.class);
        System.out.println("Person2: " + person2);
    }
}
