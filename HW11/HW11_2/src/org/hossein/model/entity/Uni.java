package org.hossein.model.entity;

public class Uni {
    private String name;
    private String address;
    private String dateofestablished;

    public String getName() {
        return name;
    }

    public Uni setName(String name) {
        this.name = name;
        return this;
    }

    public String getAddress() {
        return address;
    }

    public Uni setAddress(String address) {
        this.address = address;
        return this;
    }

    public String getDateofestablished() {
        return dateofestablished;
    }

    public Uni setDateofestablished(String dateofestablished) {
        this.dateofestablished = dateofestablished;
        return this;
    }

    public Uni() {
    }

    public Uni( String name, String address,String dateofestablished) {
        this.name = name;
        this.address = address;
        this.dateofestablished = dateofestablished;
    }
}