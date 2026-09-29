package kl.practice.Behavioral.State;

import kl.practice.Behavioral.State.States.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class VendingMachine {
    private int coins = 0;
    private int numberOfProducts = 0;
    private State state = new NoCoinState(this);

    public VendingMachine(int numberOfProducts){
        this.numberOfProducts=numberOfProducts;
    }

    public void insertCoin(){
        coins++;
        state.insertCoin();
    }

    public void selectProduct(String choice){
        state.selectProduct(choice);
    }

    public void startMaintenance(){
        if(this.getState().getClass().equals(HasCoinState.class)){
            System.out.println("Coins returned, machine is under maintenance");
            this.coins=0;
        }
        setState(new Maintenance(this));
    }

    public void endMaintenance(){
        setState(new NoCoinState(this));
        this.coins=0;
    }

    public void setMachineOutOfOrder(){
        this.state = new OutOfOrder();
    }
    public void endMachineOutOfOrder(){
        this.state = new NoCoinState(this);
    }

}
