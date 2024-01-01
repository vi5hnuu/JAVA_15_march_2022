package sample;

//--module-path "C:\JAVAFX\javafx-sdk-17.0.2\lib" --add-modules javafx.controls,javafx.fxml
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;

public class PasswordFieldDemo extends RadioButtonDemo{
    @Override
    protected BorderPane getPane(){
        BorderPane pane=super.getPane();
        HBox paneForTextField=new HBox(20);
        paneForTextField.setPadding(new Insets(5,5,5,5));
        paneForTextField.setStyle("-fx-border-color:green");
        paneForTextField.getChildren().add(new Label("Enter a new Message :"));
        paneForTextField.setAlignment(Pos.CENTER);
        PasswordField tf=new PasswordField();
        tf.setAlignment(Pos.TOP_RIGHT);
        paneForTextField.getChildren().add(tf);
        pane.setTop(paneForTextField);

        tf.setOnAction(e->text.setText(tf.getText()));
        return pane;
    }
    public static void main(String[] args){
        launch(args);
    }
}
