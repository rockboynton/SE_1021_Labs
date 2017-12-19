/*
 * SE1021 Lab 3
 * Shape Creator Application main class
 * December 12, 2016
 */

package edu.msoe.se1021.lab3;

// Change this import to match the package where you have your shapes,
//  i.e., your MSOE username.
import boyntonrl.Shape;
import boyntonrl.Point;
import boyntonrl.Circle;
import boyntonrl.Rectangle;
import boyntonrl.Triangle;
import boyntonrl.LabeledRectangle;
import boyntonrl.LabeledTriangle;
import java.awt.Color;
import edu.msoe.se1010.winPlotter.WinPlotter;

/**
 * This class creates shapes and "tells" them to draw
 *  themselves in a provided WinPlotter window.
 * @author hornick and taylor
 * @version 20161206.3
 *
 * Based on work done by Dr. Mark Hornick
 */
public class ShapeCreatorApp {
    /**
     * Use shapes to draw a Christmas scene.
     * @param args Ignored
     */
    public static void main(String[] args) {
        WinPlotter plotter = new WinPlotter();

        // Initialize WinPlotter
        initWinPlotter(plotter);

        // Draw scene
        drawTree(plotter);
        drawPresents(plotter);
    }

    /**
     * This method initializes the WinPlotter object
     * @param plotter The WinPlotter to be initialized
     */
    private static void initWinPlotter(WinPlotter plotter) {
        plotter.setWindowTitle("A Christmas Wish...");
        plotter.setWindowSize(800, 600);
        plotter.setPlotBoundaries(-5, -5, 105, 75);
        plotter.setGrid(true, 10, 10, Color.GRAY);
        plotter.setBackgroundColor(Color.black.getRed(), Color.black.getGreen(), Color.black.getBlue());
    }

    /**
     * Draws a Christmas tree out of a rectangle and
     *  a bunch of triangles.
     * @param plotter where the tree should be drawn
     */
    private static void drawTree(WinPlotter plotter) {
        Shape treeTrunk = new Rectangle(70, 0, 10, 20, Color.ORANGE);
        treeTrunk.draw(plotter);

        // Create some triangles to form the tree branches
        Shape treeBranch1 = new Triangle(50, 10, 50, 25, Color.green);
        treeBranch1.draw(plotter);
        Shape treeBranch2 = new Triangle(55, 20, 40, 20, Color.green);
        treeBranch2.draw(plotter);
        Shape treeBranch3 = new Triangle(60, 30, 30, 15, Color.green);
        treeBranch3.draw(plotter);
        Shape treeBranch4 = new Triangle(65, 40, 20, 10, Color.green);
        treeBranch4.draw(plotter);

        // Draw ornaments and top decoration on the tree
        drawOrnaments(plotter);
        drawHeadPiece(plotter);
    }

    /**
     * Draw ornaments.
     * @param plotter where the tree should be drawn
     */
    private static void drawOrnaments(WinPlotter plotter) {
        // For ornaments, create some generic shapes and draw them
        Shape ornament = new Point(60, 15, Color.orange);
        ornament.draw(plotter);
        ornament = new Point(88, 18, Color.red);
        ornament.draw(plotter);
        ornament = new Point(85, 23, Color.blue);
        ornament.draw(plotter);
        ornament = new Point(77, 29, Color.yellow);
        ornament.draw(plotter);
        ornament = new Point(70, 35, Color.magenta);
        ornament.draw(plotter);
        ornament = new Point(72, 42, Color.cyan);
        ornament.draw(plotter);
    }

    /**
     * Draw head piece for the top of the tree
     * @param plotter where the tree should be drawn
     */
    private static void drawHeadPiece(WinPlotter plotter) {
        new Circle(75, 55, 5, Color.red).draw(plotter);
        new Circle(75, 55, 4, Color.orange).draw(plotter);
        new Circle(75, 55, 3, Color.yellow).draw(plotter);
        new Circle(75, 55, 2, Color.white).draw(plotter);
    }

    /**
     * Draw Christmas presents
     * @param plotter where the tree should be drawn
     */
    private static void drawPresents(WinPlotter plotter) {
        Shape present1 = new LabeledRectangle(0, 0, 48, 20, Color.BLUE, "To: Mark");
        Shape present2 = new LabeledRectangle(5, 20, 20, 20, Color.CYAN, "To: Mark");
        Shape present3 = new LabeledTriangle(27, 20, 20, 10, Color.YELLOW, "To: Mark");
        present3.draw(plotter);
        present2.draw(plotter);
        present1.setColor(Color.red); // Change present color to red
        present1.draw(plotter);
    }
}
