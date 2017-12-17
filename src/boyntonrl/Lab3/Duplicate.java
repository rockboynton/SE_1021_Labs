package boyntonrl.Lab3;

import java.text.DecimalFormat;

public class Duplicate implements Part {

    /**
     * Used to calculate the price of the duplicate objects. If there are at least USD_THRESHOLD1 duplicate objects,
     * the final price is reduced by this reduction factor.
     */
    public static final double REDUCTION_FACTOR1 = 0.95;

    /**
     * Used to calculate the price of the duplicate objects. If there are at least USD_THRESHOLD2 duplicate objects, the final price
     * is reduced by this reduction factor.
     */
    public static final double REDUCTION_FACTOR2 = 0.9;

    /**
     * Used to calculate the price of the duplicate objects. If there are at least this many objects, the price is
     * reduced by REDUCTION_FACTOR1
     */
    public static final int USD_THRESHOLD1 = 5;

    /**
     * Used to calculate the price of the duplicate objects. If there are at least this many objects, the price is
     * reduced by REDUCTION_FACTOR2
     */
    public static final int USD_THRESHOLD2 = 10;

    private final DecimalFormat weightFormat = new DecimalFormat("0.0##");
    private final DecimalFormat costFormat = new DecimalFormat("$0.00");

    private Part identicalPart;
    private int numDuplicates;


    /**
     * Constructor for the Duplicate object.
     * @param identicalPart the type of part that this object contains
     * @param numDuplicates the number of duplicate objects
     */
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
        return numDuplicates + " " + identicalPart.getName() + "s";
    }

    @Override
    public double getWeight() {
        return numDuplicates * identicalPart.getWeight();
    }

    /**
     * Prints the bill for the duplicate parts. It first prints a summary of the part (including name, cost, and weight
     * for each part), then prints the full bill of materials for the individual part.
     */
    @Override
    public void printBillOfMaterials() {
        System.out.println("==========================\n" +
                getName() + "\n" +
                "==========================\n" +
                "Duplicate part: " + identicalPart.getName() + " \n" + //TODO get rid of number format in other classes
                "Copies: " + numDuplicates + "\n" +
                "Individual cost: " + costFormat.format(identicalPart.getCost()) + "\n" +
                "Individual Weight: " + weightFormat.format(identicalPart.getWeight()) + " lbs\n\n" +
                "Total cost: " + costFormat.format(this.getCost()) + "\n" +
                "Total weight: " + weightFormat.format(this.getWeight()) + " lbs\n");
        identicalPart.printBillOfMaterials();

    }
}
