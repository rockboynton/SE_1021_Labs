package boyntonrl.Lab3;

import java.text.DecimalFormat;

public class SheetMetal implements Part {

    /**
     * Number used to calculate the weight of the sheet metal
     */
    public static final double LBS_MULTIPLIER = 0.1;

    /**
     * Number used to calculate the price of the sheet metal
     */
    public static final double USD_MULTIPLIER = 0.50;

    private double lengthInches;
    private double thicknessInches;
    private double widthInches;

    /**
     * Constructor for the sheet metal, which has a length, width, and thickness, all in inches.
     * @param lengthInches the length of the sheet metal in inches
     * @param widthInches the width of the sheet metal in inches
     * @param thicknessInches the thickness of the sheet metal in inches
     */
    public SheetMetal(double lengthInches, double widthInches, double thicknessInches) {
        this.lengthInches = lengthInches;
        this.widthInches = widthInches;
        this.thicknessInches = thicknessInches;
    }

    @Override
    public double getCost() {
        return USD_MULTIPLIER * thicknessInches * widthInches * lengthInches;
    }

    @Override
    public String getName() {
        return lengthInches + "x" + widthInches + "x" + thicknessInches + " sheet";
    }

    @Override
    public double getWeight() {
        return LBS_MULTIPLIER * thicknessInches * widthInches * lengthInches;
    }

    /**
     * Prints the bill for the sheet metal.
     * Lists the name, length, width, thickness, cost, and weight.
     */
    @Override
    public void printBillOfMaterials() {
        System.out.println("==========================\n" +
                getName() + "\n" +
                "==========================\n" +
                "Length: " + lengthInches + " inches\n" +
                "Width: " + widthInches + " inches\n" +
                "Thickness: " + thicknessInches + " inches\n" +
                "Cost: " + money.format(getCost()) + "\n" +
                "Weight: " + weight.format(getWeight()) + " lbs\n" );
    }
}
