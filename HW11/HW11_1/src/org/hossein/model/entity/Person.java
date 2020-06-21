package org.hossein.model.entity;

public class Person {
    private long id;
    private String name;
    private String family;
    private double grade;



    public Person (long id, String name, String family,double grade) {
        this.id = id;
        this.name = name;
        this.family = family;
        this.grade=grade;
    }
    public Person () {
    }

    public double getGrade() {
        return grade;
    }

    public Person setGrade(double grade) {
        this.grade = grade;
        return this;
    }

    public long getId() {
        return id;
    }

    public Person setId(long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Person setName(String name) {
        this.name = name;
        return this;
    }

    public String getFamily() {
        return family;
    }

    public Person setFamily(String family) {

        this.family = family;
        return this;
    }
}
