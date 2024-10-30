package org.dhanush.learnspringframework.HelloWorld;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
/*
    this is the file where we write those things which we want spring to
    handle for us.
    we should create all the beans in this file.

    we can reuse the Existing Spring Bean for auto wiring in 2 ways
    1. Method call
    2. Method Parameters
 */
record Person(String name, int age){};
record Address(String firstLine, String city){};
record Person2(String name, int age, Address address){};  //added
// address as a argument here

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

    //by Method Call
    @Bean
    public Person2 person2MethodCall()
    {
        return new Person2(name(), age(), address());
    }

    //by parameter
    @Bean
    public Person2 person3Parameter(String name, int age, Address address){
        return new Person2(name, age, address());
    }
    
}