package kl.practice.Structural.Bridge.shape;

import kl.practice.Structural.Bridge.renderer.Renderer;

public class Triangle implements Shape{
    private Renderer renderer;
    private double side;

    public Triangle(Renderer renderer, double side){
        this.renderer = renderer;
        this.side =side;
    }

    @Override
    public void draw() {
        renderer.renderTriangle(side);
    }

    @Override
    public void setRenderer(Renderer renderer) {
        this.renderer=renderer;
    }
}
