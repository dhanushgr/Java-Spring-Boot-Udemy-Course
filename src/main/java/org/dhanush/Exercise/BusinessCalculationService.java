package org.dhanush.Exercise;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Arrays;

//This class is like GameRunner Class
@Component
public class BusinessCalculationService {

    private DataService dataService;

    //Constructor Dependency Injection
    public BusinessCalculationService(DataService dataService) {
        this.dataService = dataService;
    }

    int findMax(){
        return Arrays.stream(dataService.retrieveData())
                .max()
                .orElse(0);
    }

}
