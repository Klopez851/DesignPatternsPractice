package kl.practice.Structural.Decorator;

public class WhippedCreamDecorator implements Coffee {
    private String description;
    private double cost;

    public WhippedCreamDecorator(Coffee coffee){
        this.description = coffee.getDescription() + " + Whipped Cream";
        this.cost = coffee.getCost() + 0.80;
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
