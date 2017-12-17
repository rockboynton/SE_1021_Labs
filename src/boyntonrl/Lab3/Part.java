package boyntonrl.Lab3;

import java.text.DecimalFormat;

public interface Part {

    /**
     * Formats the cost of each part
     */
     DecimalFormat money = new DecimalFormat("$0.00");

    /**
     * Formats the weight of each part
     */
    DecimalFormat weight = new DecimalFormat("#.###");

     double getCost();
     String getName();
     double getWeight();

    /**
     * Prints a bill of materials for a part.
     */
    void printBillOfMaterials();

}
