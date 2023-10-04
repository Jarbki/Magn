package fo.magn.vehicles;
import fo.magn.pumps.Pump;



public class Car extends Thread {
    
    
    private int requiredFuel;
    private int ID;
    private int currentFuel = 0;
    private Customer customer;
    private Pump pump;
    private boolean full = false;
    

    public Car(int id, int requiredFuel, boolean sausage, boolean leavesCarAtPump) {
        this.ID = id;
        this.requiredFuel = requiredFuel;
        this.customer = new Customer(sausage, leavesCarAtPump);
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
