package org.manyToManyMapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.List;

public class ManyToManyMapping {
    public static void main(String[] args) {
        System.out.println("Hibernate Project Started...");
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory sessionFactory = cfg.buildSessionFactory();
        System.out.println("SessionFactory: " + sessionFactory);

        // creating object of Employee class
        Employee employee1 = new Employee();
        Employee employee2 = new Employee();

        employee1.setEmployee_id(12);
        employee1.setEmployee_name("Ram");

        employee2.setEmployee_id(13);
        employee2.setEmployee_name("Shyam");

        // creating object of Projects class
        Projects project1 = new Projects();
        Projects project2 = new Projects();

        project1.setProject_id(45);
        project1.setProject_name("Java");

        project2.setProject_id(56);
        project2.setProject_name("Angular");

        // creating employeeList
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(employee1);
        employeeList.add(employee2);

        //creating projectsList
        List<Projects> projectsList = new ArrayList<>();
        projectsList.add(project1);
        projectsList.add(project2);

        employee1.setProjects(projectsList);
        project2.setEmployees(employeeList);


        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(employee1);
        session.save(employee2);
        session.save(project1);
        session.save(project2);
        transaction.commit();
        session.close();
        sessionFactory.close();
    }
}
