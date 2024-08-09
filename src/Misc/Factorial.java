package Misc;

public class Factorial {

    private static long factorialRecur(int n) {

        if (n <= 1) {
            return 1;  // 0! = 1
        }
        return n * factorialRecur(n - 1);
    }

    private static long factorial(int n) {
        long fact = 1;
        for (int i = 1; i <=n ; i++) {            // or , for(int i = n; i >=1 ; i--)
           fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        int count = 0; // should return 1
        System.out.println(factorialRecur(count));
        System.out.println(factorial(count));

        int count1 = 6; // should return 720

        // count1 = 89999 = Exception in thread "main" java.lang.StackOverflowError (for big numbers)
        System.out.println(factorialRecur(count1));
        System.out.println(factorial(count1));

    }
}
