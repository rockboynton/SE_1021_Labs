package boyntonrl.euler;

import java.util.*;

public class ProjectEuler {
    public static void main(String args[]) {

        System.out.println(smallestEvenlyDivisible());

    }

    /**
     * @return largest prime factor of a number
     */
    public static int largestPrimeFactor(long number) {
        int i;
        long copyOfInput = number;

        for (i = 2; i <= copyOfInput; i++) {
            if (copyOfInput % i == 0) {
                copyOfInput /= i;
                i--;
            }
        }

        return i;
    }

    /**
     * Finds the largest palindrome made from the product of two 3-digit numbers.
     * @return result
     */
    public static int largestPalindrom() {
        /*
        9999
        9889
        9779
        9669
        9559....
        8998
        7997...
         */
//        int res;
//        int max = 0;
//        int i;
//        int k = 0;
//        int besti = 0;
//        int bestk = 0;
////        boolean found = false;
//        for (i = 999; i > 900; i--) {
////            found = false;
//            for (k = i; k%10 != 0 && k > 900; k--) {
//                if (k%10 != 0) {
//                    if (isPalindrome(i * k)) {
//                        res = i * k;
//                        if (res > max) {
//                            besti = i;
//                            bestk = k;
//                            max = res;
//                        }
//                    }
//                }
//            }
//        }
        int max = 100001;

        for ( int i = 999 ; i >= 100 ; i--) {
            for (int j = 999 ; j >= 100 ; j-- ) {
                int p = i * j;
                if ( max < p && isPalindrome(p) ) {
                    max = p;
                }
            }
        }

        return max;
    }

    /**
     * Determines whether a number is palindrome
     * @param num number to check
     */
    public static boolean isPalindrome(int num) {
        StringBuilder fwd = new StringBuilder(Integer.toString(num));
        StringBuilder bwd = new StringBuilder(Integer.toString(num));
        bwd.reverse();
        String fwdStr = fwd.toString();
        String bwdStr = bwd.toString();

        return fwdStr.equals(bwdStr);

    }

    public static int smallestEvenlyDivisible() {
        boolean found = false;
        boolean stop;
        int res = 0;
        for (int i = 20; !found; i+=2) {
            stop = false;
            for (int k = 3; k < 21 && !stop; ++k) {
                if ((i % k) != 0) {
                    stop = true;
                }
                if (k == 20) {
                    res = i;
                    found = true;
                }
            }
        }
        return res;
    }
}
