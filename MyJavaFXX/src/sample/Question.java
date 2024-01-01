package sample;
//--module-path "C:\JAVAFX\javafx-sdk-17.0.2\lib" --add-modules javafx.controls,javafx.fxml
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class Question extends Application {
    public Question() {
        System.out.println("Test constructor is invoked");
    }
    @Override // Override the start method in the Application class
    public void start(Stage primaryStage) {
        System.out.println("start method is invoked");
    }
    public static void main(String[] args) {
        System.out.println("launch application");
        Application.launch(args);
    }
}