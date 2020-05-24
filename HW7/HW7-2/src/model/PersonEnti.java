package model;

public class PersonEnti {

    private String username, password,car;


    public String getUsername() {
        return username;
    }

    public PersonEnti setUsername(String username) {
        this.username = username;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public PersonEnti setPassword(String password) {
        this.password = password;
        return this;
    }

    public String getCar() {
        return car;
    }

    public PersonEnti setCar(String car) {
        this.car = car;
        return this;
    }
}

