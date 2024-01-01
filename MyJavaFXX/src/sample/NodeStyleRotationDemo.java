package sample;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.scene.layout.StackPane;

public class NodeStyleRotationDemo extends Application{
    @Override
    public void start(Stage primaryStage){
        StackPane pane=new StackPane();
        Button okbtn=new Button("OK");
        okbtn.setStyle("-fx-border-radius:100;-fx-border-color:red");
        pane.getChildren().add(okbtn);
        pane.setRotate(45);;
        pane.setStyle("-fx-border-color:red;-fx-background-color:lightgray");
        Scene scene=new Scene(pane,200,250);
        primaryStage.setTitle("FX STYLING");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args){
        Application.launch();
    }
}
