package korol.ivan.common;

import javafx.event.Event;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import korol.ivan.controllers.MainScreenCtrl;

import java.io.IOException;

/**
 * @author Ivan Korol on 5/2/2018
 */
public class ScreenLoader {

    public static void showScreen(Event event, String screenName) {
        try {
            Scene mainScreen = new Scene(new StackPane());
            FXMLLoader loader = new FXMLLoader(MainScreenCtrl.class.getResource("/view/"+screenName));
            mainScreen.setRoot((Parent) loader.load());
            Stage mainScreenStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            mainScreenStage.setScene(mainScreen);
            mainScreenStage.show();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
