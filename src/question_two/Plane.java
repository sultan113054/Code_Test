package question_two;

import java.util.Objects;

public class Plane implements Vehicle {

    private int wheels;
    private int passengers;
    private boolean  isGasAvailable;

    // specific logic available for decoration

    public Plane(int wheels, int passengers, boolean isGasAvailable){
        this.wheels=wheels;
        this.passengers=passengers;
        this.isGasAvailable=isGasAvailable;
    }
    @Override
    public int set_num_of_wheels() {
        return wheels;
    }

    @Override
    public int set_num_of_passengers() {
        return passengers;
    }

    @Override
    public boolean has_gas() {
        return isGasAvailable;
    }

    @Override
    public String toString(){
        return "wheels= "+this.set_num_of_wheels()+", passengers="+this.set_num_of_passengers()+", has_gas="+this.has_gas();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Plane plane = (Plane) o;
        return wheels == plane.wheels &&
                passengers == plane.passengers &&
                isGasAvailable == plane.isGasAvailable;
    }

    @Override
    public int hashCode() {
        return Objects.hash(wheels, passengers, isGasAvailable);
    }
}
