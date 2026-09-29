package kl.practice.Behavioral.State.States;

import kl.practice.Behavioral.State.VendingMachine;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
public class SoldOutState implements State{
    private VendingMachine machine;

    @Override
    public void insertCoin() {
        System.out.println("Items are sold out, additional coins have been returned");
        machine.setCoins(0);
    }

    @Override
    public void selectProduct(String choice) {
        dispense(choice);
    }

    @Override
    public void dispense(String choice) {
        System.out.println("Items are sold out, returning coins");;
    }
}
