package homework04;

public class Car extends Vehicle implements Fuel , Consumption {


    public Car(String brand, String model, String chassisNumber) {
        super(brand, model);
    }

    public static void start() {
        System.out.println("A pornit masina");
    }

    public Car (int FuelTankSize){
        super (60, "PETROL", 6, 8.7);
    }

    public static void Tire(int tire) {
    }


    @Override
    public void Tires(int Tire) {

    }
    @Override
    public void availableFuel(float Fuel) {

    }     @Override
    public double getAvailableFuel(float Fuel) {
         return availableFuel;
    }

    @Override
    public void fuelConsumedPer100Km() {

    }
    @Override
    public void getAverageFuelConsumption(float fuelConsumed) {

    }

}
