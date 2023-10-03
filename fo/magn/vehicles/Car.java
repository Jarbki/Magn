package fo.magn.vehicles;

import java.util.Random;

public class Car {
    private boolean buysSausage = true;
    private boolean leavesCarAtPump = true;
    private int requiredFuel;
    private int currentFuelInLiters;
    private Random random = new Random();

    public Car() {

        if (random.nextInt(10) + 1 > 4) {
            this.leaveCar = false;
        }
        if (random.nextInt(10) + 1 > 3) {
            this.sausage = false;
        }

        this.requiredFuel = random.nextInt(40) + 31;

    }

    public boolean sausage() {
        return this.sausage;
    }

    public boolean leaveCar() {
        return this.leaveCar;
    }
}
