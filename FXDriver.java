package GUI;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;

public class FXDriver extends Application {

    @Override
    public void start(Stage stage) {
        // Step 1: Create an instance of FXMainPane
        FXMainPane root = new FXMainPane();

        // Step 2: Set the scene with the main pane and define window size
        stage.setScene(new Scene(root, 400, 200));  // Set window dimensions to 400x200 pixels
        stage.setTitle("GUI Lab");

        // Step 3: Show the stage
        stage.show();
    }

    public static void main(String[] args) {
        // Launch the JavaFX application
        launch(args);
    }
}
