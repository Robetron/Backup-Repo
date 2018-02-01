package com.tienda.resource;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Set;

import javax.ws.rs.Consumes;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.tienda.bean.Order;
import com.tienda.bean.User;
import com.tienda.service.TiendaService;
import com.tienda.util.OrderNotFoundException;

//Sub-Resource Class
public class OrderResource {
	//Resource Method
	@GET
	@Path("{order-number}")
	@Produces(value={MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public Order fetchOrdersForUser(@PathParam("uname") String username, 
									@PathParam("order-number") String orderNumber,
									@DefaultValue("application/xml") @HeaderParam("Accept")String headerValue) throws OrderNotFoundException{
		return new TiendaService().getOrderDatailsForUser(username, orderNumber);
	}
	
	@GET
	@Produces(value={MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public Set<Order> fetchAllOrdersForUser(@PathParam("uname") String username){
		return new TiendaService().getAllOrdersForUser(username);
	}
	
	@POST
	@Consumes(value={MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public Response createOrder(Order order) throws URISyntaxException, OrderNotFoundException{
		new TiendaService().createOrder(order);
		return Response.created(new URI("http://localhost:8080/Tienda")).build();
	}
	@PUT
	@Consumes(value={MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public Response updateOrder(Order order) throws URISyntaxException{
		new TiendaService().updateOrder(order);
		return Response.created(new URI("http://localhost:8080/Tienda")).build();
	}
}
