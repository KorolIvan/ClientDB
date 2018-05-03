package korol.ivan.controllers;

import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import korol.ivan.common.ScreenLoader;

import java.io.IOException;


/**
 * @author by Ivan Korol on 11/8/2017.
 */
public class LoginCtrl {
    public TextField userName;
    public PasswordField password;
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

    public void showLoginScreen() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/logIn.fxml"));
            scene.setRoot((Parent) loader.load());
        } catch (IOException ex) {
            System.out.println("show login screen something going wrong");
            ex.printStackTrace();
        }
    }

    public boolean userValidation() {
        boolean valid = false;
        if(!userName.getText().isEmpty() && !password.getText().isEmpty()){
            valid = true;
        }

        return valid;
    }

    @FXML
    public void mainScreenLoading()  {
        if(userValidation()){
            login.setOnAction(e->
                    showMainScreen(e)
            );
        }else {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.showAndWait();
        }


    }

    public void showMainScreen(Event event) {
        ScreenLoader.showScreen(event, "mainScreen.fxml");
    }

    public void registrationScreenLoading(Event actionEvent) {
        ScreenLoader.showScreen(actionEvent, "registrationScreen.fxml");
    }
}
