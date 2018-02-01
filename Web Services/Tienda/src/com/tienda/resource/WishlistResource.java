package com.tienda.resource;

import javax.ws.rs.GET;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.tienda.bean.Wishlist;
import com.tienda.service.TiendaService;
import com.tienda.util.WishlistNotFoundException;

//Sub-Resource Class
public class WishlistResource {
	@GET
	@Produces(value={MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public Wishlist fetchWishlistForUser(@PathParam("uname") String username) throws WishlistNotFoundException{
		return new TiendaService().getWishlistForUser(username);
	}
}
