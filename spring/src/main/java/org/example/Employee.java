package org.example;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Employee {
    private int employee_id;
    private String employee_name;
    private List<String> phones;
    private Set<String> addresses;
    private Map<String, String> courses;
    private Properties properties;

    public Employee() {
    }

    public Properties getProperties() {
        return properties;
    }

    public Employee(int employee_id, String employee_name, List<String> phones, Set<String> addresses, Map<String, String> courses, Properties properties) {
        this.employee_id = employee_id;
        this.employee_name = employee_name;
        this.phones = phones;
        this.addresses = addresses;
        this.courses = courses;
        this.properties = properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    public int getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(int employee_id) {
        this.employee_id = employee_id;
    }

    public String getEmployee_name() {
        return employee_name;
    }

    public void setEmployee_name(String employee_name) {
        this.employee_name = employee_name;
    }

    public List<String> getPhones() {
        return phones;
    }

    public void setPhones(List<String> phones) {
        this.phones = phones;
    }

    public Set<String> getAddresses() {
        return addresses;
    }

    public void setAddresses(Set<String> addresses) {
        this.addresses = addresses;
    }

    public Map<String, String> getCourses() {
        return courses;
    }

    public void setCourses(Map<String, String> courses) {
        this.courses = courses;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employee_id=" + employee_id +
                ", employee_name='" + employee_name + '\'' +
                ", phones=" + phones +
                ", addresses=" + addresses +
                ", courses=" + courses +
                ", properties=" + properties +
                '}';
    }
}
