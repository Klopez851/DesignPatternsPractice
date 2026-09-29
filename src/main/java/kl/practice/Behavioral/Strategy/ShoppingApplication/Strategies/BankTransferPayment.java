package kl.practice.Behavioral.Strategy.ShoppingApplication.Strategies;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class BankTransferPayment implements PaymentStrategy{
    @Override
    public String pay(double amount) {
        System.out.printf("Processing bank transfer payment for %f\n", amount);
        return "Payment accepted";
    }
}
