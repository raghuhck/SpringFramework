package com.coderevisited.spring.framework.bean.lifecycle.callback;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Person implements InitializingBean, DisposableBean
{
    private final String name;


    public Person(String name)
    {
        this.name = name;
    }

    @Override
    public void destroy() throws Exception
    {
        System.out.println("Bean is getting destroyed");
    }

    public String toString()
    {
        return "[name:" + name + "]";
    }

    @Override
    public void afterPropertiesSet() throws Exception
    {
        System.out.println("Bean is going through init");
    }
}
