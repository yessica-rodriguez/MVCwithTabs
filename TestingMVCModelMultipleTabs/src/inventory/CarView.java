/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventory;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.control.TextField;
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
public class CarView extends GridPane {
   
    MVCTabs   tabsPane;
    private Car  currentCar = new Car();
    
    private Label vinL  =new Label("Vin: ");
    private TextField vinText   =new TextField("");
    
    private Label modelL =new Label("Model: ");
    private Label model  =new Label("");
    
    private Label yearL   =new Label("Year: ");
    private Label year    =new Label("");
    
    private Label typeL   =new Label("Type: ");
    private Label type    =new Label("");
    private Button carRetrievebtn    =new Button("Retrieve Car Info");
    
    //private MyObservableLabel carType = new MyObservableLabel();
    
    public CarView(MVCTabs tabsPane)     
    {
        this.setId("carView");
        this.tabsPane = tabsPane;   
        
        // everytime the tab is selected, check the databases for changes        
        tabsPane.getSelectionModel().selectedItemProperty().addListener(
            new ChangeListener<Tab>() {
            @Override
            public void changed(ObservableValue<? extends Tab> ov, Tab oldTab, Tab newTab) {
                System.out.println("Tab Selection changed to: " + newTab.idProperty().get());
                if ((newTab.idProperty().get() != null) && newTab.idProperty().get().equalsIgnoreCase("MyInventory")) {
                    System.out.println("VMC Inventory Model:...");
                    updateCarViewGrid();
                }
            }
        }); 
        
        // Generate/update GUI
        updateCarViewGrid();         
    }
    
   
    
    public void updateCarViewGrid() 
    {
        this.getChildren().clear();
        this.setAlignment(Pos.CENTER);
        this.setHgap(10);
        this.setVgap(10);
        this.setPadding(new Insets(25, 25, 25, 25));
        this.setBorder(new Border(new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, new CornerRadii(3), new BorderWidths(2))));

        Text scenetitle = new Text("My Inventory Viewer");
        scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 24));
        scenetitle.setFill(Color.BROWN);
        GridPane.setHalignment(scenetitle, HPos.CENTER);
        

        //Users Data
        vinText.setText(currentCar.getVin());
        model.setText(currentCar.getModel());
        year.setText(currentCar.getYear());
        getType().setText(currentCar.getType());
        
        this.addRow(2, scenetitle);       
        this.addRow(3, vinL, vinText);
        this.addRow(4, modelL, model);
        this.addRow(5, yearL, year);
        this.addRow(6, typeL, getType());
        this.addRow(7, carRetrievebtn);
    }    

    /**
     * @return the currentCar
     */
    public Car getCurrentCar() {
        return currentCar;
    }

    /**
     * @param currentCar the currentCar to set
     */
    public void setCurrentCar(Car currentCar) {
        this.currentCar = currentCar;
    }

    /**
     * @return the vinL
     */
    public Label getVinL() {
        return vinL;
    }

    /**
     * @param vinL the vinL to set
     */
    public void setVinL(Label vinL) {
        this.vinL = vinL;
    }

    /**
     * @return the vinText
     */
    public TextField getVinText() {
        return vinText;
    }

    /**
     * @param vinText the vinText to set
     */
    public void setVinText(TextField vinText) {
        this.vinText = vinText;
    }

    /**
     * @return the modelL
     */
    public Label getModelL() {
        return modelL;
    }

    /**
     * @param modelL the modelL to set
     */
    public void setModelL(Label modelL) {
        this.modelL = modelL;
    }

    /**
     * @return the model
     */
    public Label getModel() {
        return model;
    }

    /**
     * @param model the model to set
     */
    public void setModel(Label model) {
        this.model = model;
    }

    /**
     * @return the yearL
     */
    public Label getYearL() {
        return yearL;
    }

    /**
     * @param yearL the yearL to set
     */
    public void setYearL(Label yearL) {
        this.yearL = yearL;
    }

    /**
     * @return the year
     */
    public Label getYear() {
        return year;
    }

    /**
     * @param year the year to set
     */
    public void setYear(Label year) {
        this.year = year;
    }

    /**
     * @return the typeL
     */
    public Label getTypeL() {
        return typeL;
    }

    /**
     * @param typeL the typeL to set
     */
    public void setTypeL(Label typeL) {
        this.typeL = typeL;
    }

    /**
     * @return the type
     */
    public Label getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(Label type) {
        this.type = type;
    }

    /**
     * @return the carRetrievebtn
     */
    public Button getCarRetrievebtn() {
        return carRetrievebtn;
    }

    /**
     * @param carRetrievebtn the carRetrievebtn to set
     */
    public void setCarRetrievebtn(Button carRetrievebtn) {
        this.carRetrievebtn = carRetrievebtn;
    }

//    /**
//     * @return the carType
//     */
//    public MyObservableLabel getCarType() {
//        return carType;
//    }
//
//    /**
//     * @param carType the carType to set
//     */
//    public void setCarType(MyObservableLabel carType) {
//        this.carType = carType;
//    }
    
    
}
