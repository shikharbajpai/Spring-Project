package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.Date;

public class App {
    public static void main(String[] args) {
        System.out.println("Hibernate Project Started...");
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory sessionFactory = cfg.buildSessionFactory();
        System.out.println("SessionFactory: " + sessionFactory);

        // creating object of Student class
        Student student = new Student();
        student.setId(102);
        student.setName("Thomas");
        student.setCity("Delhi");

        // creating object of Certificate class used as Annotation Embeddable
        Certificate certificate = new Certificate();
        certificate.setCourse("Hibernate");
        certificate.setDuration("3 months");

        student.setCertificate(certificate);
        System.out.println(student);

        // creating object of Address class
        Address address = new Address();
        address.setStreet("Street2");
        address.setCity("Lucknow");
        address.setCityOpen(true);
        address.setAddedDate(new Date());
        address.setX(23.545d);
        System.out.println(address);

        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(student);
        session.save(address);
        transaction.commit();
        session.close();
        sessionFactory.close();
    }
}
