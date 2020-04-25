package com.company;

public class Person {
    private String name;
    private String family;
    private int age;
    public Person(String name,String family,int age){
        this.name=name;
        this.family=family;
        this.age=age;
    }
    public String getName(){return name;}
    public String getFamily(){return family;}
    public int getAge(){return age;}


}

