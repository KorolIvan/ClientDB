package korol.ivan.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;


/**
 * @author by Ivan Korol on 11/8/2017.
 */
public class LoginCtrl {
    private Scene scene;

    @FXML
    private Button login;

    @FXML
    private Button registration;

    public LoginCtrl(Scene scene) {
        this.scene = scene;
    }

    public LoginCtrl() {
    }

//    @FXML
//    public void initialize() {
//
//    }

    public void showLoginScreen() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/logIn.fxml"));
            //scene = new Scene((Parent) loader.load());
            scene.setRoot((Parent) loader.load());


        } catch (IOException ex) {
            System.out.println("show login screen something going wrong");
            ex.printStackTrace();
        }
    }


    public void onClick(ActionEvent event)  {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.show();
    }


//    @Override
//    public void initialize(URL location, ResourceBundle resources) {
//
//    }
}
