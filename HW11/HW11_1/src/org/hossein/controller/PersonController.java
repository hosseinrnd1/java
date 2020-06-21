package org.hossein.controller;

import org.hossein.model.entity.Person;
import org.hossein.model.service.PersonService;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

@Path("/person")
public class PersonController {
    @Path("/save")
    @GET
    @Produces("text/plain")
    public String save(@QueryParam("id") String id,@QueryParam("name") String name,@QueryParam("family") String family,@QueryParam("grade") String grade)throws Exception
    {
        Person person = new Person().setId(Long.parseLong(id)).setName(name).setFamily(family).setGrade(Double.parseDouble(grade));
        PersonService.getInstance().save(person);
        return PersonService.getInstance().findAll();
    }
    @Path("/findAll")
    @GET
    @Produces("text/plain")
    public String findAll()throws Exception
    {

        return PersonService.getInstance().findAll();
    }
}
