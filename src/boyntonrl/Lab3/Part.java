package boyntonrl.Lab3;

import java.text.DecimalFormat;

public interface Part {

     DecimalFormat money = new DecimalFormat("$0.00");
     DecimalFormat weight = new DecimalFormat("0.0#");

     double getCost();
     String getName();
     double getWeight();
     void printBillOfMaterials();

}
