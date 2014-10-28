package com.coderevisited.spring.framework.bean.lifecycle.annotation;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Person
{
    private final String name;


    public Person(String name)
    {
        this.name = name;
    }

    @PreDestroy
    public void destroy() throws Exception
    {
        System.out.println("annotations : Bean is getting destroyed");
    }

    public String toString()
    {
        return "[name:" + name + "]";
    }

    @PostConstruct
    public void init() throws Exception
    {
        System.out.println("annotations : Bean is going through init by annotations");
    }
}
