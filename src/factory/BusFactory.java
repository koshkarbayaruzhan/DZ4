package factory;

public class BusFactory extends VehicleFactory {

    private int seats;

    public BusFactory(int seats) {
        this.seats = seats;
    }

    @Override
    public IVehicle createVehicle() {
        return new Bus(seats);
    }
}
