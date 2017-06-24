/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.gen_project.services;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 *
 * @author yann-
 * */

@Path("/ws")
public class MessageRestService {

    /* Pour voir si ça marche */
    @GET()
    @Path("hello")
    public String hello() {
        return "Hello";
    }

}
