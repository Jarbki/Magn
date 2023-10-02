package fo.magn.vehicles

import java.util.Random;

public class Car {
    private int sausage;
    private int leaveCar;

    public Car() {
        Random random = new Random();
        this.leaveCar = random.nextInt(10) + 1;
        this.sausage = random.nextInt(10) + 1;
    }
}
