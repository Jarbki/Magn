package fo.magn;

import fo.magn.store.GasStation;
import fo.magn.util.UserInput;
import fo.magn.vehicles.Car;
import fo.magn.pumps.Pump;
import fo.magn.vehicles.Customer;
import java.util.ArrayList;

public class Simulation {
    
    // method sum koyrir simulatiónina
    public void run(){

        // koyrir simulation
        while(true){

            ArrayList<Car> cars = new ArrayList<Car>();
            ArrayList<Car> parkedCars = new ArrayList<Car>();
            ArrayList<Pump> pumps = new ArrayList<Pump>();

            UserInput userInput = new UserInput();
            GasStation magn = new GasStation();
            

            // ger pumpir
            int pumpAmount = userInput.Pumps();
            for (int i = 0; i < pumpAmount; i++){
                Pump pump = new Pump();
                pumps.add(pump);
            }
            
            // ger threads fyri allar bilar.
            int carAmount = userInput.Cars();
            for (int i = 0; i < carAmount; i++){
                Car car = new Car();
                cars.add(car);
            }
            
            int time = 0;
            //loop sum koyrir simulatión logic
            while (carAmount != 0){
                time++;

                //kannar nær næsti bilur skal koma
                for (Car car : cars){

                    if (car.getArrivalTime() == time%10){

                        for(Pump pump : pumps){
                            int smallest = 10000;
                            
                            if( pump.queueLength() < smallest){
                                pump.addQueue(car);

                            }
                        }
                    }
                }
            }

        }
    }

    public synchronized void tillService(Customer customer){

    }

}
