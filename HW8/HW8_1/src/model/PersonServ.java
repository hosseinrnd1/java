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
        try (PersonRepo personRepo = new PersonRepo ()) {
            personRepo.insert (personEnti);
            personRepo.commit ();
        }
    }

    public void check(String username ,String password) throws Exception {
        try (PersonRepo personRepo = new PersonRepo ()) {
            personRepo.selectuserandpass(username,password);
        }
    }




}
