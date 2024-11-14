package org.dhanush.JpaAndHibernate.Course.jdbc;

import org.dhanush.JpaAndHibernate.Course.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CourseJdbcRepository {

    @Autowired
    private JdbcTemplate springJdbcTemplate;

    /*
        you can do this manually in the H2 Console server too, by writing the
         sql command in it.
         If we want to run lal the query in the program itself then, you
         should create a class like this with the annotation as @Repository
         and start writing the code.
     */
    private static String QUERY = """
            insert into course(id, name, author)
            values(?,?,?)
            """;

    private static String DeleteQuery = """
            delete from course where id = ?
            """;

    private static String SelectById = """
            select * from course
            where id = ?
            """;

    public void insert(Course course){
        springJdbcTemplate.update(QUERY,
                course.getId(),course.getName(),course.getAuthor());
    }

    public void delete(long id){
        springJdbcTemplate.update(DeleteQuery, 2);
    }

    public Course findById(long id){
        return springJdbcTemplate.queryForObject(SelectById,
                new BeanPropertyRowMapper<>(Course.class), id);

    }

}
