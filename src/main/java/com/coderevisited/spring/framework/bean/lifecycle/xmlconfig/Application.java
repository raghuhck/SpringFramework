package com.coderevisited.spring.framework.bean.lifecycle.xmlconfig;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application
{
    public static void main(String[] args)
    {
        AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("com/coderevisited/spring/framework/bean/lifecycle/xmlconfig/Config.xml");
        Person person = ctx.getBean(Person.class);
        System.out.println(person);
        ctx.registerShutdownHook();
    }

}
