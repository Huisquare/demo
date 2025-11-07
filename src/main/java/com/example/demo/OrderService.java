package com.example.demo;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

public class OrderService {

    private PaymentService paymentService;

    @Autowired
    public OrderService(@Qualifier("stripe") PaymentService paymentService){
        this.paymentService = paymentService;
        System.out.println("OrderService created");
    }

    public OrderService() {}

    public OrderService(PaymentService paymentService, int x){

    }

    @PostConstruct
    public void init() {
        System.out.println("order service post construct call");
    }

    @PreDestroy
    public void cleanup() {
        System.out.println("order service pre destroy");
    }
    public void placeOrder() {
        paymentService.processPayment(10.0);
    }

    public void setPaymentService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }
}
