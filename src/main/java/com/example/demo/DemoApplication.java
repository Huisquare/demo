package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {

		//app context is our IOC container
		ApplicationContext context = SpringApplication.run(DemoApplication.class, args);
//		var orderService = context.getBean(OrderService.class);
//		orderService.placeOrder();
		var heavyResource = context.getBean(HeavyResource.class);
	}

}
