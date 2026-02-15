package factory;

public class Truck implements IVehicle {

    private int capacity;
    private int axles;

    public Truck(int capacity, int axles) {
        this.capacity = capacity;
        this.axles = axles;
    }

    @Override
    public void drive() {
        System.out.println("Truck driving, capacity: " + capacity + " tons");
    }

    @Override
    public void refuel() {
        System.out.println("Refueling truck with " + axles + " axles");
    }
}
