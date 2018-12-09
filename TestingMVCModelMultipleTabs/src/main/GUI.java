/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import javafx.scene.Parent;
import javafx.scene.layout.BorderPane;

/**
 *
 * @author MQ0162246
 */
public class GUI extends BorderPane{
   
    // Gui elements
    private MVCTabs   mvcTabs;
    
    public GUI() 
    {
        mvcTabs   = new MVCTabs();
        this.setCenter(mvcTabs);
    }
    public Parent getrootNode()
    { 
       return this;
    }

    /**
     * @return the root
     */
    public BorderPane getRoot() {
        return this;
    }

    /**
     * @return the mvcTabs
     */
    public MVCTabs getVaqPacTabs() {
        return mvcTabs;
    }

    /**
     * @param vaqPacTabs the mvcTabs to set
     */
    public void setVaqPacTabs(MVCTabs vaqPacTabs) {
        this.mvcTabs = vaqPacTabs;
    }
}
