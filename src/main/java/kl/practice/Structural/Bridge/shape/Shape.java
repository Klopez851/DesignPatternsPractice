package kl.practice.Structural.Bridge.shape;

import kl.practice.Structural.Bridge.renderer.Renderer;

//abstraction
public interface Shape {
    void draw();
    void setRenderer(Renderer renderer);
}
