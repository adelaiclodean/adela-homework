package homework02;

import java.util.Arrays;

public class Main {
    /**
     * Function which create an int array, we traverse the array from first
     * @param args are numbers that we want to calculate
     * @return the value of Sales are the one which sale the most
     */

    public static void main(String[] args) {
        Bubble adela = new Bubble("adela", 10, 500, 5000);
        System.out.println("adela makes:" + adela.getSalesRepr());

        Bubble ioana = new Bubble("ioana", 5, 400, 2000);
        System.out.println("ioana makes:" +ioana.getSalesRepr());

        Bubble elena = new Bubble("elena", 8, 700, 5600);
        System.out.println("elena makes:" +elena.getSalesRepr());

        int[] intArray = new int[]{5000, 2000, 5600};

        System.out.println("Sales that people make are:");
        for (int j : intArray) {
            System.out.print(j + " ");
        }
        bubbleSort(intArray);

        System.out.println();

        System.out.println("Descending Sales are:");
        for (int i = 0; i < intArray.length; i++) {
            System.out.print(intArray[i] + " ");
        }
    }

    /**
     * Function that we want to sort the array sales, using bubble sort algorithm
     * @param intArray we are using bubble sort algorithm to sort descending
     * @return the descending sales
     */
    private static void bubbleSort(int[] intArray) {


        int n = intArray.length;
        //int temp=0;

        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                int temp;
                if (intArray[j - 1] < intArray[j]) {
                    temp = intArray[j - 1];
                    intArray[j - 1] = intArray[j];
                    intArray[j] = temp;
                }
            }
        }
    }
}
