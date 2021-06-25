package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    public TextArea textArea;

    @FXML
    public TextField textField;

    public void btnSendClick(ActionEvent actionEvent) {
        String text = textArea.getText() + textField.getText() + "\n";
        textField.setText("");
        textField.requestFocus();
        textArea.setText(text);
        textArea.setScrollTop(Double.MAX_VALUE);
    }

    public void menuExitSelect(ActionEvent actionEvent) {
        System.out.println("Чат завершен");
        System.exit(0);
    }
}
