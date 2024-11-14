/*
    This whole package is created so that,
    when we run the application, it should take the repositories information
    and run those commands.
 */

package org.dhanush.JpaAndHibernate.Course.jdbc;


import org.dhanush.JpaAndHibernate.Course.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseJdbcCommandLineRunner implements CommandLineRunner {

    @Autowired
    private CourseJdbcRepository repository;

    @Override
    public void run(String... args) throws Exception {
        repository.insert(new Course(1, "JAVA PROGRAMMING", "DHANUSH"));
        repository.insert(new Course(2, "JAVA SPRINGBOOT", "DHANUSH"));
        repository.insert(new Course(3, "DevOps", "DHANUSH"));
        repository.insert(new Course(4, "software development", "DHANUSH"));

        repository.delete(2);

        System.out.println(repository.findById(3));
        System.out.println(repository.findById(1));
    }
}
