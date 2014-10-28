package com.coderevisited.spring.framework.bean.scope;

public class Person
{
    private String name;
    private String lastName;


    public String toString()
    {
        return "[name:" + name + "]," + "[lastName:" + lastName + "]";
    }


    public void setName(String name)
    {
        this.name = name;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }
}
