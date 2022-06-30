package homework0401;

public class Main {
    public static void main(String[] args) {

        Vehicle car1 = new Car( "BMW", "1Series", "jadh8239");
        System.out.println(car1);
        Vehicle car2 = new Car("BMW", "3Series", "ja8239");
        System.out.println(car2);
        Vehicle car3 = new Car( "Volkswagen", "Golf ", "1y1ebd");
        System.out.println(car3);
        Vehicle car4 = new Car( "Volkswagen", "Passat", "13156hj");
        System.out.println(car4);

        car1.start();
        car1.shiftGear(1);
        car1.drive(0.01);// drives 0.01 KMs
        car1.shiftGear(2);
        car1.drive(0.02);
        car1.shiftGear(3);
        car1.drive(0.5);
        car1.shiftGear(4);
        car1.drive(0.5);
        car1.shiftGear(4);
        car1.drive(0.5);
        car1.shiftGear(5);
        car1.drive(10);
        car1.shiftGear(4);
        car1.drive(0.5);
        car1.shiftGear(3);
        car1.drive(0.1);
        car1.stop();

        Car Car=new Car(60,"diesel",6,8.7);
        //System.out.println(Car);

        Car Car1 = new Car(50); // 50 miles per gallon
        Car.availableFuel(20); // Tank 20 gallons
        Car.drive(10); // Drive 10 kms
        double gasLeft = Car.getAvailableFuel(15); // Get gas remaining in tank
        int availableFuel=15;
        System.out.println("available fuel " +availableFuel);

        int Tires=16;
        System.out.println("Tires are: "+Tires);

        Car.getAverageFuelConsumption(12);
    }
}