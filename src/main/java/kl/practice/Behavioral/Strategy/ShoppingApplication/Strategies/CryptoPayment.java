package kl.practice.Behavioral.Strategy.ShoppingApplication.Strategies;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class CryptoPayment implements PaymentStrategy{
    @Override
    public String pay(double amount) {
        System.out.printf("Processing crypto payment for %f\n", amount);
        return "Payment accepted";
    }
}
