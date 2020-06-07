package model;

import model.PersonRepo;

import java.util.List;


public class PersonServ {
    private PersonServ () {
    }

    private static PersonServ personServ = new PersonServ ();

    public static PersonServ getInstance () {
        return personServ;
    }

    public void save (PersonEnti personEnti) throws Exception {
        try (PersonRepo personRepo = new PersonRepo()) {
            personRepo.insert(personEnti);
            personRepo.commit();
        }
        }
    public void getdata1(PersonEnti personEnti,String username) throws Exception {
        try (PersonRepo personRepo = new PersonRepo ()) {
            personRepo.getdata (personEnti,username);
            personRepo.commit ();
        }


    }}
