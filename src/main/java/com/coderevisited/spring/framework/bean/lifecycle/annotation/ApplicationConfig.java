package com.coderevisited.spring.framework.bean.lifecycle.annotation;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig
{
    @Bean
    public Person getPerson()
    {
        return new Person("Suresh");
    }
}
