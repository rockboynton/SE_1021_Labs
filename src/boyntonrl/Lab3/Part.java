/*
 * SE1021 - 021
 * Winter 2017
 * Lab: Lab 3 Interfaces
 * Name: Rock Boynton
 * Created: 12/13/17
 */

package boyntonrl.Lab3;


/**
 * This is an interface to allow generic information about a part to be accessed.
 */
public interface Part {

    double getCost();
    String getName();
    double getWeight();

    /**
     * Prints a bill of materials for a part.
     */
    void printBillOfMaterials();

}
