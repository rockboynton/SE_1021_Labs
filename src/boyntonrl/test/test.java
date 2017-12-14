package boyntonrl.test;

import java.text.DecimalFormat;

public class test {
    public static void main(String[] args) {
        DecimalFormat money = new DecimalFormat("0.0#######lbs");
        System.out.println(money.format(51.45123));
    }
}
