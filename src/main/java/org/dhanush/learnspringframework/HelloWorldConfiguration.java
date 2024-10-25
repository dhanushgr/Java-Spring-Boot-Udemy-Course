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
}