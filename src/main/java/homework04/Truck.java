package homework04;

public abstract class Truck extends Vehicle {

    private int currentLoad = 0;

    public Truck(String brand, String truckModel) {
        super(brand, truckModel);
    }

    public int getCurrentLoad() {
        return currentLoad;
    }

    public void setCurrentLoad(int load) {
        currentLoad = load;
    }
}
