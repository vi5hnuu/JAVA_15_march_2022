package sample;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;


public class ShowFloaPane extends Application {
@Override
    public void start(Stage primaryStage){
    FlowPane pane=new FlowPane();
    pane.setPadding(new Insets(11,12,11,12));
    pane.setHgap(5);
    pane.setVgap(5);
    pane.getChildren().addAll(new Label("First Name :"),new TextField(),new Label("MI:"));
    TextField tfmi=new TextField();
    tfmi.setPrefColumnCount(1);
    pane.getChildren().addAll(tfmi,new Label("Last Name:"),new TextField());

    Scene scene=new Scene(pane,300,250);
    primaryStage.setTitle("Show FlowPane");
    primaryStage.setScene(scene);
    primaryStage.setResizable(false);//comment and try resizing
    primaryStage.show();
}
public  static void main(String[] args){
    Application.launch(args);
}
}
