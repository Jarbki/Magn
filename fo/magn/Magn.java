package fo.magn;

import fo.magn.store.GasStation;

import java.util.Scanner;
import java.util.Random;

public class Magn {

    public static void main(String[] args) {

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

