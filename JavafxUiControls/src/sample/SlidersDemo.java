package sample;


//--module-path "C:\JAVAFX\javafx-sdk-17.0.2\lib" --add-modules javafx.controls,javafx.fxml

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.Slider;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;

public class SlidersDemo extends Application{
    @Override
    public void start(Stage primarystage){
        Text text=new Text(20,20,"JavaFx programming");

        Slider slHorizontal=new Slider();
        slHorizontal.setShowTickLabels(true);
        slHorizontal.setShowTickMarks(true);

        Slider slVerticle=new Slider();
        slVerticle.setOrientation(Orientation.VERTICAL);
        slVerticle.setShowTickMarks(true);
        slVerticle.setShowTickLabels(true);
        slVerticle.setValue(100);

        Pane paneForText=new Pane();
        paneForText.setMaxWidth(450); //450+20(slider)
        paneForText.setMaxHeight(150);//150+20(slider)
        paneForText.setStyle("-fx-border-color:red");
        paneForText.getChildren().add(text);
        BorderPane pane=new BorderPane();
        pane.setCenter(paneForText);
        pane.setBottom(slHorizontal);
        pane.setRight(slVerticle);

        slHorizontal.valueProperty().addListener(ov->{
            text.setX(slHorizontal.getValue()*paneForText.getWidth()/slHorizontal.getMax());
        });
        slVerticle.valueProperty().addListener(ov->{
            text.setY((slVerticle.getMax()-slVerticle.getValue())*paneForText.getHeight()/slVerticle.getMax());
        });

        Scene scene=new Scene(pane,450,170);
        primarystage.setTitle("SlideDemo");
        primarystage.setScene(scene);
        primarystage.show();
    }
    public static void main(String[] args){
        launch(args);
    }
}
