package org.withoutXML;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class withoutXML {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ConfigurationClass.class);
        Appliances appliances = applicationContext.getBean("getAppliances", Appliances.class);
        appliances.running();
    }
}
