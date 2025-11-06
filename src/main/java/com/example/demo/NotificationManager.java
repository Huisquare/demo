package com.example.demo;

import org.springframework.stereotype.Service;

@Service
public class NotificationManager {

    private final NotificationService service;

    public NotificationManager(NotificationService service){
        this.service = service;
    }

    public void sendNotification(String msg) {
        this.service.send(msg);
    }
}
