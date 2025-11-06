package com.example.demo;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Service;

@Service
public class EmailNotificationService implements NotificationService{

    @Override
    public void send(String message) {
        System.out.println("EMAIL");
        System.out.println("sending email: " + message);
    }
}
