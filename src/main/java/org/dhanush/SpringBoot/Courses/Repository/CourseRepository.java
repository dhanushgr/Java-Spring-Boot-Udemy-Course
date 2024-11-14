package org.dhanush.SpringBoot.Courses.Repository;

import org.dhanush.SpringBoot.Courses.Bean.Courses;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Courses, Long> {

}
