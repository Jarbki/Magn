package fo.magn.vehicles;

import java.util.Random;

public class Car extends Thread {
    private boolean sausage = true;
    private boolean leaveCar = true;
    private int liters;
    private int arrivalTime;

    public Car() {

        Random random = new Random();
        if ((random.nextInt(10) + 1) > 4) {
            this.leaveCar = false;
        }
        if ((random.nextInt(10) + 1) > 3) {
            this.sausage = false;
        }

        //finnur litrar
        this.liters = random.nextInt(41) + 30;

        //finnur arrivaltíð
        this.arrivalTime = random.nextInt(10)+1;
    }

    public boolean sausage() {
        return this.sausage;
    }

    public boolean leaveCar() {
        return this.leaveCar;
    }

    @Override
    public void run(){
       //tað sum skal koyra tá thread startar.

    }
}
