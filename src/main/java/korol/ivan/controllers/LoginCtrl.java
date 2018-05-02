package korol.ivan.controllers;

import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import korol.ivan.common.ScreenLoader;

import java.io.IOException;


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

    public void showLoginScreen() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/logIn.fxml"));
            scene.setRoot((Parent) loader.load());
        } catch (IOException ex) {
            System.out.println("show login screen something going wrong");
            ex.printStackTrace();
        }
    }

    @FXML
    public void onClick()  {
        login.setOnAction(e->
            showMainScreen(e)
        );

    }

    public void showMainScreen(Event event) {
        ScreenLoader.showScreen(event, "mainScreen.fxml");
    }

}
