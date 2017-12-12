package boyntonrl.Lab3;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class Assembly implements Part {

    public static final double USD_PER_SUB_PART = 0.25;

    private final DecimalFormat costFormat = new DecimalFormat();
    private final DecimalFormat weightFormat = new DecimalFormat();

    private String name;
    private List<Part> subParts = new ArrayList<>();


    public Assembly(String name) {
        this.name = name;
    }

    public void addPart(Part part) {

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
