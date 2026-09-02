package kl.practice.Structural.Bridge;

/*
 * ============================================================
 * 2. BRIDGE — Shapes and Renderers
 * ============================================================
 *
 * INITIAL EXERCISE
 *
 * Create a drawing system with two independent dimensions.
 *
 * SHAPES:
 * - Circle
 * - Square
 * - Triangle
 *
 * RENDERERS:
 * - RasterRenderer
 * - VectorRenderer
 *
 * Your design must support every combination without classes
 * such as:
 *
 *     RasterCircle
 *     VectorCircle
 *     RasterSquare
 *     VectorSquare
 *
 *
 * FOLLOW-UP
 *
 * Add:
 *
 *     Hexagon
 *
 * and:
 *
 *     OpenGLRenderer
 *
 * Neither addition should require modifying the existing
 * shape implementations or renderer implementations.
 *
 * Then answer:
 *
 *     What would happen to your design if you had 20 shapes
 *     and 10 renderers?
 *
 * Why is your implementation better than creating a class
 * for every combination?
 *
 * ============================================================
 */


import kl.practice.Structural.Bridge.renderer.OpenGLRenderer;
import kl.practice.Structural.Bridge.renderer.RasterRenderer;
import kl.practice.Structural.Bridge.renderer.VectorRenderer;
import kl.practice.Structural.Bridge.shape.Circle;
import kl.practice.Structural.Bridge.shape.Hexagon;
import kl.practice.Structural.Bridge.shape.Square;
import kl.practice.Structural.Bridge.shape.Triangle;

public class main {
    public static void main(String[] args) {
        VectorRenderer vectorRenderer = new VectorRenderer();
        RasterRenderer rasterRenderer = new RasterRenderer();
        OpenGLRenderer openGLRenderer = new OpenGLRenderer();

        Circle circle = new Circle(vectorRenderer, 10);
        circle.draw();

        Square square = new Square(vectorRenderer, 10);
        square.draw();

        Triangle triangle = new Triangle(rasterRenderer, 5);
        triangle.draw();

        Hexagon hexagon = new Hexagon(openGLRenderer, 4);
        hexagon.draw();

        square.setRenderer(openGLRenderer);
        square.draw();
    }
}
