package sample;
//--module-path "C:\JAVAFX\javafx-sdk-17.0.2\lib" --add-modules javafx.controls,javafx.fxml

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.*;
import javafx.scene.control.*;
import javafx.stage.Stage;

public class FontDemo extends Application{
    @Override
    public void start(Stage primaryStage){
        Pane pane=new StackPane();
        Circle circle=new Circle();
        circle.setRadius(50);
        circle.setStroke(Color.BLACK);
        circle.setFill(new Color(0.5,0.5,0.5,0.1));
        pane.getChildren().add(circle);

        Label label=new Label("JAVAFX");
        label.setFont(Font.font("Time New Roman",FontWeight.BOLD,FontPosture.ITALIC,20));
        pane.getChildren().add(label);
//        pane.getChildren().addAll(circle, label);
        Scene scene=new Scene(pane);
        primaryStage.setTitle("Font class");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args){
        Application.launch(args);
    }
}
