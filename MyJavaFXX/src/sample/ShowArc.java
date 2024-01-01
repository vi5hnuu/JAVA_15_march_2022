package sample;

//--module-path "C:\JAVAFX\javafx-sdk-17.0.2\lib" --add-modules javafx.controls,javafx.fxml

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.layout.BorderPane;
//import javafx.scene.paint.Paint; //Pain is abstract class
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.text.Text;

public class ShowArc extends Application{
    @Override
    public void start(Stage primaryStage){
        Arc arc1=new Arc(150,100,80,80,30,35);
        arc1.setFill(Color.RED);
        arc1.setType(ArcType.ROUND);

        Arc arc2=new Arc(150,100,80,80,30+90,35);
        arc2.setFill(Color.WHITE);
        arc2.setType(ArcType.OPEN);
        arc2.setStroke(Color.BLACK);

        Arc arc3=new Arc(150,100,80,80,30+180,35);
        arc3.setFill(Color.WHITE);
        arc3.setType(ArcType.CHORD);
        arc3.setStroke(Color.BLACK);

        Arc arc4=new Arc(150,100,80,80,30+270,35);
        arc3.setFill(Color.GREEN);
        arc3.setType(ArcType.CHORD);
        arc3.setStroke(Color.BLACK);

        Group group=new Group();
        group.getChildren().addAll(new Text(210,40,"arc1 :round"),arc1,
                new Text(20,40,"arc2 :open"),arc2,
                new Text(20,170,"arc3 :Chord"),arc3,
                new Text(210,170,"arc4 :Chord"),arc4);

//        Scene scene=new Scene(new BorderPane(group),300,200);
        BorderPane pane=new BorderPane();
        pane.setCenter(group);
        Scene scene=new Scene(pane,300,200);
        primaryStage.setTitle("ShowArc");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args){
        Application.launch(args);
    }
}
