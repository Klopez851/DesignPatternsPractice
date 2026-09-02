package kl.practice.Structural.Bridge.renderer;

public class VectorRenderer implements  Renderer{

    public VectorRenderer(){
    }

    @Override
    public void renderCircle(double radius) {
        System.out.println("Vector circle " + radius);
    }

    @Override
    public void renderSquare(double side) {
        System.out.println("Vector Square " + side);
    }

    @Override
    public void renderTriangle(double side) {
        System.out.println("Vector triangle " + side);
    }

    @Override
    public void renderHexagon(double side) {
        System.out.println("Vector Hexagon " + side);
    }
}
