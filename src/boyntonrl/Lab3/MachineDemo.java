/*
 * SE1021
 * Winter 2017-2018
 * Lab 3 - Interfaces
 * Created: 12/7/2016
 */
package boyntonrl.Lab3;

import java.util.Scanner;

public class MachineDemo {
    /**
     * A simple example driver class for the Bill of Materials generator lab.
     * This class is used by students for the in class demonstration.
     *
     * @param args ignored
     */
    public static void main(String[] args) {
        System.out.println("Building a fan");
        SheetMetal blade = new SheetMetal(8,6,0.0625);
        Duplicate fan = new Duplicate(blade,5);
        fan.printBillOfMaterials();
    }
}
