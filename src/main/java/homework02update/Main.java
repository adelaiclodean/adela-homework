package homework02update;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        SalesRepresentative[] salesReps=new SalesRepresentative[3];

        salesReps[0]=new SalesRepresentative("adela", 12, 200.5);

        salesReps[1]=new SalesRepresentative("ioana", 7, 300);

        salesReps[2]=new SalesRepresentative("elena", 20, 12.2);

        System.out.println("Initial array:" + Arrays.toString(salesReps));
        BubbleSort.sort(salesReps);
        System.out.println("after sorting:"+Arrays.toString(salesReps));
    }
}
