package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Spring Core Project started....");
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("config.xml");
        Student student = (Student) applicationContext.getBean("Student");
        Employee employee = (Employee) applicationContext.getBean("Employee");
        System.out.println(student);
        System.out.println(employee);

    }
}
