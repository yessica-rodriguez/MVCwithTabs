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
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.BorderStrokeStyle;
import javafx.scene.layout.BorderWidths;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import main.MVCTabs;

/**
 *
 * @author MQ0162246
 */

public class AudioView extends GridPane {
   
    private MVCTabs   tabsPane;
    private AudioSystem  currentAudioSystem = new AudioSystem();
    
    private Label audioL =new Label("Audio system: ");
    private Label audio  =new Label("");
    
    private Label audioPowerL   =new Label("Power: ");
    private Label audioPower    =new Label("");
    
    private Label noOfSpeakersL   =new Label("No Of Speakers: ");
    private Label noOfSpeakers    =new Label("");
    
    public AudioView(MVCTabs tabsPane)     
    {
        this.setId("audioView");
        this.tabsPane = tabsPane;   
        
        // everytime the tab is selected, check the databases for changes        
        tabsPane.getSelectionModel().selectedItemProperty().addListener(
            new ChangeListener<Tab>() {
            @Override
            public void changed(ObservableValue<? extends Tab> ov, Tab oldTab, Tab newTab) {
                System.out.println("Tab Selection changed to: " + newTab.idProperty().get());
                if ((newTab.idProperty().get() != null) && newTab.idProperty().get().equalsIgnoreCase("MyAudio")) {
                    System.out.println("VMC Audio Model:...");
                    updateAudioViewGrid();
                }
            }
        }); 
        
        // Generate/update GUI
        updateAudioViewGrid();         
    }
   
    public void updateAudioViewGrid() 
    {
        this.getChildren().clear();
        this.setAlignment(Pos.CENTER);
        this.setHgap(10);
        this.setVgap(10);
        this.setPadding(new Insets(25, 25, 25, 25));
        this.setBorder(new Border(new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, new CornerRadii(3), new BorderWidths(2))));

        Text scenetitle = new Text("My Audio Viewer");
        scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 24));
        scenetitle.setFill(Color.BROWN);
        GridPane.setHalignment(scenetitle, HPos.CENTER);
        

        //Users Data
        audio.setText(getCurrentAudioSystem().getBrand());
        audioPower.setText(getCurrentAudioSystem().getPower());
        noOfSpeakers.setText(getCurrentAudioSystem().getSpeakers());
        
        this.addRow(2, scenetitle);       
        this.addRow(3, audioL, audio);
        this.addRow(4, audioPowerL, audioPower);
        this.addRow(5, noOfSpeakersL, noOfSpeakers);
    }    

    /**
     * @return the currentAudioSystem
     */
    public AudioSystem getCurrentAudioSystem() {
        return currentAudioSystem;
    }

    /**
     * @param currentAudioSystem the currentAudioSystem to set
     */
    public void setCurrentAudioSystem(AudioSystem currentAudioSystem) {
        this.currentAudioSystem = currentAudioSystem;
    }

    /**
     * @return the tabsPane
     */
    public MVCTabs getTabsPane() {
        return tabsPane;
    }

    /**
     * @param tabsPane the tabsPane to set
     */
    public void setTabsPane(MVCTabs tabsPane) {
        this.tabsPane = tabsPane;
    }

   
    
}

