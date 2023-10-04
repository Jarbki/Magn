package fo.magn.vehicles;
import fo.magn.pumps.Pump;
import java.util.Random;


public class Car implements Runnable {
    
    
    private int requiredFuel;
        
    private int arrivalTime;
    private String state;
    private int ID;

    private Customer customer;

    public Car(int id) {
        this.ID = id;

        Random random = new Random();
        
        // ger ein customer fyri hvønn bil
        boolean leavesCarAtPump = true;
        boolean sausage = true;
        if ((random.nextInt(10) + 1) > 4) {
            leavesCarAtPump = false;
        }
    
        if ((random.nextInt(10) + 1) > 3) {
            sausage = false;
        }
        this.customer = new Customer(sausage, leavesCarAtPump);

        //finnur litrar
        this.requiredFuel = random.nextInt(40) + 31;

        //finnur arrivaltíð
        this.arrivalTime = random.nextInt(10)+1;
    }



    @Override
    public void run(){
       //tað sum skal koyra tá thread startar.
       this.state = "RUNNING";


    }

    public Customer getCustomer(){
        return this.customer;
    }

    public int getArrivalTime(){
        return this.arrivalTime;
    }
}
