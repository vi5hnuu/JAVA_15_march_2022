package sample;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class ShowCrcle extends Application{
    @Override
    public void start(Stage primaryStage){
        Circle circle=new Circle();
//        circle.setCenterX(100);
//        circle.setCenterY(100); //when whindow is resized it wont be in relative to window so use binding

        circle.setRadius(50);
        circle.setStroke(Color.BLACK);
        circle.setFill(Color.BLUE);

        Pane pane=new Pane();
        circle.centerXProperty().bind(pane.widthProperty().divide(2));
        circle.centerYProperty().bind(pane.heightProperty().divide(2));
        pane.getChildren().add(circle);

        Scene scene=new Scene(pane,200,500);
        primaryStage.setTitle("Circle");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args){
        Application.launch(args);
    }
}
