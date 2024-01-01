package sample;
//--module-path "C:\JAVAFX\javafx-sdk-17.0.2\lib" --add-modules javafx.controls,javafx.fxml
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class MultipleStageDemo extends Application {
    @Override
    public void start(Stage primaryStage){
        Scene scene=new Scene(new Button("ok"),200,250);
        primaryStage.setTitle("First stage");
        primaryStage.setScene(scene);
        primaryStage.show();

        Stage stage=new Stage();
        stage.setTitle("Second stage");
        stage.setScene(new Scene(new Button("okk"),200,250));
        stage.setResizable(false);
        stage.show();
    }
}
