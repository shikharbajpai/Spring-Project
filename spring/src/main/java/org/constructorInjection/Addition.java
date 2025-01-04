package org.constructorInjection;

public class Addition {
    private final int a;
    private final int b;

    public Addition(int a, int b) {
        this.a = a;
        this.b = b;
        /* System.out.println("Integer constructor is called");*/
    }

    public Addition(double a, double b) {
        this.a = (int) a;
        this.b = (int) b;
        /*   System.out.println("Double constructor is called");*/
    }

    public Addition(String a, String b) {
        this.a = Integer.parseInt(a);
        this.b = Integer.parseInt(b);
        /*    System.out.println("String constructor is called");*/
    }

    public void sum() {
        System.out.println("The addition of two numbers " + this.a + " and " + this.b + " is: " + (this.a + this.b));
    }

    @Override
    public String toString() {
        return "Addition{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }
}
