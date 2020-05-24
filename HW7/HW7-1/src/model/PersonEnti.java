package model;

public class PersonEnti {

    private String username, password;
    private double hajm, price;

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

    public double getHajm() {
        return hajm;
    }

    public PersonEnti setHajm(double hajm) {
        this.hajm = hajm;
        return this;
    }

    public double getPrice() {
        return price;
    }

    public PersonEnti setPrice(double price) {
        this.price = price;
        return this;
    }
}

