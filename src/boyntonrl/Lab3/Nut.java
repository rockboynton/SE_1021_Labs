package boyntonrl.Lab3;

public class Nut implements Part {

    /**
     * Number used to calculate the weight of the nut
     */
    public static final double LBS_MULTIPLIER = 0.01;

    /**
     * Number used to calculate the price of the nut
     */
    public static final double USD_MULTIPLIER = 0.50;

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
                "Cost: " + money.format(getCost()) + "\n" +
                "Weight: " + getWeight() + "lbs\n" );
    }
}
