package org.constructorInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class constructorInjection {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("config.xml");
        Person person = (Person) applicationContext.getBean("Person");
        Addition addition = (Addition) applicationContext.getBean("Addition");
        System.out.println(person);
        addition.sum();

    }
}
