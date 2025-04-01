package com.vladprado.resource;

import com.vladprado.model.Order;

import io.quarkus.security.Authenticated;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.eclipse.microprofile.jwt.JsonWebToken;
import org.jboss.logging.Logger;

import java.util.List;

@Path("/api/orders")
@RequestScoped
@Authenticated
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class OrderResource {

    @Inject
    JsonWebToken jwt;

    @Inject
    Logger log;

    @GET
    public Response listOrders() {
        log.info("Fetching orders for user: " + jwt.getName());
        List<Order> orders = Order.listAll();
        return Response.ok(orders).build();
    }

    @POST
    @Transactional
    public Response createOrder(Order order) {
        if (order.customerName == null || order.customerName.isBlank()) {
            return Response.status(Response.Status.BAD_REQUEST).entity("Customer name is required").build();
        }
        order.persist();
        return Response.status(Response.Status.CREATED).build();
    }
}