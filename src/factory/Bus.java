package factory;

public class Bus implements IVehicle {

    private int seats;

    public Bus(int seats) {
        this.seats = seats;
    }

    @Override
    public void drive() {
        System.out.println("Bus driving, seats: " + seats);
    }

    @Override
    public void refuel() {
        System.out.println("Refueling bus");
    }
}
