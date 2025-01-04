package org.springLifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class springLifeCycle {
    public static void main(String[] args) {
        AbstractApplicationContext applicationContext = new ClassPathXmlApplicationContext("config.xml");
        Vehicle vehicle = (Vehicle) applicationContext.getBean("Vehicle");
        Sports sports = (Sports) applicationContext.getBean("Sports");
        Electronics electronics = (Electronics) applicationContext.getBean("Electronics");
        System.out.println(vehicle);
        System.out.println(sports);
        System.out.println(electronics);
        applicationContext.registerShutdownHook();

    }
}
