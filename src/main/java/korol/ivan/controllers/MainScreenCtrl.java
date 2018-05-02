package korol.ivan.controllers;

import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import javafx.scene.control.Button;
import korol.ivan.common.ScreenLoader;

import java.io.IOException;

/**
 * @author by Ivan Korol on 11/8/2017.
 */
public class MainScreenCtrl {
    private Scene scene;

    @FXML
    private Button bck;

    public MainScreenCtrl() {

    }

    @FXML
    public void click() {
        bck.setOnAction(e -> {
            showLoginScreen(e);
        });
    }

    public MainScreenCtrl(Scene scene) {
        this.scene = scene;
    }

    public void showLoginScreen(Event event) {

        ScreenLoader.showScreen(event, "logIn.fxml");
    }


}
