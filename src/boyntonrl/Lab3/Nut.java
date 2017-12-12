package boyntonrl.Lab3;

public class Nut implements Part {

    public static final double LBS_MULTIPLIER = 0.01;
    public static final double USD_MULTIPLIER = 0.50;

    private double diameterInches;

    public Nut(double diameterInches) {
        this.diameterInches = diameterInches;
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
