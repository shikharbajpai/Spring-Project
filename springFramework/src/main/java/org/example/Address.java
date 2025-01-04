package org.example;

public class Address {
    private int addressId;
    private String address;

    public Address() {
    }

    public Address(int addressId, String address) {
        this.addressId = addressId;
        this.address = address;
    }

    public int getAddressId() {
        return addressId;
    }

    public void setAddressId(int addressId) {
        this.addressId = addressId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Address{" +
                "addressId=" + addressId +
                ", address='" + address + '\'' +
                '}';
    }
}
