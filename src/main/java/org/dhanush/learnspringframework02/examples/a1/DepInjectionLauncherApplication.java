package org.dhanush.learnspringframework02.examples.a1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/*
    @ComponentScan should be added in this file with a package name where it
    should look for the game. the package name should be where you have
    mentioned @Component file
 */
/*
    trying to create
    BusinessClass
    Dependency 1
    Dependency 2
    to implement all 3 types of DependencyInjection
 */
@Component
class BusinessClass{
    /*
        If we dont use @Autowired then the value will be null. That means it
        is not wired. So use Autowired annotation

        This is Field Injection
     */

    //Field Injection
    //@Autowired
    Dependency1 dependency1;
    //@AutoWired
    Dependency2 dependency2;

    //Constructor Injection
    /*
        In this Constructor Injection, there is no need of mentioning
        @Autowired in here, even without it, it can run the thing and beans
        will be created. @Autowired in Constructor injection is not mandatory.
        Just create a Constructor and leave it.

        It is preferred to use Constructor Injection
     */
    //@Autowired
    public BusinessClass(Dependency1 dependency1, Dependency2 dependency2) {
        System.out.println("Constructor Injection - BusinessClass");
        this.dependency1 = dependency1;
        this.dependency2 = dependency2;
    }

    //Setter Injection
    @Autowired
    public void setDependency1(Dependency1 dependency1) {
        //for confirmation of setter injection
        System.out.println("Setter Injection - setDependency1");
        this.dependency1 = dependency1;
    }

    @Autowired
    public void setDependency2(Dependency2 dependency2) {
        //for confirmation of setter injection
        System.out.println("Setter Injection - setDependency2");
        this.dependency2 = dependency2;
    }

    @Override
    public String toString() {
        return "BusinessClass{" +
                "dependency1=" + dependency1 +
                ", dependency2=" + dependency2 +
                '}';
    }
}

@Component
class Dependency1{

}

@Component
class Dependency2{


}

@Configuration
/*
    scans the current pacakge for components, if it is in any other class then
    mention the pacakge name explicitly
 */
@ComponentScan
public class DepInjectionLauncherApplication {

    public static void main(String[] args) {

        var context =
                new AnnotationConfigApplicationContext(DepInjectionLauncherApplication.class);
        Arrays.stream(context.getBeanDefinitionNames())
                .forEach(System.out::println);

        System.out.println(context.getBean(BusinessClass.class));

    }
}
