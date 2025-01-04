package org.stereotypeAnnotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StereoTypeCollections {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("config.xml");
        Weather weather = applicationContext.getBean("weather", Weather.class);
        System.out.println(weather);
    }
}
