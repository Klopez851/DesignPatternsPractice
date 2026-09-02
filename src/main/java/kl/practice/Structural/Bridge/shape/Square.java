package kl.practice.Structural.Bridge.shape;

import kl.practice.Structural.Bridge.renderer.Renderer;

public class Square implements Shape{
    private Renderer renderer;
    private double side;

    public Square(Renderer renderer, double side){
        this.renderer = renderer;
        this.side =side;
    }

    @Override
    public void draw() {
        renderer.renderSquare(side);
    }

    @Override
    public void setRenderer(Renderer renderer) {
        this.renderer=renderer;
    }
}
