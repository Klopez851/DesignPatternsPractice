package kl.practice.Behavioral.State.States;

import kl.practice.Behavioral.State.VendingMachine;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
public class HasCoinState implements State{
    private VendingMachine machine;

    @Override
    public void insertCoin() {
        System.out.println("You've inserted enough coins, the additional coin has been returned");
    }

    @Override
    public void selectProduct(String choice) {
        System.out.println("Choice accepted");
        dispense(choice);
        machine.setCoins(0);
        machine.setNumberOfProducts(machine.getNumberOfProducts()-1);
        machine.setState(new NoCoinState(machine));

        if(machine.getNumberOfProducts()<=0){
            machine.setState(new SoldOutState(machine));
        }
    }

    @Override
    public void dispense(String choice) {
        System.out.println("drink dispensed");
    }
}
