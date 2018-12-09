
package inventory;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author MQ0162246
 */
public class Car {
    
    private  StringProperty vin   = new SimpleStringProperty();
    private  StringProperty model = new SimpleStringProperty();
    private  StringProperty year  = new SimpleStringProperty();
    private  StringProperty type  = new SimpleStringProperty();

    public Car() {
    }

    
    public String getType() {
        return type.get();
    }

    public void setType(String value) {
        type.set(value);
    }

    public StringProperty typeProperty() {
        return type;
    }

    public String getYear() {
        return year.get();
    }

    public void setYear(String value) {
        year.set(value);
    }

    public StringProperty yearProperty() {
        return year;
    }

    public String getModel() {
        return model.get();
    }

    public void setModel(String value) {
        model.set(value);
    }

    public StringProperty modelProperty() {
        return model;
    }
    

    public String getVin() {
        return vin.get();
    }

    public void setVin(String value) {
        vin.set(value);
    }

    public StringProperty vinProperty() {
        return vin;
    }



}

