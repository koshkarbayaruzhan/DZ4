package factory;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Choose vehicle: 1-Car  2-Motorcycle  3-Truck  4-Bus");
        int choice = sc.nextInt();
        sc.nextLine();

        VehicleFactory factory;

        switch (choice) {

            case 1 -> {
                System.out.print("Brand: ");
                String brand = sc.nextLine();
                System.out.print("Model: ");
                String model = sc.nextLine();
                System.out.print("Fuel: ");
                String fuel = sc.nextLine();
                factory = new CarFactory(brand, model, fuel);
            }

            case 2 -> {
                System.out.print("Type: ");
                String type = sc.nextLine();
                System.out.print("Engine volume: ");
                int volume = sc.nextInt();
                factory = new MotorcycleFactory(type, volume);
            }

            case 3 -> {
                System.out.print("Capacity (tons): ");
                int cap = sc.nextInt();
                System.out.print("Axles: ");
                int ax = sc.nextInt();
                factory = new TruckFactory(cap, ax);
            }

            case 4 -> {
                System.out.print("Seats: ");
                int seats = sc.nextInt();
                factory = new BusFactory(seats);
            }

            default -> {
                System.out.println("Wrong choice");
                return;
            }
        }

        IVehicle vehicle = factory.createVehicle();
        vehicle.drive();
        vehicle.refuel();
    }
}
