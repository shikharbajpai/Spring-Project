package org.spEL;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Operations {
    @Value("#{ T(java.lang.Math).sqrt(25) }")
    private double sqrt;

    @Value("#{ T(java.lang.Math).E }")
    private double e;

    @Value("#{ new java.lang.String('Mathematical Operations') }")
    private String name;

    @Value("#{ 8 > 3 }")
    private boolean isActive;

    public Operations() {
    }

    public Operations(double sqrt) {
        this.sqrt = sqrt;
    }

    public double getSqrt() {
        return sqrt;
    }

    public void setSqrt(double sqrt) {
        this.sqrt = sqrt;
    }

    public double getE() {
        return e;
    }

    public void setE(double e) {
        this.e = e;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    @Override
    public String toString() {
        return "Operations{" +
                "sqrt=" + sqrt +
                ", e=" + e +
                ", name='" + name + '\'' +
                ", isActive=" + isActive +
                '}';
    }
}
