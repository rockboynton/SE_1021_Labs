package boyntonrl.Lab3;

import java.text.DecimalFormat;

public class SheetMetal implements Part {

    public static final double LBS_MULTIPLIER = 0.1;
    public static final double USD_MULTIPLIER = 0.50;

    private double lengthInches;
    private double thicknessInches;
    private double widthInches;

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

    @Override
    public void printBillOfMaterials() {
        System.out.println("==========================\n" +
                getName() + "\n" +
                "==========================\n" +
                "Length: " + lengthInches + " inches\n" +
                "Width: " + widthInches + "inches\n" +
                "Thickness: " + thicknessInches + "inches\n" +
                "Cost: " + money.format(getCost()) + "\n" +
                "Weight: " + getWeight() + "lbs\n" );
    }
}
