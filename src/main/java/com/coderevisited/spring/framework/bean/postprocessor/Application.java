package com.coderevisited.spring.framework.bean.postprocessor;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Demonstration of bean postprocessor
 */
public class Application
{
    public static void main(String[] args)
    {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/coderevisited/spring/framework/bean/postprocessor/Config.xml");
        Employee person = ctx.getBean(Employee.class);
        System.out.println(person);
        ctx.registerShutdownHook();
    }
}
