package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {

		//app context is our IOC container
		ConfigurableApplicationContext context = SpringApplication.run(DemoApplication.class, args);
		var orderService = context.getBean(OrderService.class);
		orderService.placeOrder();
		context.close();

	}

}
