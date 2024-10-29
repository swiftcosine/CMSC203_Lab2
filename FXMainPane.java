package GUI;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.application.Platform;


public class FXMainPane extends VBox {

    // Declare components
    Button buttonHello, buttonHowdy, buttonChinese, buttonClear, buttonExit;
    Button buttonKoreanHello, buttonSpanishHello, buttonJapaneseHello; // New buttons
    Label feedbackLabel;
    TextField feedbackText;
    HBox hboxButtons, hboxFeedback;
    
    // Declare DataManager instance
    private DataManager dataManager;
	
    // Constructor
    public FXMainPane() {
        // Step 3B: Initialize the buttons with labels
        buttonHello = new Button("Hello");
        buttonHowdy = new Button("Howdy");
        buttonChinese = new Button("Chinese");
        // Initialize the new buttons for Korean, Spanish, and Japanese greetings
        buttonSpanishHello = new Button("Hola");
        buttonKoreanHello = new Button("안녕하세요");
        buttonJapaneseHello = new Button("こんにちは");
        buttonClear = new Button("Clear");
        buttonExit = new Button("Exit");

        // Initialize label and text field
        feedbackLabel = new Label("Feedback:");
        feedbackText = new TextField();

        // Initialize HBoxes
        hboxButtons = new HBox();
        hboxFeedback = new HBox();

        // Step 4 (coming up): Add components to HBoxes and the main VBox
        // Add buttons to hboxButtons
        hboxButtons.getChildren().addAll(buttonHello, buttonHowdy, buttonChinese, buttonSpanishHello, buttonKoreanHello, buttonJapaneseHello, 
        buttonClear, buttonExit);

        // Add label and text field to hboxFeedback
        hboxFeedback.getChildren().addAll(feedbackLabel, feedbackText);

        // Add HBoxes to the main VBox (FXMainPane)
        this.getChildren().addAll(hboxButtons, hboxFeedback);
     // Initialize DataManager instance
        dataManager = new DataManager();

        // Attach event handler to buttons
        buttonHello.setOnAction(new ButtonHandler());
        buttonHowdy.setOnAction(new ButtonHandler());
        buttonChinese.setOnAction(new ButtonHandler());
        buttonSpanishHello.setOnAction(new ButtonHandler());
        buttonKoreanHello.setOnAction(new ButtonHandler());
        buttonJapaneseHello.setOnAction(new ButtonHandler());
        buttonClear.setOnAction(new ButtonHandler());
        buttonExit.setOnAction(new ButtonHandler());
    }
    
    // Inner class to handle button events
    private class ButtonHandler implements EventHandler<ActionEvent> {
        @Override
        public void handle(ActionEvent event) {
            if (event.getSource() == buttonHello) {
                feedbackText.setText(dataManager.getHello());
            } else if (event.getSource() == buttonHowdy) {
                feedbackText.setText(dataManager.getHowdy());
            } else if (event.getSource() == buttonChinese) {
                feedbackText.setText(dataManager.getChinese());
            } else if (event.getSource() == buttonKoreanHello) {
                feedbackText.setText(dataManager.getKoreanHello());
            } else if (event.getSource() == buttonSpanishHello) {
                feedbackText.setText(dataManager.getSpanishHello());
            } else if (event.getSource() == buttonJapaneseHello) {
                feedbackText.setText(dataManager.getJapaneseHello());
            } else if (event.getSource() == buttonClear) {
                feedbackText.setText("");  // Clear the text field
            } else if (event.getSource() == buttonExit) {
                Platform.exit();           // Exit the application
                System.exit(0);
            }
        }
    }
}