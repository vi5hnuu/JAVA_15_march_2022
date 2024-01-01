package sample;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;

public class TextFiledDemo extends RadioButtonDemo{
    @Override
    protected BorderPane getPane(){
        BorderPane pane=super.getPane();

        BorderPane paneForTextField=new BorderPane();
        paneForTextField.setPadding(new Insets(5,5,5,5));
        paneForTextField.setStyle("-fx-border-color:green");
        paneForTextField.setLeft(new Label("Enter a new Message :"));

        TextField tf=new TextField();
        tf.setAlignment(Pos.TOP_RIGHT);
        paneForTextField.setCenter(tf);
        pane.setTop(paneForTextField);

        tf.setOnAction(e->text.setText(tf.getText()));
        return pane;
    }
    public static void main(String[] args){
        launch(args);
    }
}
