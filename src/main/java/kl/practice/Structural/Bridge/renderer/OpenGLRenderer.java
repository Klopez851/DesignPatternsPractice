package kl.practice.Structural.Bridge.renderer;

public class OpenGLRenderer implements  Renderer{

    public OpenGLRenderer(){
    }

    @Override
    public void renderCircle(double radius) {
        System.out.println("OpenGL circle " + radius);
    }

    @Override
    public void renderSquare(double side) {
        System.out.println("OpenGL Square " + side);
    }

    @Override
    public void renderTriangle(double side) {
        System.out.println("OpenGL triangle " + side);
    }

    @Override
    public void renderHexagon(double side) {
        System.out.println("OpenGL Hexagon " + side);
    }
}
