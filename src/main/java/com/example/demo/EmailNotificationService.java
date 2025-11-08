package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Service;

@Service("email")
public class EmailNotificationService implements NotificationService{

    @Value("${email.port}")
    private String emailPort;

    @Value("${email.host}")
    private String emailHost;

    @Override
    public void send(String message) {
        System.out.println("EMAIL");
        System.out.println("sending email: " + message);
    }

    @Override
    public void send(String message, String recipientEmail) {
        System.out.println("EMAIL host: " + emailHost + ", email port: " + emailPort);
        System.out.println("sending email: " + message + ", with email address: " + recipientEmail);
    }
}
