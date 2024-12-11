
public interface Vehicle {
    void drive();
}

public static class Car implements Vehicle {
    @Override
    public void drive() {
        System.out.println("Driving a car...");
    }
}

public static class Bike implements Vehicle {
    @Override
    public void drive() {
        System.out.println("Riding a bike...");
    }
}

public class VehicleFactory {
    public static Vehicle getVehicle(String vehicleType) {
        if (vehicleType == null) {
            return null;
        }
        if (vehicleType.equalsIgnoreCase("CAR")) {
            return new Car();
        } else if (vehicleType.equalsIgnoreCase("BIKE")) {
            return new Bike();
        }
        return null;
    }
}

public static void main(String[] args) {
    Vehicle car = VehicleFactory.getVehicle("CAR");
    if (car != null) {
        car.drive();
    }

    Vehicle bike = VehicleFactory.getVehicle("BIKE");
    if (bike != null) {
        bike.drive();
    }
}
