package com.coderevisited.spring.framework.bean.lifecycle.callback;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Demonstration of bean life cycle through Callback methods
 */
public class Application
{
    public static void main(String[] args)
    {
        AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("com/coderevisited/spring/framework/bean/lifecycle/callback/Config.xml");
        Person person = ctx.getBean(Person.class);
        System.out.println(person);
        ctx.registerShutdownHook();
    }

}
