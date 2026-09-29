package kl.practice.Behavioral.Strategy.ShoppingApplication;

import kl.practice.Behavioral.Strategy.ShoppingApplication.Strategies.PaymentStrategy;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Setter
public class Checkout {
    private PaymentStrategy strategy;

    public String pay(double amount){
        return strategy.pay(amount);
    }
}
