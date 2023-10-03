package fo.magn.vehicles;

import fo.magn.pumps.Pump;
import java.util.Random;

public class Car extends Thread {

    //variablar til hvønn bil
    private boolean sausage = true;
    private boolean leaveCarAtPump = true;
    private int liters;
    private int arrivalTime;
    private String state;
    private int pumpID;

    public Car() {

        Random random = new Random();
        if ((random.nextInt(10) + 1) > 4) {
            this.leaveCarAtPump = false;
        }
        if ((random.nextInt(10) + 1) > 3) {
            this.sausage = false;
        }

        //finnur litrar
        this.liters = random.nextInt(41) + 30;

        //finnur arrivaltíð
        this.arrivalTime = random.nextInt(11)+1;
    }

    public boolean sausage() {
        return this.sausage;
    }

    public boolean leaveCar() {
        return this.leaveCarAtPump;
    }

    public int arrivalTime(){
        return this.arrivalTime;
    }

    public void setPump(int id){
        this.pumpID = id;
    }

    @Override
    public void run(){
       //tað sum skal koyra tá thread startar.
       this.state = "RUNNING";


    }
}
