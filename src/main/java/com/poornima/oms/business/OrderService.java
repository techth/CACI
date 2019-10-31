package com.poornima.oms.business;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class OrderService {

	private static List<Order> orders = new ArrayList<>();

	private static int ordersCount = 3;
	static {
		orders.add(new Order(1, "bricks", 20, false, 3));
		orders.add(new Order(2, "bricks", 20, false, 3));
		orders.add(new Order(3, "bricks", 20, false, 3));

	}

	/**
	 * Retrieve all the orders
	 * 
	 * @return
	 */
	public List<Order> retrieveOrders() {
		return orders;
	}

	/**
	 * Get a specific order
	 * 
	 * @param id
	 * @return
	 */
	public Order retrieveOrder(int id) {

		for (Order order : orders) {
			if (order.getId() == id) {
				return order;
			}
		}
		return null;
	}

	/**
	 * Create order
	 * 
	 * @param noOfBricks
	 */
	public void createOrder(int noOfBricks) {

		orders.add(new Order(++ordersCount, "bricks", 20, false, noOfBricks));
	}

	/**
	 * Update the numberOfBricks for an existing order and return a new order
	 * reference ID
	 *
	 * @param numberOfBricks
	 * @param iD
	 * @return
	 */
	public Order updateOrder(int iD, int numberOfBricks) {

		for (Order order : orders) {
			if (order.getId() == iD) {
				System.out.println("IDs are equal");
				if (order.getIsDispatched() == false) {
					System.out.println("getIsDispatched() == false");
					order.setNoOfBricks(numberOfBricks);
					order.setId(++ordersCount); // a unique updated reference is
												// set to the order
					return order;
				}
			}
		}
		return null;
	}

	/**
	 * when there is a request to fullfill a particular order, with reference
	 * number, should set isDispatched is equal to true
	 * 
	 * @param id
	 */
	public void fullfillOrder(int id) {
		for (Order order : orders) {
			if (order.getId() == id) {
				order.setIsDispatched(Boolean.TRUE);
			}
		}
	}

}