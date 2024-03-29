package sample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.shape.Line;

public class ShowLine extends Application{
    @Override
    public void start(Stage primaryStage){
        Scene scene=new Scene(new LinePane(),200,200);
        primaryStage.setTitle("Show line");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args){
        Application.launch(args);
    }
}


class LinePane extends Pane{
    public LinePane(){
        super(); //not necessary to declare
        Line line1=new Line(10,10,10,10);
        line1.endXProperty().bind(widthProperty().subtract(10));;
        line1.endYProperty().bind(heightProperty().subtract(10));
        line1.setStrokeWidth(5);
        line1.setStroke(Color.GREEN);
        getChildren().add(line1);

        Line line2=new Line(10,10,10,10);
        line2.startXProperty().bind(widthProperty().subtract(10));
        line2.endYProperty().bind(heightProperty().subtract(10));
        line2.setStrokeWidth(5);
        line2.setStroke(Color.GREEN);
        getChildren().add(line2);
    }
}