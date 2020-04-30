package com.company;

public class
Person {
    private String name;
    private String family;
    private int age;
    private int pass;
    private String username;
    private String job;
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setFamily(String family) {
        this.family = family;
    }


    public String getFamily() {
        return family;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public int getAge() {
        return age;
    }

    public void setPass(int pass) {
        this.pass = pass;
    }

    public int getPass() {
        return pass;
    }



    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }
    public String toString(){
       return String.format("name and family and age and pass and username and job is%n%s%n%s%n%d%n%d%n%s%n%s%n ",name,family,age,pass,username,job);
    }
}
