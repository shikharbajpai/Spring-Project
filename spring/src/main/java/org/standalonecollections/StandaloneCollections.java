package org.standalonecollections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StandaloneCollections {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("config.xml");
        Test test = (Test) applicationContext.getBean("Test");
        System.out.println(test);
        System.out.println(test.getFriends().getClass().getName());
        System.out.println(test.getFeeStructure().getClass().getName());
        System.out.println(test.getProperties().getClass().getName());
    }
}
