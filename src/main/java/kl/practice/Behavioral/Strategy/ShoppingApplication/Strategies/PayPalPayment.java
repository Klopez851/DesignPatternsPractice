package kl.practice.Behavioral.Strategy.ShoppingApplication.Strategies;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class PayPalPayment implements PaymentStrategy{
    @Override
    public String pay(double amount) {
        System.out.printf("Processing Paypal payment for %f\n", amount);
        return "Payment accepted";
    }
}
