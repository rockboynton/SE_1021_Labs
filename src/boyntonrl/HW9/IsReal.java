/*
 * SE1021 - 001
 * Winter 2018
 * Homework 9 - Functional Programming
 * Name: Rock Boynton
 * Created: 2/3/2018
 */

package boyntonrl.HW9;

import java.util.function.Predicate;

/**
 * Functional class to test whether or not a method is real
 */
public class IsReal implements Predicate<Complex> {

    public IsReal() {

    }

    @Override
    public boolean test(Complex complex) {
        return complex.getImag() == 0;
    }

    @Override
    public Predicate<Complex> and(Predicate<? super Complex> other) {
        return null;
    }

    @Override
    public Predicate<Complex> negate() {
        return null;
    }

    @Override
    public Predicate<Complex> or(Predicate<? super Complex> other) {
        return null;
    }
}
