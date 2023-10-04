package fo.magn;

import fo.magn.store.GasStation;
import fo.magn.util.UserInput;
import fo.magn.vehicles.Car;
import fo.magn.pumps.Pump;
import java.util.ArrayList;

public class Simulation {
    
    // method sum koyrir simulatiónina
    public void run(){

        // koyrir simulation
        while(true){

            // variabul sum skal halda okkara thread objektir.
            ArrayList<Car> cars;

            // Halda parkeraðar bilar
            ArrayList<Car> parkedCars;

            // Halda pumpir
            ArrayList<Pump> pumps;
        
            int time = 0;

            //spyr um tal av bilum og pumpum
            UserInput userInput = new UserInput();
            
            //ger pumpir
            int pumpAmount = userInput.Pumps();
            GasStation magn = new GasStation();

            // ger threads fyri allar bilar.
            int carAmount = userInput.Cars();
            for (int i = 0; i <= carAmount; i++){
                Car car = new Car();
                cars.add(-1, car);
            }
            
            //loop sum koyrir simulatión logic
            while (carAmount != 0){

                //kannar nær næsti bilur skal koma
                for (Car car : this.cars){
                    if (car.arrivalTime() == Math.floor(time)){

                    }
                }
            }

        }
    }

}
