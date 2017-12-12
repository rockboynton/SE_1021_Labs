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
        return 0;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public double getWeight() {
        return 0;
    }

    @Override
    public void printBillOfMaterials() {

    }
}
