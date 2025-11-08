package com.example.demo;

public interface NotificationService {

    public void send(String message);

    public void send(String message, String recipientEmail);
}
