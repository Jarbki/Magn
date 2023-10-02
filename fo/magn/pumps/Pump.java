package fo.magn.pumps;

import fo.magn.vehicles.Car;
import java.util.LinkedList;


public class Pump {

    private LinkedList<Car> queue = new LinkedList<Car>();
    private static int litersPerSecond = 10;

    public Pump() {

    }

    public void addQueue(Car car) {
        this.queue.addLast(car);
    }

    public void fillUp(){

        Car firstCar = this.queue.getFirst();
        this.queue.removeFirst();

        if ()

    }
}
