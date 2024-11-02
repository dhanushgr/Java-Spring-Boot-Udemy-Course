package org.dhanush.learnspringframework02.Topics.Lazy;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

/*
    @ComponentScan should be added in this file with a package name where it
    should look for the game. the package name should be where you have
    mentioned @Component file
 */

@Component
class ClassA{

}

@Component
@Lazy
class ClassB{
    private ClassA classA;

    public ClassB(ClassA classA) {
        System.out.println("Some Initialization");
        this.classA = classA;
    }

    public void doSomething(){
        System.out.println("Do Something !!");
    }
}

@Configuration
@ComponentScan
public class LazyInitializerLauncherApplication {

    public static void main(String[] args) {

        var context =
                new AnnotationConfigApplicationContext(LazyInitializerLauncherApplication.class);
//        Arrays.stream(context.getBeanDefinitionNames())
//                .forEach(System.out::println);

        System.out.println("Initialization is complete");
        context.getBean(ClassB.class).doSomething();
    }
}
