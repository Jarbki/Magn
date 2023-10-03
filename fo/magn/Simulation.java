package fo.magn;

import fo.magn.store.GasStation;
import fo.magn.util.UserInput;
import fo.magn.vehicles.Car;
import java.util.LinkedList;

public class Simulation {
    
    // variabul sum skal halda okkara thread objektir.
    private LinkedList<Car> cars;


    // method sum koyrir simulatiónina
    public void run(){

        // koyrir simulation
        while(true){
        
            //spyr um tal av bilum og pumpum
            UserInput userInput = new UserInput();
            
            //ger pumpir
            int pumps = userInput.Pumps();
            GasStation magn = new GasStation(pumps);

            // ger threads fyri allar bilar.
            int carAmount = userInput.Cars();
            for (int i = 0; i <= carAmount; i++){
                Car car = new Car();
                cars.addLast(car);
            }
            
            //loop sum koyrir simulatión logic




        }
    }

}
