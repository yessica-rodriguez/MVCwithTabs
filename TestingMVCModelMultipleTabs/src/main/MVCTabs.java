/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import audio.AudioView;
import inventory.Car;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import inventory.CarView;
import javafx.geometry.Side;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;

/**
 *
 * @author MQ0162246
 */
public class MVCTabs extends TabPane{

    //Current USer
    private Car currentCar = new Car();
    private Tab tab1;
    private Tab tab2;
    private Tab tab3;
    
    private Image img01 = new Image("/resources/images/vaq.png");
    private Image img02 = new Image("/resources/images/pos.png");
    private Image img03 = new Image("/resources/images/reports.png");

    public MVCTabs()
    {
        this.setSide(Side.TOP);
        // Color
        this.setStyle("-fx-background-color: whitesmoke;");

        // Tab1: 
        tab1 = new Tab();
        String l = "MyInventory";
        //l.setRotate(90);
        tab1.setText(l);
        tab1.idProperty().set("MyInventory");        
        tab1.setClosable(false);
        ImageView iv = new ImageView(img01);
        iv.setFitHeight(32);
        iv.setFitWidth(32);
        tab1.setGraphic(iv);
        tab1.setStyle("-fx-border-color:white; -fx-background-color: gray;");
        tab1.setContent(new CarView(this));
        
        
        // Tab2: 
        tab2 = new Tab("MyAudio");
        tab2.idProperty().set("MyAudio");
        tab2.setClosable(false);
        ImageView iv2 = new ImageView(img02);
        iv2.setFitHeight(32);
        iv2.setFitWidth(32);
        tab2.setGraphic(iv2);
        tab2.setStyle("-fx-border-color:white; -fx-background-color: gray;");
        tab2.setContent(new AudioView(this));
        
        
        // Tab3:
        tab3 = new Tab("MyBill");
        tab3.idProperty().set("MyBill");
        tab3.setClosable(false);
        ImageView iv3 = new ImageView(img03);
        iv3.setFitHeight(32);
        iv3.setFitWidth(32);
        tab3.setGraphic(iv3);
        tab3.setStyle("-fx-border-color:white; -fx-background-color: gray;");
        tab3.setContent(null);        

        this.getTabs().addAll(tab1, tab2, tab3);
    }


    /**
     * @return the tab1
     */
    public Tab getTab1() {
        return tab1;
    }

    /**
     * @param tab1 the tab1 to set
     */
    public void setTab1(Tab tab1) {
        this.tab1 = tab1;
    }

    /**
     * @return the tab2
     */
    public Tab getTab2() {
        return tab2;
    }

    /**
     * @param tab2 the tab2 to set
     */
    public void setTab2(Tab tab2) {
        this.tab2 = tab2;
    }

    /**
     * @return the tab3
     */
    public Tab getTab3() {
        return tab3;
    }

    /**
     * @param tab3 the tab3 to set
     */
    public void setTab3(Tab tab3) {
        this.tab3 = tab3;
    }

    /**
     * @return the currentCar
     */
    public Car getCurrentUser() {
        return currentCar;
    }

    /**
     * @param currentUser the currentCar to set
     */
    public void setCurrentUser(Car currentUser) {
        this.currentCar = currentUser;
    }

}
