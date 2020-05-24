package model;

public class PersonEnti {

    private String email;
    private String name, username;
    private String password;

    public String getEmail() {
        return email;
    }

    public PersonEnti setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getName() {
        return name;
    }

    public PersonEnti setName(String name) {
        this.name = name;
        return this;
    }

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
}

