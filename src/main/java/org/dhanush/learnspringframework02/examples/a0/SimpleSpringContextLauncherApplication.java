package org.dhanush.learnspringframework02.examples.a0;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

/*
    @ComponentScan should be added in this file with a package name where it
    should look for the game. the package name should be where you have
    mentioned @Component file
 */
@Configuration
@ComponentScan
public class SimpleSpringContextLauncherApplication {

    public static void main(String[] args) {

        var context =
                new AnnotationConfigApplicationContext(SimpleSpringContextLauncherApplication.class);
        Arrays.stream(context.getBeanDefinitionNames())
                .forEach(System.out::println);

    }
}
