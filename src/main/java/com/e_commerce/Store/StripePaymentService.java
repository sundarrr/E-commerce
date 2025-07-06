package com.e_commerce.Store;

public class StripePaymentService implements PaymentService {
    @Override
    public void processPayment(double Amount)
    {
        System.out.println("Stripe");
        System.out.println(Amount);
    }
}
