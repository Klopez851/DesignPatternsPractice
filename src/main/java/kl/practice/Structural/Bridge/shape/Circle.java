package kl.practice.Structural.Bridge.shape;

import kl.practice.Structural.Bridge.renderer.Renderer;

public class Circle implements Shape{
    private Renderer renderer;
    private double radius;

    public Circle(Renderer renderer, double radius){
        this.renderer = renderer;
        this.radius =radius;
    }

    @Override
    public void draw() {
        renderer.renderCircle(radius);
    }

    @Override
    public void setRenderer(Renderer renderer) {
        this.renderer = renderer;
    }
}
