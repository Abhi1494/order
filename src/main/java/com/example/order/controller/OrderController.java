package com.example.order.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.order.entity.Order;
import com.example.order.service.OrderService;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderService orderService;
    
    @PostMapping("/bookOrder")
    public Order saveOrUpdate(@RequestBody Order order) {
	return orderService.saveOrUpdateOrder(order);
    }
    
    @GetMapping("/welcome")
    public String welcome() {
	return "welcome to order service";
    }
    
}
