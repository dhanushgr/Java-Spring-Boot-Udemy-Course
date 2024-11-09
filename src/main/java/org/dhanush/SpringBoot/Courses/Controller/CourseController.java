package org.dhanush.SpringBoot.Courses.Controller;

import org.dhanush.SpringBoot.Courses.Bean.Courses;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CourseController {

    @GetMapping("/Courses")
    public List<Courses> getAllCourses(){
        return Arrays.asList(new Courses(1, "Java Programming", "Dhanush"));
    }

}
