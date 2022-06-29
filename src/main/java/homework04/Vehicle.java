package homework04;

public abstract class Vehicle implements Fuel {
    public static void start() {
        System.out.println("A pornit vehiculul");
    }
    public static void drive(int Kms) {
        System.out.println("Vehiculul este condus N km");
    }

    public static void shiftGear(int Gears) {
        System.out.println("S-a schimbat viteza");
    }
    public static void stop() {
        System.out.println("S-a oprit vehiculul");
    }

    private String brand = "";
    private String model = "";
    public Vehicle(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }


    private int FuelTankSize;
    private static String FuelType;
    private int gears;
    private double consumpionPer100Km;

   public Vehicle (int FuelTankSize, String FuelType, int gears, double consumpionPer100Km){
       this.FuelTankSize = FuelTankSize;
       Vehicle.FuelType = FuelType;
       this.gears = gears;
       this.consumpionPer100Km = consumpionPer100Km;

   }



}