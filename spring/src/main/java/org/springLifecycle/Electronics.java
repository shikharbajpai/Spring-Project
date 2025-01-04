package org.springLifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Electronics {
    private String name;

    public Electronics() {
    }

    public Electronics(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @PostConstruct
    public void start() {
       /* System.out.println("Electronics init is started");*/
    }

    @PreDestroy
    public void close() {
       /* System.out.println("Electronics destroy is closed");*/
    }

    @Override
    public String toString() {
        return "Electronics{" + "name='" + name + '\'' + '}';
    }
}
