package boyntonrl;

import edu.msoe.se1010.winPlotter.WinPlotter;

import java.awt.*;

public class Point extends Shape {

    /**
     *
     * @param x - cartesian x-origin of this Point
     * @param y - cartesian x-origin of this Point
     * @param color - the java.awt.Color for this Point
     */
    public Point(double x,
                 double y,
                 Color color) {
        super(x, y, color);
    }

    /**
     * Draws the point.
     * @param plotter reference to a WinPlotter object used for drawing
     */
    public void draw(WinPlotter plotter) {
        super.setPenColor(plotter);
        plotter.drawPoint(x, y);
    }
}
