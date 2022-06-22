package homework02update;

public class BubbleSort {
    public static void sort (SalesRepresentative[] salesReps){

        boolean changesPerformed=true;

        while (changesPerformed){
            changesPerformed=false;
            for (int i = 0; i <salesReps.length-1 ; i++) {
                if(salesReps[i].getRevenue()>salesReps[i+1].getRevenue()){
                    SalesRepresentative temp=salesReps[i];
                    salesReps[i]=salesReps[i+1];
                    salesReps[i+1]=temp;
                    changesPerformed=true;
                }
            }
        }

    }
}
