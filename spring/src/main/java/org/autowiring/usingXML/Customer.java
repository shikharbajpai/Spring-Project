package org.autowiring.usingXML;

public class Customer {
    private Identity identity;

    public Customer() {
    }

    public Customer(Identity identity) {
        this.identity = identity;
    }

    public Identity getIdentity() {
        return identity;
    }

    public void setIdentity(Identity identity) {
        this.identity = identity;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "identity=" + identity +
                '}';
    }
}
