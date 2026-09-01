package kl.practice.Structural.Decorator;

public class CoffeeImpl implements Coffee {
    private String description;
    private double cost;

    public CoffeeImpl(String description, double cost){
        this.description = description;
        this.cost = cost;
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
