package org.dhanush.learnspringframework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
/*
    this is the file where we write those things which we want spring to
    handle for us.
    we should create all the beans in this file.
 */
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
    public String Person(){
        return "Person";
    }

    @Bean
    public String Person2(){
        return "Person2";
    }

    @Bean
    public String address(){
        return "Mysore";
    }
    
}