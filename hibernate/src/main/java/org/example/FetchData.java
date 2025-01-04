package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FetchData {
    public static void main(String[] args) {
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory sessionFactory = cfg.buildSessionFactory();
        Session session = sessionFactory.openSession();

        // Through get() method
        Address address = session.get(Address.class, 1);
        System.out.println(address);

        // Though load() method
        Student student = session.load(Student.class, 101);
        System.out.println(student);

        session.close();
        sessionFactory.close();
    }
}
