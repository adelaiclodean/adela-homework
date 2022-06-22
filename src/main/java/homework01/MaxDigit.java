package homework01;

import java.util.Scanner;

public class MaxDigit {
    public static void main(String[] args) {
        int n;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number: ");
        n = scan.nextInt();
        //int n=45678;
        if (n > 0) {
            int max = Integer.MIN_VALUE;
            while (n > 0) {
                int digit = n % 10;
                max = Math.max(max, digit);
                n /= 10;
            }
            System.out.println("Max digit is:"+max);
        }
    }
}
