package org.withoutXML;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages = "org.withoutXML")
public class ConfigurationClass {
    @Bean
    public Frames getFrames() {
        return new Frames();
    }

    @Bean
    public Appliances getAppliances() {
        return new Appliances(getFrames());
    }
}
