/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import audio.AudioController;
import audio.AudioModel;
import audio.AudioView;
import inventory.CarController;
import inventory.CarModel;
import inventory.CarView;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.application.Platform;
import javafx.scene.image.Image;
import javafx.stage.WindowEvent;

/**
 *
 * @author MQ0162246
 */
public class MVCMainApp extends Application {

    Scene Mainscene;
    GUI gui;
    
    @Override
    public void start(Stage primaryStage) {
        
        // Handle closing the windows
        primaryStage.setOnHiding((WindowEvent event) -> {
            Platform.runLater(() -> {
                System.out.println("Application Closed by click to Close Button(X)");
                System.exit(0);
            });
        });
        
        gui = new GUI();
        
        // the car model
        CarModel carModel   = new CarModel();

        // the car view 
        CarView carView   = (CarView) gui.getrootNode().lookup("#carView");
         
        // the car controller
        CarController carController = new CarController(carModel, carView);
        
        // Main Stage
        Mainscene = new Scene(gui.getrootNode()); 
        primaryStage.setScene(Mainscene);

        primaryStage.setMaximized(true);      
        primaryStage.setTitle("V a q u e r o  POS-Complete  W i t h   J a v a  FX");
        primaryStage.getIcons().addAll(new Image("/resources/images/vaq.png"));
        // Set Windows properties
        primaryStage.show();
    }

    @Override
    public void init() throws Exception {
        super.init();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
}