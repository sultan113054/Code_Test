package question_two;

public class VehicleFactory {
   // based on the input parameter, different subclass is created and returned
    public static Vehicle getVehicle(String type, int wheels, int passengers, boolean isGasAvailable) {
        if (Plane.class.getSimpleName().equalsIgnoreCase(type))
            return new Plane(wheels, passengers, isGasAvailable);
        else if (Car.class.getSimpleName().equalsIgnoreCase(type))
            return new Car(wheels, passengers, isGasAvailable);
        return null;
    }
}
