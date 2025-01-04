package org.springLifecycle;

public class Vehicle {
    private int vehicle_id;
    private String vehicle_type;

    public Vehicle() {
    }

    public Vehicle(int vehicle_id, String vehicle_type) {
        this.vehicle_id = vehicle_id;
        this.vehicle_type = vehicle_type;
    }

    public int getVehicle_id() {
        return vehicle_id;
    }

    public void setVehicle_id(int vehicle_id) {
        this.vehicle_id = vehicle_id;
    }

    public String getVehicle_type() {
        return vehicle_type;
    }

    public void setVehicle_type(String vehicle_type) {
        this.vehicle_type = vehicle_type;
    }

    public void init() {
        /*System.out.println("Init method is called");*/
    }

    public void destroy() {
        /*System.out.println("Destroy method is called");*/
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "vehicle_id=" + vehicle_id +
                ", vehicle_type='" + vehicle_type + '\'' +
                '}';
    }
}
