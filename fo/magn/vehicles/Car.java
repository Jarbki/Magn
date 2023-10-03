package fo.magn.vehicles;

import java.util.Random;

private Random random = new Random(); // move to simulation

public class Car extends Thread {
    private boolean leavesCarAtPump = true;
    private int requiredFuel;
    private int currentFuel;
    private int arrivalTime;

    public Car() {

        Random random = new Random();
        if ((random.nextInt(10) + 1) > 4) {
            this.leavesCarAtPump = false;
        }

        /* 
        * Move to customer
        */

        // if ((random.nextInt(10) + 1) > 3) {
        //     this.sausage = false;
        // }

        //finnur litrar
        this.requiredFuel = random.nextInt(40) + 31;

        //finnur arrivaltíð
        this.arrivalTime = random.nextInt(10)+1;
    }

    public boolean leaveCar() {
        return leavesCarCarAtPump;
    }

    @Override
    public void run(){
       //tað sum skal koyra tá thread startar.

    }
}
