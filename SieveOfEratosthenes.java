/**
 * Topic : Number Theory
 * Name : Sieve of Eratosthenes
 * Objective : Find out the prime numbers from 1 to n
 */

package algorithm;

import java.util.Scanner;

public class SieveOfEratosthenes {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            printPrimes(n);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void printPrimes(int n) {
        int[] primes = new int[n + 1];
        int m = (int) Math.sqrt(n);
        for (int i = 2; i <= m; i++) {
            if (primes[i] == 0)
                for (int j = i * i; j <= n; j += i)
                    primes[j] = 1;

        }
        for (int i = 2; i <= n; i++) {
            if (primes[i] == 0)
                System.out.println(i);
        }
    }

}
