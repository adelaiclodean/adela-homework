package homework0401;

public class Car implements Vehicle {

    private int fuelTankSize = 60;
    private String fuelType = "diesel";
    private int gears = 6;
    private double consumptionPer100Km = 8.7;

    public Car(int fuelTankSize, String fuelType, int gears, double consumptionPer100Km) {
        this.fuelTankSize = fuelTankSize;
        this.fuelType = fuelType;
        this.gears = gears;
        this.consumptionPer100Km = consumptionPer100Km;
    }

        public Car(int FuelTankSize) {
        super();
    }

    public void start() {
        System.out.println("The car started");
    }

    public void drive(double kms) {
        System.out.println("Drive " + kms + "km");
    }

    public void shiftGear(int gears) {
        System.out.println("Gear has changed to Gear " + gears);
    }

    public void stop() {
        System.out.println("The car stopped");
    }

    private String brand;
    private String model;
    private String chassisNumber;


    private int availableFuel;
    private int tireSize;


    public Car(String brand, String model, String chassisNumber) {
        this.chassisNumber = chassisNumber;
        this.brand = brand;
        this.model = model;
    }


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


        public void availableFuel(float Fuel) {    }


    public double getAvailableFuel(int i) {
        return availableFuel;
    }

    public void getAverageFuelConsumption(float fuelConsumed) {    }

    public int getFuelTankSize() {
        return fuelTankSize;
    }

    public void setFuelTankSize(int fuelTankSize) {
        this.fuelTankSize = 60;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = "diesel";
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



    }





