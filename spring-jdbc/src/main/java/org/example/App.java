package org.example;

import controller.Student;
import dao.StudentDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class App {
    public static void main(String[] args) {
        System.out.println("Spring JDBC is started....");
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("configuration.xml");
        // creating JdbcTemplate object
/*        JdbcTemplate jdbcTemplate = applicationContext.getBean("jdbcTemplate", JdbcTemplate.class);
        // initializing insert query
        String insertQuery = "insert into student(id, name, city) values (?, ?, ?)";
        // executing insert query
        int recordInserted = jdbcTemplate.update(insertQuery, 102, "Smith", "Lucknow");
        System.out.println("Number of row affected: " + recordInserted);*/

        StudentDao studentDao = applicationContext.getBean("studentServiceImpl", StudentDao.class);

        /* Inserting new row in table */

/*        Student student = new Student();
        student.setId(103);
        student.setName("David");
        student.setCity("J&K");

        int insertedRows = studentDao.insert(student);
        System.out.println("Number of row affected: " + insertedRows);*/

//        Updating row in table

/*        Student student = new Student();
        student.setCity("UK");
        student.setName("Smith");

        int updatedRows = studentDao.update(student);
        System.out.println("Number of row affected: " + updatedRows);*/

//        Deleting row in table

/*        int studentId = 103;
        int deletedRows = studentDao.delete(studentId);
        System.out.println("Number of row affected: " + deletedRows);*/

        // Selecting single object
/*        Student student = studentDao.getStudent(101);
        System.out.println(student);*/

        // Selecting all objects
        List<Student> student = studentDao.getAllStudents();
        for(Student std: student) {
            System.out.println(std);
        }
    }
}
