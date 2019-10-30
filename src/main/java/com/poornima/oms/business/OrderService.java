package com.poornima.oms.business;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class OrderService {

	private static List<Order> orders = new ArrayList<>();

	private static int ordersCount= 3;
	static {
		orders.add(new Order(1, "first", 20, false, 3));
		orders.add(new Order(2, "second", 20, false, 3));
		orders.add(new Order(3, "third", 20, false, 3));

	}

	public List<Order> retrieveOrders() {
		return orders;
	}

	public Order retrieveOrder(int id) {

		for (Order order : orders) {
			if (order.getId() == id) {
				return order;
			}
		}
		return null;
	}

	public void createOrder(int noOfBricks) {
		
		orders.add(new Order(++ordersCount,"fourth",20, false,noOfBricks));
	}

}
