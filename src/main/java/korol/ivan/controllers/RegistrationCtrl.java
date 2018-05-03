package korol.ivan.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import korol.ivan.common.ScreenLoader;

/**
 * @author Ivan Korol on 5/3/2018
 */
public class RegistrationCtrl {
    @FXML
    private Button regCancel;
    @FXML
    private Button regConfirm;



    public void regCancel(ActionEvent actionEvent) {
        ScreenLoader.showScreen(actionEvent, "logIn.fxml");
    }

    public void regConfirm(ActionEvent actionEvent) {
    }
}
