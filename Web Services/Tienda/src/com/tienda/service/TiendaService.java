package com.tienda.service;

import java.util.List;
import java.util.Set;

import com.tienda.bean.Order;
import com.tienda.bean.Product;
import com.tienda.bean.User;
import com.tienda.bean.Wishlist;
import com.tienda.util.DataStore;
import com.tienda.util.OrderNotFoundException;
import com.tienda.util.ProductNotFoundException;
import com.tienda.util.UserNotFoundException;
import com.tienda.util.WishlistNotFoundException;

public class TiendaService {
	public User getUserDatails(String username) throws UserNotFoundException{
		return new DataStore().getUser(username);
	}
	public Product getProductDatails(String code) throws ProductNotFoundException{
		return new DataStore().getProduct(code);
	}
	public Order getOrderDatailsForUser(String username, String orderNumber) throws OrderNotFoundException{
		return new DataStore().getOrderForUser(username, orderNumber);
	}
	public void createOrder(Order order) throws OrderNotFoundException{
		new DataStore().createOrder(order);
	}
	public Set<Order> getAllOrdersForUser(String username){
		return new DataStore().getAllOrdersForUser(username);
	}
	public Wishlist getWishlistForUser(String username) throws WishlistNotFoundException {
		return new DataStore().getWishlistForUser(username);
	}
	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		return new DataStore().getAllUsers();
	}
	public void createUser(User user) {
		new DataStore().createUser(user);
	}
	public void updateUser(User user) {
		new DataStore().updateUser(user);		
	}
	public void deleteUser(User user) {
		new DataStore().deleteUser(user);
	}
	public void updateOrder(Order order) {
		new DataStore().updateOrder(order);		
	}
}
