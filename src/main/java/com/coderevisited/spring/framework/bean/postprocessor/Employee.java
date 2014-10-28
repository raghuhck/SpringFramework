package com.coderevisited.spring.framework.bean.postprocessor;

public class Employee
{
    private final String name;


    public Employee(String name)
    {
        this.name = name;
    }

    public void init()
    {
        System.out.println("Employee Bean is going through init");
    }

    public void destroy()
    {
        System.out.println("Employee Bean is getting destroyed");
    }

    public String toString()
    {
        return "[name:" + name + "]";
    }
}
