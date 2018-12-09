/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package audio;


/**
 *
 * @author MQ0162246
 */
public class AudioController {

    AudioModel audioModel;
    AudioView  audioView;

    public AudioController(AudioModel audioModel, AudioView audioView) {
        this.audioModel = audioModel;
        this.audioView = audioView;
        attachEvents();
 }
 
private void attachEvents()
{
    //audioView.       
}
    

    public void updateAudio(String carType) 
    {
                 
        // got to model & retrieve the audio system
        AudioSystem audioSystem= audioModel.retrieveAudioSystem(carType);
        
        audioView.setCurrentAudioSystem(audioSystem);
        
        // updat the view for the audio
       audioView.updateAudioViewGrid();
         
    }
    
    
}
