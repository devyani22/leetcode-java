package Misc;

import java.util.Arrays;
import java.util.HashMap;

public class Fibonacci {
    private static HashMap<Integer, Integer> memo = new HashMap<>(); // can't be local as it will be reinitialize with every method call

    private static int[] fibonacciIterative(int n) {
        int n1 = 0;
        int n2 = 1;
        int n3 = 0;
        int[] fibonacciNums = new int[n+1];
        fibonacciNums[0] = n1;
        fibonacciNums[1] = n2;

        for (int i = 2; i <= n; i++) {
            n3 = n1 + n2;
            fibonacciNums[i] = n3;

            n1 = n2;
            n2 = n3;
        }
        return fibonacciNums;
    }

    /**
     * O(n^2) - The fibonacci method calls itself twice for each value of n, except for the base cases.
     */
    public static int fibonacci(int n) {

        if (n <= 1) {
            return n;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }

    /**
     * memoization (caching the results of Fibonacci calculations) to achieve a time complexity of O(n)
     * while retaining a recursive style
     */
    public static int fibonacciMemo(int n) {

        if (n <= 1) {
            return n;
        }
        if (memo.containsKey(n)) {
            return memo.get(n);
        }
        int result = fibonacciMemo(n - 1) + fibonacciMemo(n - 2);
        memo.put(n, result);
        return result;
    }

    public static void main(String[] args) {
        int count = 10;
        System.out.println(Arrays.toString(fibonacciIterative(count)));

        for (int i = 0; i <= count; i++) {
            System.out.print(fibonacci(i) + " ");
        }
        System.out.println();
        for (int i = 0; i <= count; i++) {
            System.out.print(fibonacciMemo(i) + " ");
        }
    }
}
