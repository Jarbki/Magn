
import java.util.Scanner;
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

class GasStation{
        int cars;
        int pumps;

        Scanner input = new Scanner(System.in);
        finalValue time = new finalValue();

        System.out.print("Insert number of cars: ");
        System.out.println();
        cars = Integer.parseInt(input.nextLine());
        System.out.println();
        System.out.print("Insert number of pumps: ");
}