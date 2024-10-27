package org.dhanush.learnspringframework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
/*
    this is the file where we write those things which we want spring to
    handle for us.
    we should create all the beans in this file.
 */
record Person(String name, int age){};
record Address(String firstLine, String city){};

@Configuration
public class HelloWorldConfiguration {

    @Bean
    public String name(){
        return "Dhanush";
    }

    @Bean
    public int age(){
        return 22;
    }

    @Bean
    public Person person(){
        return new Person("Dhanush", 22);
    }

    @Bean
    public Person person2(){
        return new Person("Danny",23);
    }

    @Bean
    public Address address(){
        return new Address("vivekananda nagar","Mysore");
    }

    /*
        2 methods to use other objects to be used in our bean
        1. Method call
        2. Method Parameters
     */

    @Bean
    public Person person2MethodCall(){
        return new Person(name(), age());
    }

    
}