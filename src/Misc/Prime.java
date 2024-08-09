package Misc;

public class Prime {

    // Function to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {   // if n can be factored into two factors, n = axb,
            // then one of those factors must be less than or equal to sqrt of n
            if (num % i == 0) {   // If the loop completes without finding any divisors, the number is prime
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int count = 0;
        int number = 2; // Start with the first prime number

        while (count < 15) {
            if (isPrime(number)) {
                System.out.println(number);
                count++;
            }
            number++;
        }
    }
}
