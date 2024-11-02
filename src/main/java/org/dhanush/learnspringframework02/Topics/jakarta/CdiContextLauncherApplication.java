package org.dhanush.learnspringframework02.Topics.jakarta;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import jakarta.inject.Inject;
import jakarta.inject.Named;

/*
    In Jakarta instead of Component - Named is used
    and instead of Autowired Inject is used
    Both works the same way
 */
//@Component
@Named
class BusinessService {
    private DataService dataService;

    //@Autowired
    //setter injectin is being used in here
    @Inject
    public void setDataService(DataService dataService) {
        System.out.println("Setter Injection");
        this.dataService = dataService;
    }

    public DataService getDataService() {
        return dataService;
    }

}

//@Component
@Named
class DataService {

}

@Configuration
@ComponentScan
public class CdiContextLauncherApplication {

    public static void main(String[] args) {

        try (var context =
                     new AnnotationConfigApplicationContext
                             (CdiContextLauncherApplication.class)) {

            Arrays.stream(context.getBeanDefinitionNames())
                    .forEach(System.out::println);

            System.out.println(context.getBean(BusinessService.class)
                    .getDataService());

        }
    }
}