package fo.magn;

import fo.magn.store.GasStation;
import fo.magn.util.UserInput;
import fo.magn.vehicles.Car;
import fo.magn.pumps.Pump;
import fo.magn.vehicles.Customer;
import java.util.ArrayList;
import java.util.Random;

public class Simulation {
    
    // method sum koyrir simulatiónina
    public void run(){

        Random random = new Random();
        // koyrir simulation
        while(true){

            ArrayList<Car> cars = new ArrayList<Car>();
            ArrayList<Car> parkedCars = new ArrayList<Car>();
            ArrayList<Pump> pumps = new ArrayList<Pump>();

            UserInput userInput = new UserInput();
            GasStation magn = new GasStation();
            

            // ger pumpir
            int pumpAmount = userInput.getPumpAmount();
            for (int i = 0; i < pumpAmount; i++){
                Pump pump = new Pump();
                pumps.add(pump);
            }
            
            // ger threads fyri allar bilar.
            int carAmount = userInput.getCarAmount();
            for (int i = 0; i < carAmount; i++){
                boolean leavesCarAtPump = true;
                boolean sausage = true;

                // 40% chance car will be left at pump
                if ((random.nextInt(10) + 1) > 4) {
                    leavesCarAtPump = false;
                }

                // 30% chance customer wants sausage
                if ((random.nextInt(10) + 1) > 3) {
                    sausage = false;
                }

                // Make required fuel to be between 30 to 70 liters
                int requiredFuel = random.nextInt(41) + 30;


                Car car = new Car(i, requiredFuel, leavesCarAtPump, sausage);
                cars.add(car);
            }
            
            int time = 0;
            int timeNextCar = random.nextInt(10) + 1;
            int numberOfArrivedCars = 0;

            //loop sum koyrir simulatión logic
            while (carAmount != 0){
                time++;

                //næsti bilur kemur
                if (time % 10 == timeNextCar){
                    timeNextCar = random.nextInt(10) + 1;
                    

                    //velur pumpu
                    Pump minPump = pumps.get(0);
                    for (Pump pump : pumps){
                        int minQueue = 10000;
                        if (pump.queueLength() < minQueue){
                            minPump = pump;
                        }
                    }
                    minPump.addQueue(cars.get(numberOfArrivedCars));
                    cars.get(numberOfArrivedCars).start();
                    numberOfArrivedCars++;


                }
               
                


                
            }

        }
    }

    public synchronized void tillService(Customer customer){

    }

}
