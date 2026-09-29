package kl.practice.Behavioral.State.States;

import kl.practice.Behavioral.State.VendingMachine;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
public class NoCoinState implements State{
    private VendingMachine machine;

    @Override
    public void insertCoin() {
       if(machine.getCoins() >= 4){
          machine.setState(new HasCoinState(machine));
          System.out.println("please select a product!");
          return;
       }
        System.out.println("Coin Accepted");
    }

    @Override
    public void selectProduct(String choice) {
        dispense(choice);
    }

    @Override
    public void dispense(String choice) {
        System.out.println("please add more coins!");
    }
}
