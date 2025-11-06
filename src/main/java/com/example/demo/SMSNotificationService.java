package com.example.demo;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
@ConditionalOnProperty(name = "sms.enabled", havingValue = "True")
public class SMSNotificationService implements NotificationService{

    @Override
    public void send(String message) {
        System.out.println("SMS");
        System.out.println("sending sms: " + message);
    }
}
