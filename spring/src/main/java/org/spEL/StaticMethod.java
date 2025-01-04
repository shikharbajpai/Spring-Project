package org.spEL;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StaticMethod {
    public static void main(String[] args) {
        ApplicationContext applicationContext =new ClassPathXmlApplicationContext("config.xml");
        Operations operations = applicationContext.getBean("operations", Operations.class);
        System.out.println(operations);
    }
}
