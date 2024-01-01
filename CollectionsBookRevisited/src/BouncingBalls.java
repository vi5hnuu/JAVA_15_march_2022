
//--module-path "C:\JAVAFX\javafx-sdk-17.0.2\lib" --add-modules javafx.controls,javafx.fxml

import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.animation.KeyFrame;
import javafx.beans.property.DoubleProperty;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollBar;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.util.Duration;

public class BouncingBalls extends Application{
    @Override
    public void start(Stage primaryStage){
        MultipleBallPane ballPane=new MultipleBallPane();
        ballPane.setStyle("-fx-border-color:yellow");

        Button btAdd=new Button("+");
        Button btSubtract=new Button("-");
        HBox hBox=new HBox(10);
        hBox.getChildren().addAll(btAdd,btSubtract);
        hBox.setAlignment(Pos.CENTER);

        btAdd.setOnAction(e->ballPane.add());
        btSubtract.setOnAction(e->ballPane.subtract());

        ballPane.setOnMousePressed(e->ballPane.pause());
        ballPane.setOnMouseReleased(e->ballPane.play());

        ScrollBar sbSpeed=new ScrollBar();
        sbSpeed.setMax(20);
        sbSpeed.setValue(10);
        ballPane.rateProperty().bind(sbSpeed.valueProperty());

        BorderPane pane=new BorderPane();
        pane.setCenter(ballPane);
        pane.setTop(sbSpeed);
        pane.setBottom(hBox);

        Scene scene=new Scene(pane,250,150);
        primaryStage.setTitle("Bouncing ball");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }

    private class MultipleBallPane extends Pane{
        private Timeline animation;
        public MultipleBallPane(){
            animation=new Timeline(new KeyFrame(Duration.millis(50),e->moveBall()));
            animation.setCycleCount(Timeline.INDEFINITE);
            animation.play();
        }

        public void add(){
            Color color=new Color(Math.random(),Math.random(),Math.random(),0.5);
            getChildren().addAll(new Ball(30,30,20,color));
        }
        public void subtract(){
            if(getChildren().size()>0){
                getChildren().remove(getChildren().size()-1);
            }
        }
        public void play(){
            animation.play();
        }
        public void pause(){
            animation.pause();
        }
        public void increaseSpeed(){
            animation.setRate(animation.getRate()+0.1);
        }
        public void decreaseSpeed(){
            animation.setRate(animation.getRate()>0 ? animation.getRate()-0.1:0);
        }
        public DoubleProperty rateProperty(){
            return animation.rateProperty();
        }

        protected  void moveBall(){
            for(Node node:this.getChildren()){
                Ball ball=(Ball)node;
                if(ball.getCenterX()<ball.getRadius() || ball.getCenterX()>getWidth()-ball.getRadius()){
                    ball.dx*=-1;
                }
                if(ball.getCenterY()<ball.getRadius() || ball.getCenterY()>getHeight()-ball.getRadius()){
                    ball.dy*=-1;
                }
                ball.setCenterX(ball.dx + ball.getCenterX());
                ball.setCenterY(ball.dy + ball.getCenterY());
            }
        }

        private class Ball extends Circle{
            private double dx=1,dy=1;

            Ball(double x,double y,double radius,Color color){
                super(x,y,radius);
                setFill(color);
            }
        }
    }
}
