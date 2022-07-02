package homework0401;

public class Main {
    public static void main(String[] args) {

        Car Car1=new Volkswagen(60,"2372bfk",16);
        Car Car2=new Bmw(60,"jf46wof",17);

        Car1.start();
        Car1.availableFuel(30);
        Car1.shiftGear(1);
        Car1.drive(0.01);// drives 0.01 KMs
        Car1.shiftGear(2);
        Car1.drive(0.02);
        Car1.shiftGear(3);
        Car1.drive(0.5);
        Car1.shiftGear(4);
        Car1.drive(0.5);
        Car1.shiftGear(4);
        Car1.drive(0.5);
        Car1.shiftGear(5);
        Car1.drive(10);
        Car1.shiftGear(4);
        Car1.drive(0.5);
        Car1.shiftGear(3);
        Car1.drive(0.1);
        Car1.stop();
        Car1.availableFuel(20);

        Car2.start();
        Car2.availableFuel(23);
        Car2.shiftGear(1);
        Car2.drive(0.01);// drives 0.01 KMs
        Car2.shiftGear(2);
        Car2.drive(0.02);
        Car2.shiftGear(3);
        Car2.stop();
        Car2.availableFuel(19);

        Vehicle vehicle1=new Volkswagen(45,"ad64",16);
        Vehicle vehicle2=new Volkswagen(50,"a56d64",15);


        Car1.getAvailableFuel(20);
        double availableFuel1=20;
        Car1.getAverageFuelConsumption(12);
        System.out.println("Available fuel for car1 is: " + availableFuel1);

        Car2.getAvailableFuel(19);
        double availableFuel2=19;
        Car2.getAverageFuelConsumption(12);
        System.out.println("available fuel for car2 is " + availableFuel2);

    }
}