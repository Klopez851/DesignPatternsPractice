package kl.practice.Structural.Decorator;

public class SoyMilkDecorator implements Coffee {
    private String description;
    private double cost;

    public SoyMilkDecorator(Coffee coffee){
        this.description = coffee.getDescription() + " + Soy milk";
        this.cost = coffee.getCost() + 0.60;
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
