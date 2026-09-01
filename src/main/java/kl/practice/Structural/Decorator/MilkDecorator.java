package kl.practice.Structural.Decorator;

public class MilkDecorator implements Coffee {
    private String description;
    private double cost;

    public MilkDecorator(Coffee coffee){
        this.description = coffee.getDescription() + " + Milk";
        this.cost = coffee.getCost() + 0.50;
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
