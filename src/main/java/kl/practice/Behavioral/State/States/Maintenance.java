package kl.practice.Behavioral.State.States;

import kl.practice.Behavioral.State.VendingMachine;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
public class Maintenance implements State{
    private VendingMachine machine;

    @Override
    public void insertCoin() {
        System.out.println("Vending Machine is under maintenenace");
    }

    @Override
    public void selectProduct(String choice) {
        dispense(choice);
    }

    @Override
    public void dispense(String choice) {
        System.out.println("Vending Machine is under maintenenace");
    }
}
