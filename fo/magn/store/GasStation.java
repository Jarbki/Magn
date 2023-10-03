package fo.magn.store;


import fo.magn.util.UserInput;
import fo.magn.vehicles.Car;
import java.util.LinkedList;
import fo.magn.pumps.Pump;

public class GasStation {

    private LinkedList<Pump> pumps;

    private int cars;
    private int sausageTime = 15;
    private int serviceTime = 10;

    public GasStation(int pumpAmount) {
        for (int i = 0; i <= pumpAmount; i++){
            Pump pump = new Pump();
            this.pumps.addLast(pump);
        }
        
    }

    

}
