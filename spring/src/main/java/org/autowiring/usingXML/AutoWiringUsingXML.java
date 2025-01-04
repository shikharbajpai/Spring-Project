package org.autowiring.usingXML;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutoWiringUsingXML {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("config.xml");
        Customer customer = (Customer) applicationContext.getBean("Customer");
        System.out.println(customer);
    }
}
