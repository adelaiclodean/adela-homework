package homework01;

import java.util.Scanner;

public class SmallestNumber {
    public static void main(String[] args) {

        int n, i, min;
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the Size of Array: ");
        n = scan.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter Numbers: ");
        for (i = 0; i < n; i++) {
            arr[i] = scan.nextInt();}
        min = arr[0];

        for (i = 1; i < n; i++) {
            if (min > arr[i])
                min = arr[i];
        }
        System.out.println("Smallest Number is " + min);
    }
}
