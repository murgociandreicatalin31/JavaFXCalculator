package ro.ctrln.javafx.calculator;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class JavaFXCalculator extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Calculator.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root, 400, 400);

        stage.setTitle("JavaFX Calculator");
        stage.setScene(scene);
        stage.show();
    }
}
