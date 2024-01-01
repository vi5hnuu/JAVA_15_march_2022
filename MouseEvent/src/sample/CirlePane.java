package sample;

import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class CirlePane extends StackPane{
    private Circle cirle=new Circle(50);
    public  CirlePane(){
        getChildren().add(cirle);
        cirle.setStroke(Color.BLACK);
        cirle.setFill(Color.WHITE);
    }
    public void enlarge(){
        cirle.setRadius(cirle.getRadius()+2);
    }
    public void shrink(){
        cirle.setRadius(cirle.getRadius()>2 ? cirle.getRadius()-2:cirle.getRadius());
    }

}
