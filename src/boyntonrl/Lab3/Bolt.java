package boyntonrl.Lab3;

public class Bolt implements Part {

    public static final double LBS_MULTIPLIER = 0.05;
    public static final double USD_MULTIPLIER = 1.00;

    private double diameterInches;
    private double lengthInches;

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

    @Override
    public void printBillOfMaterials() {
        System.out.println("==========================\n" +
                getName() + "\n" +
                "==========================\n" +
                "Diameter: " + diameterInches + "inches\n" +
                "Length: " + lengthInches + " inches\n" +
                "Cost: " + money.format(getCost()) + "\n" +
                "Weight: " + getWeight() + "lbs\n" );
    }
}
