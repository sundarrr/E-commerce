package com.e_commerce.Store;

import org.springframework.stereotype.Service;

@Service
public class PayPalPaymentService implements PaymentService{

    @Override
    public void processPayment(double Amount) {
        System.out.println("PayPal");
        System.out.println(Amount);
    }
}
