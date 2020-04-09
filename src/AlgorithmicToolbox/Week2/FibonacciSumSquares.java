package AlgorithmicToolbox.Week2;

import java.util.*;

public class FibonacciSumSquares {
    private static long getFibonacciSumSquaresNaive(long n) {
        if (n <= 1)
            return n;

        long previous = 0;
        long current  = 1;
        long sum      = 1;

        for (long i = 0; i < n - 1; ++i) {
            long tmp_previous = previous;
            previous = current;
            current = tmp_previous + current;
            sum += current * current;
        }

        return sum % 10;
    }
    private static long getFibonacciSumSquaresFast(long n){
        if (n%60 <= 1)
            return n%60;
        Long previous = 0L;
        Long current = 1L;
        Long c = 1L;
        Long sum = 1L;
        for(int i=1; i<n%60; i++) {
            c = (previous + current) % 10;
            previous = current;
            current = c;
            sum = (sum + c*c) % 10;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long s = getFibonacciSumSquaresFast(n);
        System.out.println(s);
    }
}

