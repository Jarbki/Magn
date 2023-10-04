package fo.magn.store;


import fo.magn.util.UserInput;
import fo.magn.vehicles.Car;
import java.util.LinkedList;
import fo.magn.vehicles.Customer;
import java.util.ArrayList;

public class GasStation {

    private int sausageTime = 15;
    private int tillTime = 5;

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
