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
 * A class to represent nut objects.
 */
public class Nut implements Part {

    /**
     * Number used to calculate the weight of the nut
     */
    public static final double LBS_MULTIPLIER = 0.01;

    /**
     * Number used to calculate the price of the nut
     */
    public static final double USD_MULTIPLIER = 0.50;

    private final DecimalFormat costFormat = new DecimalFormat("$0.00");
    private final DecimalFormat weightFormat = new DecimalFormat("#.###");

    private double diameterInches;

    /**
     * Constructor for the nut, which has a diameter in inches.
     * @param diameterInches diameter of the nut in inches
     */
    public Nut(double diameterInches) {
        this.diameterInches = diameterInches;
    }

    @Override
    public double getCost() {
        return USD_MULTIPLIER * diameterInches;
    }

    @Override
    public String getName() {
        return diameterInches + " inch nut";
    }

    @Override
    public double getWeight() {
        return LBS_MULTIPLIER * Math.pow(diameterInches, 2);
    }

    /**
     * Prints the bill for the nut.
     * Lists the name, diameter, cost, and weight.
     */
    @Override
    public void printBillOfMaterials() {
        System.out.println("==========================\n" +
                getName() + "\n" +
                "==========================\n" +
                "Diameter: " + diameterInches + " inches\n" +
                "Cost: " + costFormat.format(getCost()) + "\n" +
                "Weight: " + weightFormat.format(getWeight()) + " lbs\n");
    }
}
