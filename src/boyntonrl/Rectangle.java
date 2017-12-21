package boyntonrl;

import edu.msoe.se1010.winPlotter.WinPlotter;

import java.awt.*;

public class Rectangle extends Shape {

    protected double height;
    protected double width;

    /**
     * Constructor -- creates the Rectangle
     * @param x - cartesian x-origin of this Rectangle
     * @param y - cartesian x-origin of this Rectangle
     * @param width - base (along x-axis) of this Rectangle
     * @param height - height (along y-axis) of this Rectangle
     * @param color - the java.awt.Color for this Rectangle
     */
    public Rectangle(double x,
                     double y,
                     double width,
                     double height,
                     Color color) {
        super(x, y, color);
        this.height = height;
        this.width = width;
    }

    /**
     * Draws the Rectangle. The origin of the rectangle is the lower-left vertex. To draw a
     * rectangle, move to the origin (using WinPlotter's moveTo method), then draw a line (using
     * WinPlotter's drawTo method)that represents the base, followed by the lines that represent
     * the sides and top.
     * @param plotter reference to a WinPlotter object used for drawing
     */
    public void draw(WinPlotter plotter) {
        //TODO
    }

}
