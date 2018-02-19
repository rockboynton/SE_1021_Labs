/*
 * SE1021 - 001
 * Winter 2018
 * Homework 9 - Functional Programming
 * Name: Sean Jones
 * Completed by: Rock Boynton
 * Created: 2/3/2018
 */

package boyntonrl.HW9;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;

/**
 * This is a short functional programming exercise using a simplified
 * version of Chris Taylor's Complex class
 */
public class Homework9 {
    public static void main(String[] args) {
        List<Complex> list = new ArrayList<>();
        list.add(new Complex(7, 6));
        list.add(new Complex(8, 8));
        list.add(new Complex(9, 0));
        list.add(new Complex(4, 3));
        list.add(new Complex(4, 0));
        list.add(new Complex(28, 0));

        // 4. Call your getReal() method and print the results
        System.out.println(getReal(list));
        // 6. Call your getSpecified method with the requested lambda expression
        System.out.println(getSpecified(list, n -> n.getMagnitude() > 27));
        // 7. Using a stream, do the same thing as #6 without using the getSpecified() method
        System.out.println(list.stream().filter(n -> n.getMagnitude() > 27));
        // 8. Use List.forEach() to print each element of the list on a separate line
        list.forEach(System.out::println);
        // 9b. Create a DoubleStream, calling your getAngleStream method
        DoubleStream angles = getAngleStream(list);
        // 9c. Get the average of the angles
        double avg = angles.sum() / list.size();
        // 9d. Print the result as a double
        System.out.println(avg);
    }

    // 1. and 3. Write your getReal method here

    /**
     *  Method that accepts a List<Complex> and returns a list of all
     *  the complex numbers where the imaginary component is zero.
     * @param nums list of complex nums
     * @return list of nums with no imaginary component
     */
//    private static List<Complex> getReal(List<Complex> nums) {
//        nums.removeIf(n -> n.getImag() != 0);
//        return nums;
//    }

    private static List<Complex> getReal(List<Complex> nums) {
        IsReal real = new IsReal();
        return nums.stream().filter(real).collect(Collectors.toList());
    }

    // 5. Write your getSpecified method here
    private static List<Complex> getSpecified(List<Complex> nums, Predicate<Complex> test) {
        return nums.stream().filter(test).collect(Collectors.toList());
    }

    // 9a. Write your getAngleStream method here
    private static DoubleStream getAngleStream(List<Complex> nums) {
        return nums.stream().mapToDouble(Complex::getAngle);
    }
}
