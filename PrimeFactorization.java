/**
 * Topic : Number Theory
 * Name : Prime Factorization
 * Objective : Find out the prime factorization of given number "n"
 */

package algorithm;

import java.util.Scanner;

public class PrimeFactorization {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            printPrimeFactors(n);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void printPrimeFactors(int n) {
        int m = (int) Math.sqrt(n);
        for (int i = 2; i <= m; i++) {
            if (n % i == 0) {
                int count = 0;
                while (n % i == 0) {
                    count++;
                    n = n / i;
                }
                System.out.println(i + "^" + count);
            }
        }
        if (n > 1) {
            System.out.println(n + "^1" );
        }
    }
}
