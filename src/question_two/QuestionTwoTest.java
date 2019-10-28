package question_two;

/*1. Creational design patterns are  the way of creating objects. Factory pattern is a creational one.
So best match for this problem solving is factory pattern.
A Factory Pattern  defines an interface  class for creating an object but
let the subclasses decide which class to instantiate. Simply subclasses are responsible to create the instance of the class.
In Factory pattern, we create object without exposing the creation logic  and
everyone uses the same common interface to create new type of object.
So Plane and Car will be the subclass and vehicle is the base class

2. I will apply Strategy pattern as a second approach. Same implementation here,
i described as practically that's good enough for this pattern also since creational logic is abstract here.
A class behavior can be changed at run time in this pattern. This type of design pattern comes under behavior pattern.
Plane and Car behavior are also different as behaviourally. So creation algorithm can be changed at run time.

*/


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
