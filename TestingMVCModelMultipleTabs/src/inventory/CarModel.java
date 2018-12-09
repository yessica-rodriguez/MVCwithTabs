/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventory;

/**
 *
 * @author MQ0162246
 */
public class CarModel {

    // Simulate the model
    Car retrieveCar(String vin)
    {    
        Car car = new Car();
        if(vin.equalsIgnoreCase("1"))
        {
            car.setVin("1");
            car.setModel("Toyota");
            car.setYear("2015");
            car.setType("sedan");
        }
        else if(vin.equalsIgnoreCase("2"))
        {
            car.setVin("2");
            car.setModel("Ford");
            car.setYear("2016");
            car.setType("SUV");
        }
        else 
        {
            car.setVin("None");
            car.setModel("None");
            car.setYear("None");
            car.setType("None");
        }
        
        return car; 
    }
    
}
