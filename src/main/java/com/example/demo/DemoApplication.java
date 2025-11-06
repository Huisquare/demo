package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {

		//app context is our IOC container
		ApplicationContext context = SpringApplication.run(DemoApplication.class, args);
		var notificationManager = context.getBean(NotificationManager.class);
		notificationManager.sendNotification("ahola");
	}

}
