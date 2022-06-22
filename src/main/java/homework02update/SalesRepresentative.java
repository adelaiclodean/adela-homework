package homework02update;

public class SalesRepresentative {
    private final String name;
    private final int numberOfSales;
    private final double quota;

    //private final double revenue;

    public SalesRepresentative(String name, int numberOfSales, double quota) {
        this.name = name;
        this.numberOfSales = numberOfSales;
        this.quota = quota;
        // this.revenue=revenue;
    }
    public String getName(){

        return name;
    }
    public int getNumberOfSales(){

        return numberOfSales;
    }
    public double getQuota(){

        return quota;
    }

    public double getRevenue(){

        return quota*numberOfSales;
    }

    @Override
    public String toString(){

        return name + " made $" + getRevenue() + "";
    }

}
