package org.example;

import javax.persistence.*;
import java.util.Arrays;
import java.util.Date;

@Entity
@Table(name = "student_address")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "address_id")
    private int id;
    @Column(length = 50)
    private String street;
    @Column(length = 100)
    private String city;
    private boolean isCityOpen;
    @Transient
    private double x;
    @Column(name = "date_added")
    @Temporal(TemporalType.DATE)
    private Date addedDate;
    @Lob
    private byte[] image;

    public Address() {
    }

    public Address(int id, String street, String city, boolean isCityOpen, double x, Date addedDate, byte[] image) {
        this.id = id;
        this.street = street;
        this.city = city;
        this.isCityOpen = isCityOpen;
        this.x = x;
        this.addedDate = addedDate;
        this.image = image;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public boolean isCityOpen() {
        return isCityOpen;
    }

    public void setCityOpen(boolean cityOpen) {
        isCityOpen = cityOpen;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public Date getAddedDate() {
        return addedDate;
    }

    public void setAddedDate(Date addedDate) {
        this.addedDate = addedDate;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "Address{" +
                "id=" + id +
                ", street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", isCityOpen=" + isCityOpen +
                ", x=" + x +
                ", addedDate=" + addedDate +
                ", image=" + Arrays.toString(image) +
                '}';
    }
}
