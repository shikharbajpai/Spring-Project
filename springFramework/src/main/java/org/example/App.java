package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        System.out.println("Spring Core Project started....");
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("configuration.xml");
        Student student = (Student) applicationContext.getBean("student");
//        Another way
//        Student student1 = applicationContext.getBean("student", Student.class);
        System.out.println(student);
        System.out.println("StudentId: " + student.getStudentId());
        System.out.println("StudentName: " + student.getStudentName());
        System.out.println("StudentClass: " + student.getStudentAddress());

        Person person = (Person) applicationContext.getBean("person");
        System.out.println(person);
        System.out.println("PersonName: " + person);

    }
}
