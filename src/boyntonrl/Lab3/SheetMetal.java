package boyntonrl.Lab3;

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
