/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guitartuner;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

/**
 * FXML Controller class
 *
 * @author dhuangal
 */
public class ElectricController extends Switchable implements Initializable {
    
    private ElectricGuitar guitar;
     
    @FXML
    private Button eButton1;
    @FXML
    private Button aButton;
    @FXML
    private Button dButton;
    @FXML
    private Button gButton;
    @FXML
    private Button bButton;
    @FXML
    private Button eButton2;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        guitar = new ElectricGuitar();
        guitar.populateStrings();
    }    
    
    @FXML
    private void handleGoToHomePage(ActionEvent event) {
        guitar.resetPlayer();
        Switchable.switchTo("HomePage");
    }
    
    @FXML
    private void handlePlayLowE() {
        guitar.playLowE();
    }
    
    @FXML
    private void handlePlayA() {
        guitar.playA();
    }
    
    @FXML
    private void handlePlayD() {
        guitar.playD();
    }
    
    @FXML
    private void handlePlayG() {
        guitar.playG();
    }
    
    @FXML
    private void handlePlayB() {
        guitar.playB();
    }
    
    @FXML
    private void handlePlayHighE() {
        guitar.playHighE();
    }
}
