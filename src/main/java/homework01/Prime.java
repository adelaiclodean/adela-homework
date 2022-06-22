package homework01;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        int n;
        Scanner scan = new Scanner(System.in);
        System.out.print("Give the number which you want to print all prime numbers: ");
        n = scan.nextInt();

        boolean[] primes = new boolean[n + 1];
        for (int i = 2; i <= n; i++) {
            primes[i] = true;
        }

        int sqrt = (int) Math.sqrt(n);
        int num = 2;
        while (num <= sqrt) {
            if (primes[num]) {
                int mul = num;
                while (mul * num <= n) {
                    primes[mul * num] = false;
                    mul++;
                }
            }
            num++;
        }
        System.out.println("Primes of the number are: ");
        for (int i = 2; i <= n; i++) {
            if (primes[i]) {
                System.out.print(i + " ");
            }
        }
    }
}
