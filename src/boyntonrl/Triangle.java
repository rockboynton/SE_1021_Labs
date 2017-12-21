package boyntonrl;

import edu.msoe.se1010.winPlotter.WinPlotter;

import java.awt.*;

public class Triangle extends Shape {

    protected double base;
    protected double height;

    /**
     * Constructor -- creates the Triangle
     * @param x - cartesian x-origin of this Triangle
     * @param y - cartesian x-origin of this Triangle
     * @param base - base (along x-axis) of this Triangle
     * @param height - height (along y-axis) of this Triangle
     * @param color - the java.awt.Color for this Triangle
     */
    public Triangle(double x,
                    double y,
                    double base,
                    double height,
                    Color color) {
        super(x, y, color);
        this.base = base;
        this.height = height;
    }

    /**
     * Draws the Triangle. The origin of the triangle is the lower-left vertex. To draw a triangle,
     * move to the origin, then draw a line (using WinPlotter's drawTo method) that represents the
     * base, followed by the lines that represent the sides.
     * @param plotter reference to a WinPlotter object used for drawing
     */
    public void draw(WinPlotter plotter) {
        // TODO
    }
}
