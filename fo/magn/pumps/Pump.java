package fo.magn.pumps;

import java.util.ArrayList;

import fo.magn.vehicles.Car;


public class Pump {

    private ArrayList<Car> queue;
    private static int LITERS_PER_SECOND = 10;
    private boolean occupied;

    public Pump() {
        this.queue = new ArrayList<Car>();
    }

    public void addQueue(Car car) {
        this.queue.add(car);
    }

    public synchronized void fillUp(){
       
    }

    public int queueLength(){
        return queue.size();
    }
}
