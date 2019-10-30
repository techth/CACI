package com.poornima.oms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.poornima.oms.business.Order;
import com.poornima.oms.business.OrderService;

@RestController
public class OrderController {

	@Autowired
	private OrderService orderService;
	
	@RequestMapping("/getOrder/{id}")
    public Order getOrder(@PathVariable int id) {
        return orderService.retrieveOrder(id);
    }
	
	@RequestMapping("/retrieveOrders")
    public List<Order> retrieveOrders() {
        return orderService.retrieveOrders();
    }
	
	@RequestMapping("/createOrder/{numberOfBricks}")
    public void createOrder(@PathVariable int numberOfBricks) {
        orderService.createOrder(numberOfBricks);
    }
}
