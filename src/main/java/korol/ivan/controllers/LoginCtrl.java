package korol.ivan.controllers;

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

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
        //showMainScreen();
    }

    public void showMainScreen(Event event) {
        try {
            Scene mainScreen = new Scene(new StackPane());
            FXMLLoader loader = new FXMLLoader(MainScreenCtrl.class.getResource("/view/mainScreen.fxml"));
            mainScreen.setRoot((Parent) loader.load());
            Stage mainScreenStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            mainScreenStage.setScene(mainScreen);
            mainScreenStage.show();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
