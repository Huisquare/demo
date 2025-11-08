package com.example.demo;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service("SMS")
@Primary
public class SMSNotificationService implements NotificationService{

    @Override
    public void send(String message) {
        System.out.println("SMS");
        System.out.println("sending sms: " + message);
    }

    @Override
    public void send(String message, String phoneNumber){
        System.out.println("SMS");
        System.out.println("sending sms: " + message + ", with number: " + phoneNumber);
    }
}
