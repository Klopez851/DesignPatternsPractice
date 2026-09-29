package kl.practice.Behavioral.Strategy.ShoppingApplication;

import lombok.Getter;
import lombok.Setter;

@Getter
public class ShoppingCart {
    private Checkout checkout = new Checkout();
    private double total=0;

    public ShoppingCart(){}

    public void addItem(double price){
        total+=price;
    }

    public void checkout(){
        checkout.pay(total);

    }
}
