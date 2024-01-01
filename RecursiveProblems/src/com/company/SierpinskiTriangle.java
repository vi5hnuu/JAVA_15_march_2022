package com.company;

//--module-path "C:\JAVAFX\javafx-sdk-17.0.2\lib" --add-modules javafx.controls,javafx.fxml

import javafx.application.Application;
import javafx.geometry.Point2D;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.stage.Stage;
import org.w3c.dom.Text;

public class SierpinskiTriangle extends Application{
@Override
    public void start(Stage primaryStage){
    SierPinskiTrianglePane pane=new SierPinskiTrianglePane();
    TextField tfOrder=new TextField();
//    pane.order=5;
    tfOrder.setOnAction(e->{pane.setOrder(Integer.parseInt(tfOrder.getText()));});
    tfOrder.setPrefColumnCount(4);
    tfOrder.setAlignment(Pos.BOTTOM_RIGHT);

    HBox hBox=new HBox(10);
    hBox.getChildren().addAll(new Label("Enter an Order :"),tfOrder);
    hBox.setAlignment(Pos.CENTER);

    BorderPane borderPane=new BorderPane();
    borderPane.setCenter(pane);
    borderPane.setBottom(hBox);

    Scene scene=new Scene(borderPane,200,210);
    primaryStage.setTitle("Sierpinski Triangle");
    primaryStage.setScene(scene);
    primaryStage.show();
    pane.widthProperty().addListener(ov->pane.paint());
    pane.heightProperty().addListener(ov->pane.paint());
}
public static void main(String[] args){
    launch(args);
}
static class SierPinskiTrianglePane extends Pane{
    private int order=0;
    public void setOrder(int order){
        this.order=order;
        paint();
    }
    SierPinskiTrianglePane(){}
    protected void paint(){
        Point2D p1=new Point2D(getWidth()/2,10);
        Point2D p2=new Point2D(10,getHeight()-10);
        Point2D p3=new Point2D(getWidth()-10,getHeight()-10);
        this.getChildren().clear();
        displayTriangle(order,p1,p2,p3);
    }
    private void displayTriangle(int order,Point2D p1,Point2D p2,Point2D p3){
        if(order>5)
            order=5;
        if(order==0){
            Polygon trianle=new Polygon();
            trianle.getPoints().addAll(p1.getX(),p1.getY(),p2.getX(),p2.getY(),p3.getX(),p3.getY());
            trianle.setStroke(Color.BLACK);
            trianle.setFill(Color.WHITE);
            this.getChildren().add(trianle);
        }
        else{
            Point2D p12=p1.midpoint(p2);
            Point2D p23=p2.midpoint(p3);
            Point2D p31=p3.midpoint(p1);
            displayTriangle(order-1,p1,p12,p31);
            displayTriangle(order-1,p12,p2,p23);
            displayTriangle(order-1,p31,p23,p3);
        }
    }
}
}


