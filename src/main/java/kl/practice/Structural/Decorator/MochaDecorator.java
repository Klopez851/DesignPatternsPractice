package kl.practice.Structural.Decorator;

public class MochaDecorator implements Coffee {
    private String description;
    private double cost;

    public MochaDecorator(Coffee coffee){
        this.description = coffee.getDescription() + " + Mocha";
        this.cost = coffee.getCost() + 0.75;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public double getCost() {
        return cost;
    }

    public String toString(){
        return description +" cost: "+cost;
    }
}
