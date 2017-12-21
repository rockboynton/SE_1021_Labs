package boyntonrl;

import edu.msoe.se1010.winPlotter.WinPlotter;

import java.awt.*;
import java.util.ArrayList;

public class Circle extends Shape{

    private double radius;

    /**
     * Constructor -- creates the Circle
     * @param x - cartesian x-origin of this Circle
     * @param y - cartesian x-origin of this Circle
     * @param radius - radius of this Circles
     * @param color - the java.awt.Color for this Circle
     */
    public Circle(double x,
                  double y,
                  double radius,
                  Color color) {
        super(x, y, color);
        this.radius = radius;
    }

    /**
     * Draws the Circle. Uses sine and cosine functions from the java.lang.Math class to compute a
     * finite set of points that lie on the circumference of a circle, and then uses the drawTo
     * method of WinPlotter to draw a sequence of small connected straight-line segments. When
     * enough segments are drawn (about 25 segments are sufficient), a smooth circle is
     * approximated.
     * @param plotter reference to a WinPlotter object used for drawing
     */
    public void draw(WinPlotter plotter) {
        //TODO
        final int PRECISION = 1000;
        super.setPenColor(plotter);

        double angle = 0;
        double angleStep = 2 * (Math.PI) / PRECISION;
        double x;
        double y;
        plotter.moveTo(this.x + radius, this.y);
        for (int i = 0; i <= PRECISION; i++) {
            x = radius * Math.cos(angle);
            y = radius * Math.sin(angle);
            plotter.drawTo(this.x + x, this.y + y);
            angle += angleStep;
        }
    }
}
