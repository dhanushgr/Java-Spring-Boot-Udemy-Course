/*
    if there was a main method in the class then we can consider that
    the JVM is running
    we have created a spring context in here
    by AnnotationConfigApplicationContext and put that to the var context.

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
        System.out.println(context.getBean("name")); //This calls the
        // bean[method] which is named as name. should be in "" rather than
        // name()

        System.out.println(context.getBean("age"));
        System.out.println(context.getBean("person"));
        System.out.println(context.getBean("person2"));
        System.out.println(context.getBean("address"));
        System.out.println(context.getBean("person2MethodCall"));


    }
}
