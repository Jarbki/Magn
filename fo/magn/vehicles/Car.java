package fo.magn.vehicles;

import java.util.Random;

public class Car {
    private boolean sausage = true;
    private boolean leaveCar = true;
    private int liters;

    public Car() {

        Random random = new Random();
        if (random.nextInt(10) + 1 > 4) {
            this.leaveCar = false;
        }
        if (random.nextInt(10) + 1 > 3) {
            this.sausage = false;
        }

        this.liters = random.nextInt(40) + 31;

    }

    public boolean sausage() {
        return this.sausage;
    }

    public boolean leaveCar() {
        return this.leaveCar;
    }
}
