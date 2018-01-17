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
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;

/**
 * FXML Controller class
 *
 * @author dhuangal
 */
public class HomePageController extends Switchable implements Initializable {

    @FXML
    private Label headerLabel;
    @FXML
    private ImageView acousticImageView;
    @FXML
    private ImageView electricImageView;
    @FXML
    private Button acousticButton;
    @FXML
    private Button electricButton;
    @FXML
    private AnchorPane homePagePane;
    @FXML
    private HBox titleBox;
    @FXML
    private Label styleChooser;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    @FXML
    private void handleGoToAcoustic(ActionEvent event) {
        Switchable.switchTo("Acoustic");
    }
    
    @FXML
    private void handleGoToElectric(ActionEvent event) {
        Switchable.switchTo("Electric");
    }
}
