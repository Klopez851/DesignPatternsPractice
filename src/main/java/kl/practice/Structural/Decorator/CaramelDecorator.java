package kl.practice.Structural.Decorator;

public class CaramelDecorator implements Coffee {
    private String description;
    private double cost;

    public CaramelDecorator(Coffee coffee){
        this.description = coffee.getDescription() + " + caramel";
        this.cost = coffee.getCost() + 0.70;
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
