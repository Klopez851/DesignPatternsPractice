package kl.practice.Structural.Bridge.renderer;

public class RasterRenderer implements  Renderer{

    public RasterRenderer(){
    }

    @Override
    public void renderCircle(double radius) {
        System.out.println("Raster circle " + radius);
    }

    @Override
    public void renderSquare(double side) {
        System.out.println("Raster Square " + side);
    }

    @Override
    public void renderTriangle(double side) {
        System.out.println("Raster triangle " + side);
    }

    @Override
    public void renderHexagon(double side) {
        System.out.println("Raster Hexagon " + side);
    }
}
