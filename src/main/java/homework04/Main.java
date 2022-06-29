package homework04;

public class Main {
    public static void main(String[] args) {

        Vehicle truck;

        Vehicle[] car = new Car[4];
        car[0] = new Car("BMW", "1Series","assdfdg");
        car[1] = new Car("BMW", "3Series","13156hj");
        car[2] = new Car("Volkswagen", "Golf ","1y1ebd");
        car[3] = new Car("Volkswagen", "Pasat","13156hj");

        Vehicle.start();
        Vehicle.drive(10);
        Vehicle.shiftGear(1);
        Vehicle.stop();
        Car.start();

        Car.Tire(15);

        Car Car = new Car(50); // 50 miles per gallon
        Car.availableFuel(20); // Tank 20 gallons
        Vehicle.drive(10); // Drive 10 kms
        double gasLeft = Car.getAvailableFuel(15); // Get gas remaining in tank

        Car.getAverageFuelConsumption(12);

    }
}
