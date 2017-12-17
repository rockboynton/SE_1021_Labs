package boyntonrl.Lab3;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class Assembly implements Part {

    /**
     * The construction cost for each sub part in the assembly
     */
    public static final double USD_PER_SUB_PART = 0.25;

    private final DecimalFormat costFormat = new DecimalFormat("$0.00");
    private final DecimalFormat weightFormat = new DecimalFormat("#.###");

    private String name;
    private List<Part> subParts = new ArrayList<>();


    /**
     * Constructor for the assembly that has a name.
     * @param name name of the assembly
     */
    public Assembly(String name) {
        this.name = name;
    }

    /**
     * Adds a part to the assembly.
     * @param part the part to add to the assembly
     */
    public void addPart(Part part) {
        subParts.add(part);
    }

    @Override
    public double getCost() {
        double cost = 0;

        for (Part part : subParts) {
            cost += part.getCost() + USD_PER_SUB_PART;
        }
        return cost;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public double getWeight() {
        double weight = 0;

        for (Part part : subParts) {
            weight += part.getWeight();
        }
        return weight;
    }

    /**
     * Prints the bill for the assembly. It first prints a summary of each part (including name, cost, and weight
     * for each part), then prints the full bill of materials for each part.
     */
    @Override
    public void printBillOfMaterials() {
        System.out.println("==========================\n" +
                getName() + "\n" +
                "==========================");
        printSummary();
        System.out.println("Total cost: " + costFormat.format(this.getCost()) + "\n" +
                           "Total weight: " + weightFormat.format(this.getWeight()) + " lbs\n"  );
        printIndividual();
    }

    private void printSummary() {
        for (Part part : subParts) {
            System.out.println("Part: " + part.getName() + "\n" +
                    "Cost: " + costFormat.format(part.getCost()) + "\n" +
                    "Weight: " + weightFormat.format(part.getWeight()) + " lbs\n");
        }
    }

    private void printIndividual() {
        for (Part part : subParts) {
            part.printBillOfMaterials();
        }
    }
}
