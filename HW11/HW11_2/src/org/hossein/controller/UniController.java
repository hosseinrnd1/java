package org.hossein.controller;

import org.hossein.model.entity.Uni;
import org.hossein.model.service.UniService;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

@Path("/person")
public class UniController {
    @Path("/save")
    @GET
    @Produces("text/plain")
    public String save(@QueryParam("name") String name,@QueryParam("address") String address,@QueryParam("dateofestablished") String dateofestablished)throws Exception
    {
        Uni uni = new Uni().setName(name).setAddress(address).setDateofestablished(dateofestablished);
        UniService.getInstance().save(uni);
        return UniService.getInstance().findAll();
    }
    @Path("/findAll")
    @GET
    @Produces("text/plain")
    public String findAll()throws Exception
    {

        return UniService.getInstance().findAll();
    }
}
