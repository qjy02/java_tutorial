public class Polymorphism {
    public static void show() {
        Car car = new Car();
        Bike bike = new Bike();
        Boat boat = new Boat();

        Vehicle[] vehicles = {car, bike, boat};

        for(Vehicle vehicle: vehicles) {
            vehicle.go();
        }
    }
}
