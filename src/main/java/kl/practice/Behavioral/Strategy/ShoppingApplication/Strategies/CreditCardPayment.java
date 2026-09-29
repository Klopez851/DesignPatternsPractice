package kl.practice.Behavioral.Strategy.ShoppingApplication.Strategies;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class CreditCardPayment implements PaymentStrategy{
    @Override
    public String pay(double amount) {
        System.out.printf("Processing credit card payment for %f\n", amount);
        return "Payment accepted";
    }
}
