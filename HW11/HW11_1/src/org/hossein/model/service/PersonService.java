package org.hossein.model.service;


import org.hossein.model.entity.Person;
import org.hossein.model.repository.PersonDA;

public class PersonService {
    private static PersonService personService = new PersonService();

    private PersonService () {
    }

    public static PersonService getInstance() {
        return personService;
    }

    public void save(Person person) throws Exception {
        try (PersonDA personDA = new PersonDA()) {
            personDA.insert(person);
        }
    }

    public String findAll() throws Exception {
        try (PersonDA personDA = new PersonDA()) {
            return personDA.select();
        }
    }
}
