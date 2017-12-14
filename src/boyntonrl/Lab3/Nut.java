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
