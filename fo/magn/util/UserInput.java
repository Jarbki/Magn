package fo.magn.util;

import java.util.Scanner;

public class UserInput {
    private int cars;
    private int pumps;

    public UserInput() {
        Scanner input = new Scanner(System.in);

        System.out.println();
        System.out.print("Insert number of cars: ");
        this.cars = Integer.parseInt(input.nextLine());

        System.out.println();
        System.out.print("Insert number of pumps: ");
        this.pumps = Integer.parseInt(input.nextLine());

        input.close();
    }

    public int Cars() {
        return this.cars;
    }

    public int Pumps() {
        return this.pumps;
    }
}
