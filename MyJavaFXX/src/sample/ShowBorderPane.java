package sample;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class ShowBorderPane extends Application{
    @Override
    public void start(Stage primaryStage){
        BorderPane pane=new BorderPane();
        pane.setTop(new CustomPane("Top"));
        pane.setBottom(new CustomPane("Bottom"));
        pane.setLeft(new CustomPane("Left"));
        pane.setRight(new CustomPane("Right"));
        pane.setCenter(new CustomPane("Center"));

        Scene scene=new Scene(pane);
        primaryStage.setTitle("Show BorderPane");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args){
        Application.launch(args);
    }
}

class CustomPane extends StackPane{
    public CustomPane(String title){
        super();//or omit because it is bydefault called
        getChildren().add(new Label(title));
        setStyle("-fx-border-color:red");
        setPadding(new Insets(11.5,12.5,12.5,11.5));
    }
}
