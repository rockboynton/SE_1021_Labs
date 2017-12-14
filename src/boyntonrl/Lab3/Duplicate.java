package boyntonrl.Lab3;

import java.text.DecimalFormat;

public class Duplicate implements Part {

    public static final double REDUCTION_FACTOR1 = 0.95;
    public static final double REDUCTION_FACTOR2 = 0.9;
    public static final int USD_THRESHOLD1 = 5;
    public static final int USD_THRESHOLD2 = 10;

    private final DecimalFormat weightFormat = new DecimalFormat("0.00");
    private final DecimalFormat costFormat = new DecimalFormat("lbs");

    private Part identicalPart;
    private int numDuplicates;


    public Duplicate(Part identicalPart, int numDuplicates) {
        this.identicalPart = identicalPart;
        this.numDuplicates = numDuplicates;
    }

    @Override
    public double getCost() {
        double cost = numDuplicates * identicalPart.getCost();
        if (numDuplicates >= USD_THRESHOLD2) {
            cost *= REDUCTION_FACTOR2;
        } else if (cost >= USD_THRESHOLD1) {
            cost *= REDUCTION_FACTOR1;
        }
        return cost;
    }

    @Override
    public String getName() {
        return numDuplicates + identicalPart.getName() + "s";
    }

    @Override
    public double getWeight() {
        return numDuplicates * identicalPart.getWeight();
    }

    @Override
    public void printBillOfMaterials() {
        System.out.println("==========================\n" +
                getName() + "\n" +
                "==========================\n" +
                "Duplicate part: " + identicalPart.getName() + " \n" + //TODO get rid of number format in other classes
                "Copies: " + numDuplicates + "\n" +
                "Individual cost: " + costFormat.format(identicalPart.getCost()) + "\n" +
                "Individual Weight: " + weightFormat.format(identicalPart.getWeight()) + "\n\n" +
                "Total cost: " + costFormat.format(this.getCost()) + "\n" +
                "Total weight: " + weightFormat.format(this.getWeight()) + "\n\n");
        identicalPart.printBillOfMaterials();

    }
}
