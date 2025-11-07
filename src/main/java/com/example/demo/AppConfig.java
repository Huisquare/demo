package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@Configuration
public class AppConfig {

    /*
    *  this class allows us to flexibly create beans using our own conditions
    * we can do if else within the methods
    * */

    @Value("${payment.method:stripe}")
    private String paymentMethod;

    // stripe will be the name of the bean
    @Bean
//    @Lazy // if we want to lazily initialise this
    public PaymentService stripe() {
        return new StripePaymentService();
    }

    @Bean
    public OrderService orderService() {
        if (paymentMethod.equalsIgnoreCase("stripe")){
            return new OrderService(stripe());
        }
        return new OrderService(paypal());
    }

    @Bean
    public PaymentService paypal() {
        return new PayPalPaymentService();
    }
}
