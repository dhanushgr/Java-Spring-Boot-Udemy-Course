/*
    This whole package is created so that,
    when we run the application, it should take the repositories information
    and run those commands.
 */

package org.dhanush.JpaAndHibernate.CourseProject;


import org.dhanush.JpaAndHibernate.CourseProject.Jpa.CourseJpaRepository;
import org.dhanush.JpaAndHibernate.CourseProject.SpringDataJpa.CourseSpringDataJpaRepository;
import org.dhanush.JpaAndHibernate.CourseProject.jdbc.CourseJdbcRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {

//    @Autowired
//    private CourseJdbcRepository repository;

//    @Autowired
//    private CourseJpaRepository repository;

    @Autowired
    private CourseSpringDataJpaRepository repository;

    @Override
    public void run(String... args) throws Exception {
        repository.save(new Course(1, "JAVA PROGRAMMING", "DHANUSH"));
        repository.save(new Course(2, "JAVA SPRINGBOOT", "DHANUSH"));
        repository.save(new Course(3, "DevOps", "DHANUSH"));
        repository.save(new Course(4, "software development", "DHANUSH"));

        repository.deleteById(2l);

        System.out.println(repository.findById(3l));
        System.out.println(repository.findById(1l));

        System.out.println(repository.findAll());

    }
}
