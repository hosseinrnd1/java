package myRemote;

import java.io.Serializable;

public class Person implements Serializable {
    private String food;

    public String getFood() {
        return food;
    }

    public Person setFood(String food) {
        this.food = food;
        return this;
    }

    public double getPaid() {
        return paid;
    }

    public Person setPaid(double paid) {
        this.paid = paid;
        return this;
    }

    private double paid;


}