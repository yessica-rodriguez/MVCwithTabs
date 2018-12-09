/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package audio;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 *
 * @author MQ0162246
 */
public class AudioSystem {

    private final StringProperty brand = new SimpleStringProperty();
    private final StringProperty power = new SimpleStringProperty();
    private final StringProperty speakers = new SimpleStringProperty();

    public String getSpeakers() {
        return speakers.get();
    }

    public void setSpeakers(String value) {
        speakers.set(value);
    }

    public StringProperty speakersProperty() {
        return speakers;
    }

    public String getPower() {
        return power.get();
    }

    public void setPower(String value) {
        power.set(value);
    }

    public StringProperty powerProperty() {
        return power;
    }

    public String getBrand() {
        return brand.get();
    }

    public void setBrand(String value) {
        brand.set(value);
    }

    public StringProperty brandProperty() {
        return brand;
    }
    
    
}
