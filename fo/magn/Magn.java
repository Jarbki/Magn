package fo.magn

import java.util.Scanner;

import fo.magn.store.GasStation;

import java.util.Random;

public class Magn {

    public static void main(String[] args) {

        GasStation magn = new GasStation();

    }
}

class finalValue {
    private int time;

    public synchronized void increment(int amount) {
        this.time += amount;
    }

    public int returnTime() {
        return this.time;
    }
}
