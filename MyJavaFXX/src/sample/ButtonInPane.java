package sample;
//--module-path "C:\JAVAFX\javafx-sdk-17.0.2\lib" --add-modules javafx.controls,javafx.fxml
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class ButtonInPane extends Application {
    @Override // Override the start method in the Application class
    public void start(Stage primaryStage) {
        StackPane pane=new StackPane();
        pane.getChildren().add(new Button("ok"));
        Scene scene=new Scene(pane,200,50);
        primaryStage.setTitle("Button in pane");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args) {
        Application.launch(args);
    }
}