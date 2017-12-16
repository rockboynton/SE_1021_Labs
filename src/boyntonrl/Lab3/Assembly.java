package boyntonrl.Lab3;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class Assembly implements Part {

    /**
     * TODO
     */
    public static final double USD_PER_SUB_PART = 0.25;

    private final DecimalFormat costFormat = new DecimalFormat();
    private final DecimalFormat weightFormat = new DecimalFormat();

    private String name;
    private List<Part> subParts = new ArrayList<>();


    /**
     * TODO
     * @param name
     */
    public Assembly(String name) {
        this.name = name;
    }

    /**
     * TODO
     * @param part
     */
    public void addPart(Part part) {

    }

    /**
     * TODO
     * @return
     */
    @Override
    public double getCost() {
        return 0;
    }

    /**
     * TODO
     * @return
     */
    @Override
    public String getName() {
        return null;
    }

    /**
     * TODO
     * @return
     */
    @Override
    public double getWeight() {
        return 0;
    }

    /**
     * TODO
     */
    @Override
    public void printBillOfMaterials() {

    }
}
