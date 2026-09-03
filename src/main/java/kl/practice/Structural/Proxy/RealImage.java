package kl.practice.Structural.Proxy;

public class RealImage implements Image{
    public RealImage(){}

    @Override
    public void display(String image) {
        System.out.println("Loading " + image);
    }
}
