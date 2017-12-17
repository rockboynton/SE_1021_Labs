package boyntonrl.Lab3;

import java.text.DecimalFormat;

public interface Part {

     DecimalFormat money = new DecimalFormat("$0.00");
     DecimalFormat weight = new DecimalFormat("#.###");

     double getCost();
     String getName();
     double getWeight();
     void printBillOfMaterials();

}
