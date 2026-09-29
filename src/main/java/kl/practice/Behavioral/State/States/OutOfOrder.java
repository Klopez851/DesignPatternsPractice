package kl.practice.Behavioral.State.States;

public class OutOfOrder implements State{
    @Override
    public void insertCoin() {
        System.out.println("machine is out of order");
    }

    @Override
    public void selectProduct(String choice) {
        dispense(choice);
    }

    @Override
    public void dispense(String choice) {
        System.out.println("machine is out of order");
    }
}
