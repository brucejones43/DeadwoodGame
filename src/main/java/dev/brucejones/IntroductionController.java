package dev.brucejones;/*
 * @author David
 */

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.scene.Scene;


public class IntroductionController implements Initializable {

    public Label label;
    public Button button;
    private Scene cCScene;
    
    public void setNextScene(Scene scene) {
        cCScene = scene;
    }
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        Stage characterCreation = (Stage)((Node) event.getSource()).getScene().getWindow();
        characterCreation.setScene(cCScene);
        
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {}
    
}
