package org.dhanush.JpaAndHibernate.CourseProject.SpringDataJpa;

import org.dhanush.JpaAndHibernate.CourseProject.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseSpringDataJpaRepository extends JpaRepository<Course,Long> {

}
