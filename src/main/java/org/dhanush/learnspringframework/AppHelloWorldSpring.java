/*
    if there was a main method in the class then we can consider that
    the JVM is running

 */

package org.dhanush.learnspringframework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppHelloWorldSpring {
    public static void main(String[] args) {
        // 1. Launch a Spring context

        var context =
                new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);

        // 2. Configure the things that we want Spring to manage.
        // by -@Configuration

    }
}
