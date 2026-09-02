package kl.practice.Structural.Bridge.shape;

import kl.practice.Structural.Bridge.renderer.Renderer;

public class Hexagon implements Shape{
    private Renderer renderer;
    private double side;

    public Hexagon(Renderer renderer, double side){
        this.renderer = renderer;
        this.side =side;
    }

    @Override
    public void draw() {
        renderer.renderHexagon(side);
    }

    @Override
    public void setRenderer(Renderer renderer) {
        this.renderer=renderer;
    }
}
