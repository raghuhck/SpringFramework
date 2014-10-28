package com.coderevisited.spring.framework.bean.lifecycle.xmlconfig;

public class Person
{
    private final String name;


    public Person(String name)
    {
        this.name = name;
    }

    public void init()
    {
        System.out.println("Bean is going through init");
    }

    public void destroy()
    {
        System.out.println("Bean is getting destroyed");
    }

    public String toString()
    {
        return "[name:" + name + "]";
    }
}
