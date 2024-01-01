package sample;

//--module-path "C:\JAVAFX\javafx-sdk-17.0.2\lib" --add-modules javafx.controls,javafx.fxml
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class HandleEvent extends Application {
    @Override
    public void start(Stage primarStage){
        HBox pane=new HBox(10);
        pane.setAlignment(Pos.CENTER);
        Button btOk=new Button("OK");
        Button btCancel=new Button("Cancel");
        okHandleClass handle1=new okHandleClass();
        btOk.setOnAction(handle1);
        CacelHandlerClass handke2=new CacelHandlerClass();
        btCancel.setOnAction(handke2);
        pane.getChildren().addAll(btOk,btCancel);

        Scene scene=new Scene(pane);
        primarStage.setTitle("handleEvent");
        primarStage.setScene(scene);
        primarStage.show();
    }
    public static void main(String[] args){
        Application.launch(args);
    }
}

class okHandleClass implements EventHandler<ActionEvent>{
    @Override
    public void handle(ActionEvent e){
        System.out.println("Ok button clicked");
    }
}

class CacelHandlerClass implements EventHandler<ActionEvent>{
    @Override
    public void handle(ActionEvent e){
        System.out.println("Cancel button clicked");
    }
}
