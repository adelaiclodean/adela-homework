package homework01;

import java.util.Scanner;

public class Palindrom {
    public static void main(String[] args) {

        int n;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number: ");
        n = scan.nextInt();

        int pal = n;
        int remainder;
        int reverse = 0;
        while (n > 0){
            remainder = n%10;
            reverse = reverse * 10 + remainder;
            n=n /10;
        }

        if (pal==reverse)
            System.out.println("Numarul este palindrom "+pal);
        else
            System.out.println("Numarul nu este palindrom.");
    }
}
