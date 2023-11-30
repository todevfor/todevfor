package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class HomeController {

    @FXML
    void BPlayAction(ActionEvent event) {
    	Main.StartScreen("Game");
    }

    @FXML
    void BVoltarAction(ActionEvent event) {
    	Main.StartScreen("Main");
    	
    }

}
