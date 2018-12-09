/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package audio;

import inventory.Car;

/**
 *
 * @author MQ0162246
 */
public class AudioModel {
    // Simulate the model
    
    AudioSystem retrieveAudioSystem(String type)
    {    
        AudioSystem carAudioSystem = new AudioSystem();
        if(type.equalsIgnoreCase("sedan"))
        {
            carAudioSystem.setBrand("Pioneer");
            carAudioSystem.setPower("100");
            carAudioSystem.setSpeakers("2");
   
        }
        else if(type.equalsIgnoreCase("suv"))
        {
            carAudioSystem.setBrand("Sanyo");
            carAudioSystem.setPower("200");
            carAudioSystem.setSpeakers("4");
        }
        else
        {
            carAudioSystem.setBrand("Nada");
            carAudioSystem.setPower("Nada");
            carAudioSystem.setSpeakers("Nada");            
            
        }
        //etc.
        
        return carAudioSystem; 
    }    
}
