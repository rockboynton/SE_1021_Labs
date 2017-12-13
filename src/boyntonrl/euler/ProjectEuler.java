package boyntonrl.euler;

import java.util.*;

public class ProjectEuler {
    public static void main(String args[]) {

        System.out.println(Character.digit('9', 10) + 1);
        System.out.println(largestProductInSeries("73167176531330624919225119674426574742355349194934" +
                "96983520312774506326239578318016984801869478851843" +
                "85861560789112949495459501737958331952853208805511" +
                "12540698747158523863050715693290963295227443043557" +
                "66896648950445244523161731856403098711121722383113" +
                "62229893423380308135336276614282806444486645238749" +
                "30358907296290491560440772390713810515859307960866" +
                "70172427121883998797908792274921901699720888093776" +
                "65727333001053367881220235421809751254540594752243" +
                "52584907711670556013604839586446706324415722155397" +
                "53697817977846174064955149290862569321978468622482" +
                "83972241375657056057490261407972968652414535100474" +
                "82166370484403199890008895243450658541227588666881" +
                "16427171479924442928230863465674813919123162824586" +
                "17866458359124566529476545682848912883142607690042" +
                "24219022671055626321111109370544217506941658960408" +
                "07198403850962455444362981230987879927244284909188" +
                "84580156166097919133875499200524063689912560717606" +
                "05886116467109405077541002256983155200055935729725" +
                "71636269561882670428252483600823257530420752963450"));

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

    public static int sumSquareDifference() {
        int sumSquare = 0;
        int squareSum = 0;

        for (int i = 1; i <= 100; ++i) {
            squareSum += Math.pow(i, 2);
            sumSquare += i;
        }
        sumSquare = (int) Math.pow(sumSquare, 2);
        return sumSquare - squareSum;

    }

    //104743
    public static int prime100001st() {
//        ArrayList<Integer> primes = new ArrayList<>();
        int count = 0;
        int i;
        for (i = 1; count < 10001; ++i) {
            if (isPrime(i)) {
                count++;
            }
        }
        return i-1;
    }

    public static boolean isPrime(long n) {
        if (n == 1) {
            return false;
        }
        // fast even test.
        if(n != 2 && n%2 == 0)
            return false;
        // only odd factors need to be tested up to n^0.5
        for(int i = 3; i * i <= n; i += 2)
            if (n % i == 0)
                return false;
        return true;
    }

    // will contain true or false values for the first 10,000 integers
    public boolean[] primes=new boolean[10001];
    //set up the primesieve
    public void fillSieve() {
        Arrays.fill(primes,true);        // assume all integers are prime.
        primes[0]=primes[1]=false;       // we know 0 and 1 are not prime.
        for (int i=2;i<primes.length;i++) {
            //if the number is prime,
            //then go through all its multiples and make their values false.
            if(primes[i]) {
                for (int j=2;i*j<primes.length;j++) {
                    primes[i*j]=false;
                }
            }
        }
    }

    public static int largestProductInSeries(String s) {
        int max = 0;
        int sum4 = 0;

        for (int i = 0; i < s.length() - 13; i++) {
//            sum4 = Character.digit(s.charAt(i), 10) *
//                    Character.digit(s.charAt(i+1), 10) *
//                    Character.digit(s.charAt(i+2), 10) *
//                    Character.digit(s.charAt(i+4), 10) *
//                    Character.digit(s.charAt(i+5), 10) *
//                    Character.digit(s.charAt(i+6), 10) *
//                    Character.digit(s.charAt(i+7), 10) *
//                    Character.digit(s.charAt(i+8), 10) *
//                    Character.digit(s.charAt(i+9), 10) *
//                    Character.digit(s.charAt(i+10), 10) *
//                    Character.digit(s.charAt(i+11), 10) ;
            sum4 = 1;
            for (int k = i; k <= i+13; k++) {
                sum4 *= Character.digit(s.charAt(k), 10);
            }
            if (sum4 > max) {
                max = sum4;
            }
        }
        return max;

    }
}
