package boyntonrl;

import java.awt.Color;

/**
 * This class represents a generic graphical shape.
 * @author taylor
 */
public abstract class Shape {

    private Color color;
    protected double x;
    protected double y;

    /**
     * Constructor initializes Shape attributes.
     * @param x cartesian x-origin of this Shap
     * @param y cartesian x-origin of this Shape
     * @param color the java.awt.Color for this Shape
     */
    public Shape(double x, double y, Color color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }

    /**
     * Sets the color of the shape
     * @param color the color to set
     */
    public void setColor(java.awt.Color color) {
        this.color = color;
    }
}

