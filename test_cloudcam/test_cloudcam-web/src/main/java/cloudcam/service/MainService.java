/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cloudcam.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import remote.bean.entity.Account;
import remote.bean.util.BasicBeanProvider;

/**
 *
 * @author Luong
 */
@Path("service")
public class MainService {
    
    @GET
    @Path("helloworld1")
    @Produces(MediaType.APPLICATION_JSON)
    public String getHelloWorld(){
        return "Hello world";
    }
    @GET
    @Path("test")
    @Produces(MediaType.APPLICATION_JSON)
    public Account getAccount(@QueryParam("id") int id){
        Account account= BasicBeanProvider.getAccountBean().getAccountByID(id);
        return account;
    }
}
