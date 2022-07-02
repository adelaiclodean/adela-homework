package homework0401;

public abstract class Car implements Vehicle {
    public void start() {        System.out.println("The car started");    }
    public void drive(double kms) {        System.out.println("Drive " + kms + "km");    }
    public void shiftGear(int gears) {        System.out.println("Gear has changed to Gear " + gears);    }
    public void stop() {        System.out.println("The car stopped");    }

    private String brand;
    private final String model;
    private final String chassisNumber;
    private int fuelTankSize;
    private String fuelType ;
    private int gears;
    private double consumptionPer100Km ;
    private final double availableFuel;
    private final int TireSize;

    public Car(String brand, String model, String chassisNumber, int fuelTankSize, String fuelType, int gears, double consumptionPer100Km, double availableFuel,int TireSize) {
        this.chassisNumber = chassisNumber;
        this.brand=brand;
        this.model=model;
        this.fuelTankSize = fuelTankSize;
        this.fuelType = fuelType;
        this.gears = gears;
        this.consumptionPer100Km = consumptionPer100Km;
        this.TireSize=TireSize;
        this.availableFuel=availableFuel;}

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return brand + model;
        }


    public void availableFuel(double availableFuel) {    }
    public void getAvailableFuel(int i) {
    }

    public void getAverageFuelConsumption(float fuelConsumed) {    }
    public int getFuelTankSize() {
        return fuelTankSize;
    }
    public void setFuelTankSize(int fuelTankSize) {
        this.fuelTankSize = fuelTankSize;
    }
    public String getFuelType() {
        return fuelType;
    }
    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }
    public int getGears() {
        return gears;
    }
    public void setGears(int gears) {
        this.gears = gears;
    }
    public double getConsumptionPer100Km() {
        return consumptionPer100Km;
    }
    public void setConsumptionPer100Km(double consumptionPer100Km) {
        this.consumptionPer100Km = consumptionPer100Km;
    }
    public int getTireSize() {
        return TireSize;
    }
    public String getChassisNumber() {
        return chassisNumber;
    }

    public double getAvailableFuel() {
        return availableFuel;
    }
}





