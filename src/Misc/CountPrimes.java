package Misc;

public class CountPrimes {

    /*public static int countPrimes(int n) {

        int count = 0;
        boolean[] isPrime = new boolean[n + 1];

        // Initialize all entries to true
        for (int i = 2; i <= n; i++) {
            isPrime[i] = true;
        }

        // Implementing Sieve of Eratosthenes
        for (int p = 2; p * p <= n; p++) {
            if (isPrime[p]) {
                count++;
                // Mark multiples of p as false
                for (int i = p * p; i <= n; i += p) {
                    isPrime[i] = false;
                }
            }
        }
        return count;
    }*/
    public static int countPrimes(int n) {
        boolean[] notPrime = new boolean[n];
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (notPrime[i] == false) {
                count++;
                for (int j = 2; i*j < n; j++) {
                    notPrime[i*j] = true;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println(countPrimes(10));
    }
}
