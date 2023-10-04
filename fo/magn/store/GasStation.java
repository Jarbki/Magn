package fo.magn.store;

import fo.magn.vehicles.Customer;
import java.util.ArrayList;

public class GasStation {

    private static int sausageTime = 15;
    private static int tillTime = 5;

    private ArrayList<Customer> tillQueue;
    private ArrayList<Customer> sausageQueue;

    public GasStation() {
        
    }

    public void addTillQueue(Customer customer){
        tillQueue.add(customer);
    }

    public void addSausageQueue(Customer customer){
        sausageQueue.add(customer);
    }

    

}
