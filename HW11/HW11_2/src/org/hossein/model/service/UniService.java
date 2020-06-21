package org.hossein.model.service;


import org.hossein.model.entity.Uni;
import org.hossein.model.repository.UniDA;

public class UniService {
    private static UniService uniService = new UniService();

    private UniService() {
    }

    public static UniService getInstance() {
        return uniService;
    }

    public void save(Uni uni) throws Exception {
        try (UniDA uniDA = new UniDA()) {
            uniDA.insert(uni);
        }
    }

    public String findAll() throws Exception {
        try (UniDA uniDA = new UniDA()) {
            return uniDA.select();
        }
    }
}
