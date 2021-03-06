/*
 * SE1021 - 021
 * Winter 2017
 * Lab: Lab 3 Interfaces
 * Name: Rock Boynton
 * Created: 12/13/17
 */

package boyntonrl.Lab3;

import java.text.DecimalFormat;

/**
 * A class to represent bolt objects.
 */
public class Bolt implements Part {

    /**
     * Number used to calculate the weight of the bolt
     */
    public static final double LBS_MULTIPLIER = 0.05;

    /**
     * Number used to calculate the price of the bolt
     */
    public static final double USD_MULTIPLIER = 1.00;

    private final DecimalFormat costFormat = new DecimalFormat("$0.00");
    private final DecimalFormat weightFormat = new DecimalFormat("#.###");

    private double diameterInches;
    private double lengthInches;
    /**
     * Constructor for the bolt, which has a length and diameter
     * @param diameterInches the diameter of the bolt in inches
     * @param lengthInches the length of the bolt in inches
     */
    public Bolt(double diameterInches, double lengthInches) {
        this.diameterInches = diameterInches;
        this.lengthInches = lengthInches;
    }

    @Override
    public double getCost() {
        return USD_MULTIPLIER * diameterInches * lengthInches;
    }

    @Override
    public String getName() {
        return diameterInches + "x" + lengthInches + " bolt";
    }

    @Override
    public double getWeight() {
        return LBS_MULTIPLIER * Math.pow(diameterInches, 2) * lengthInches;
    }

    /**
     * Prints the bill for the bolt.
     * Lists the name, diameter, length, cost, and weight.
     */
    @Override
    public void printBillOfMaterials() {
        System.out.println("==========================\n" +
                getName() + "\n" +
                "==========================\n" +
                "Diameter: " + diameterInches + " inches\n" +
                "Length: " + lengthInches + " inches\n" +
                "Cost: " + costFormat.format(getCost()) + "\n" +
                "Weight: " + weightFormat.format(getWeight()) + " lbs\n");
    }
}
