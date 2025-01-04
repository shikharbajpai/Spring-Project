package org.autowiring.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Child {
    @Autowired
    @Qualifier("AnotherParent")
    private Parent parent;

    public Child() {
    }

    public Child(Parent parent) {
        this.parent = parent;
    }

    public Parent getParent() {
        return parent;
    }

    public void setParent(Parent parent) {
        this.parent = parent;
    }

    @Override
    public String toString() {
        return "Child{" +
                "parent=" + parent +
                '}';
    }
}
