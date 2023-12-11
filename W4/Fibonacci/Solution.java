// Import your library
// Do not change the name of the Solution class
public class Solution {
    /**
    * Tính toán số Fibonacci thứ n.
    * @param n number n
    * @return
    */
    public static long fibonacci(long n) {
        if (n < 0) {
            return -1;
        }
        if (n <= 1) {
            return n;
        }
        long fibMinus2 = 0;
        long fibMinus1 = 1;
        long fib = 0;

        for (long i = 2; i <= n; i++) {
            fib = fibMinus1 + fibMinus2;    
            if (fib < fibMinus1) { 
                return Long.MAX_VALUE;
            }
            fibMinus2 = fibMinus1;
            fibMinus1 = fib;
        }

        return fib;
    }
} 