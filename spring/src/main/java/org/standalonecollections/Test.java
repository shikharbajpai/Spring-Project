package org.standalonecollections;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class Test {
    private List<String> friends;
    private Map<String, Integer> feeStructure;
    private Properties properties;

    public Test() {
    }

    public Test(List<String> friends, Map<String, Integer> feeStructure, Properties properties) {
        this.friends = friends;
        this.feeStructure = feeStructure;
        this.properties = properties;
    }

    public List<String> getFriends() {
        return friends;
    }

    public void setFriends(List<String> friends) {
        this.friends = friends;
    }

    public Map<String, Integer> getFeeStructure() {
        return feeStructure;
    }

    public void setFeeStructure(Map<String, Integer> feeStructure) {
        this.feeStructure = feeStructure;
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    @Override
    public String toString() {
        return "Test{" +
                "friends=" + friends +
                ", feeStructure=" + feeStructure +
                ", properties=" + properties +
                '}';
    }
}
