package com.coderevisited.spring.framework.inception.annotation;

import com.coderevisited.spring.framework.inception.Address;
import com.coderevisited.spring.framework.inception.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig
{

    @Bean
    public Person getPerson()
    {
        return new Person("Suresh", getAddress());
    }

    @Bean
    public Address getAddress()
    {
        return new Address("Hyderabad", "India", 500085);
    }


}
