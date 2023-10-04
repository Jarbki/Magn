package fo.magn.pumps;

import java.util.ArrayList;

import fo.magn.vehicles.Car;


public class Pump {

    private ArrayList<Car> queue;
    private static int LITERS_PER_SECOND = 10;
    

    public Pump() {
        this.queue = new ArrayList<Car>();
    }

    public void addQueue(Car car) {
        this.queue.add(car);
    }

    public synchronized void fillUp(Car car){
       
    }

    public int queueLength(){
        return queue.size();
    }

    public ArrayList<Car> carQueue(){
        return this.queue;
    }
}
