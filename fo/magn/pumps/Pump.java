package fo.magn.pumps;

import java.util.ArrayList;
import java.util.List;

import fo.magn.vehicles.Car;


public class Pump {

    private List<Car> queue;
    private static int LITERS_PER_SECOND = 10;

    public Pump() {
        this.queue = new ArrayList<>();
    }

    public void addQueue(Car car) {
        this.queue.addLast(car);
    }

    public void fillUp(){
        Car firstCar = this.queue.getFirst();
        this.queue.removeFirst();
    }
}
