package question_two;

import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import static org.junit.Assert.assertEquals;

public class QuestionTwoTest {

    @Test
    public void factoryPatternTest() {

        // assert statements
        Plane plane = (Plane) VehicleFactory.getVehicle(Plane.class.getSimpleName(),3,350,true);
        Car car = (Car) VehicleFactory.getVehicle(Car.class.getSimpleName(),4,4,true);
        assertEquals("Plane creation successful", new Plane(3,350,true),plane );
        assertEquals("Car creation successful", new Car(4,4,true),car );

    }
    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(QuestionTwoTest.class);
        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }
        System.out.println(result.wasSuccessful());


    }
}
