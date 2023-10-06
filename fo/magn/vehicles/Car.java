package fo.magn.vehicles;
import fo.magn.pumps.Pump;



public class Car extends Thread {
    
    
    private int requiredFuel;
    private int carID;
    private int currentFuel = 0;
    private Customer customer;
    private Pump pump;
    private boolean full;
    

    public Car(int carID, int requiredFuel, boolean wantsSausage, boolean leavesCarAtPump) {
        this.carID = carID;
        this.requiredFuel = requiredFuel;
        this.customer = new Customer(wantsSausage, leavesCarAtPump);
        this.full = false;
    }


    public Customer getCustomer(){
        return this.customer;
    }

    public void pump(Pump pump){
        this.pump = pump;
    }

    public void fillUp(int amount){
        if (this.currentFuel + amount > this.requiredFuel){
            this.currentFuel = this.requiredFuel;
            this.full = true;
        } else {
            this.currentFuel += amount;
        }
    }

    @Override
    public void run(){
       //tað sum skal koyra tá thread startar.
    
    }

}
