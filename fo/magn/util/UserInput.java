package fo.magn.util;

import java.util.Scanner;

public class UserInput {
    private int carAmount;
    private int pumpAmount;

    private Scanner input;

    public UserInput() {
        this.input = new Scanner(System.in);

        // Prompt for number of cars
        System.out.print("Insert number of cars: ");
        System.out.println();
        this.carAmount = Integer.parseInt(input.nextLine());

        // Prompt for number of pumps
        System.out.print("Insert number of pumps: ");
        System.out.println();
        this.pumpAmount = Integer.parseInt(input.nextLine());

        input.close();
    }

    public int getCarAmount() {
        return this.carAmount;
    }

    public int getPumpAmount() {
        return this.pumpAmount;
    }
}
