package com.tienda.resource;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.HashSet;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.container.ResourceContext;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;
import javax.ws.rs.core.UriInfo;

import com.tienda.bean.ExceptionMessage;
import com.tienda.bean.Link;
import com.tienda.bean.User;
import com.tienda.service.TiendaService;
import com.tienda.util.UserNotFoundException;

//Root Resource Class
@Path("/users")
public class UserResource {

	@Context
	private ResourceContext resourceContext;
	@Context
	private UriInfo uriInfo;

	// Resource Method
	@GET
	@Path("{uname}")
	@Produces(value = { MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	// http://localhost:8080/Tienda/users?uname=Ophelia
	// public User fetchUserDetails(@QueryParam("uname") String username) throws UserNotFoundException{
	
	// http://localhost:8080/Tienda/users/Ophelia
	public User fetchUserDetails(@PathParam("uname") String username) throws UserNotFoundException {
		User user = new TiendaService().getUserDatails(username);
		user.setLinks(new HashSet<Link>());
		
		UriBuilder baseBuilder = uriInfo.getBaseUriBuilder();
		baseBuilder.path(UserResource.class);
		baseBuilder.path(UserResource.class, "getSubResource")
					.resolveTemplate("uname", username);
		
		user.getLinks().add(new Link(UriBuilder.fromPath(baseBuilder.toTemplate()).p
												.resolveTemplate("sub-resource-name", "orders")
												.build().toString(),
									"collection",
									String.format("%s,%s",  MediaType.APPLICATION_JSON, 
															MediaType.APPLICATION_XML)));
		
		user.getLinks().add(new Link(UriBuilder.fromPath(baseBuilder.toTemplate())
												.resolveTemplate("sub-resource-name", "wishlist")
												.build().toString(),
									"collection",
									String.format("%s,%s",  MediaType.APPLICATION_JSON, 
															MediaType.APPLICATION_XML)));
		return user;
	}

	@GET
	@Produces(value={MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public List<User> fetchAllUsers(){
		return new TiendaService().getAllUsers();
	}
	
	@POST
	@Consumes(value={MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public Response createUser(User user) throws URISyntaxException{
		new TiendaService().createUser(user);
		return Response.created(new URI("http://localhost:8080/Tienda")).build();
	}
	
	@PUT
	@Consumes(value={MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public Response updateUser(User user) throws URISyntaxException{
		new TiendaService().updateUser(user);
		return Response.created(new URI("http://localhost:8080/Tienda")).build();
	}
	
	@DELETE
	@Consumes(value={MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public Response deleteUser(User user) throws URISyntaxException{
		new TiendaService().deleteUser(user);
		return Response.created(new URI("http://localhost:8080/Tienda")).build();
	}
	
	// Sub-Resource Locators
	@Path("{uname}/{sub-resource-name}")
	public Object getSubResource(@PathParam("sub-resource-name") String subResourceName) {

		if ("orders".equals(subResourceName)) {
			return resourceContext.getResource(OrderResource.class);
		} else if ("wishlist".equals(subResourceName)) {
			return resourceContext.getResource(WishlistResource.class);
		} else
			throw new WebApplicationException(Response
					.status(Response.Status.NOT_FOUND)
					.entity(new ExceptionMessage("Resource Not Found")).build());

	}
}