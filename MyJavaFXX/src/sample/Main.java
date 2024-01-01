package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Button;


public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Button btn=new Button("ok");
        Scene scene=new Scene(btn,200,250);
        primaryStage.setTitle("My first java fx application");
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }

}
