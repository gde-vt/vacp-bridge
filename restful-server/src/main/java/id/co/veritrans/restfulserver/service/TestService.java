package id.co.veritrans.restfulserver.service;

import id.co.veritrans.vacp.client.ws.ReplyMessage;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Created by gde on 1/14/15.
 */
@Path("/test")
public interface TestService {

    @GET
    @Path("/hello")
    @Produces({MediaType.TEXT_PLAIN})
    public String hello();

    @GET
    @Path("/sendSampleRequest")
    @Produces({MediaType.APPLICATION_XML})
    public ReplyMessage sendSampleRequest();
}
