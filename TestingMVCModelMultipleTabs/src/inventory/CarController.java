/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventory;

import audio.AudioController;
import audio.AudioModel;
import audio.AudioView;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;

/**
 *
 * @author MQ0162246
 */
public class CarController {
  CarModel carModel;
  CarView  carView;  
  
  //initialized within the car view events
  AudioModel audioModel = new AudioModel();
  AudioView audioView;
  AudioController audioController=null;

 public CarController(CarModel carModel , CarView carView) 
 {
        this.carModel  = carModel;
        this.carView   = carView;          
        attachEvents();
 }
 
private void attachEvents()
{
    carView.getCarRetrievebtn().setOnAction(e-> handleretrieveCarByVin()); 
    
    // When the car type changes, capture the event and update the audio view
    carView.getType().textProperty().addListener(new ChangeListener<String>() 
    {
            @Override
            public void changed(ObservableValue<? extends String> type, String oldType, String newType) {
               System.out.println("Label Text Changed to:"+ newType );
               
               //get the adudio view
               audioView = (AudioView) carView.getScene().lookup("#audioView");
               
               //get the model & fire the controller
               if(audioController ==null)
                    audioController = new AudioController(audioModel, audioView);
               
               audioController.updateAudio(newType);
            }
    }); 
}
    
 void handleretrieveCarByVin()
 {
     // get the vin from the view
     String vin = carView.getVinText().getText();
     
     // pass vin to model
     Car currentCar = carModel.retrieveCar(vin);
     
     System.out.println("car has "+currentCar.getModel());
     //Update the view with the car info
     carView.setCurrentCar(currentCar);
     
     carView.updateCarViewGrid();
 }
 
 Car retrieveCarByVin(String vin)
 {
     return (carModel.retrieveCar(vin));
 }
 public void updateCarView()
 {
     carView.updateCarViewGrid();
 }

  
}
