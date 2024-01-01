package sample;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;

public class ButtonDemo extends Application{
    protected Text text=new Text(50,50,"JavaFx programming");
    protected BorderPane getPane(){
        HBox paneForButtons=new HBox(20);
        Button btLeft=new Button("Left",new ImageView("D:\\ICONS\\arrow_icons\\left_green.png"));
        Button btRight=new Button("Right",new ImageView("D:\\ICONS\\arrow_icons\\right_green.png"));
        paneForButtons.getChildren().addAll(btLeft,btRight);
        paneForButtons.setAlignment(Pos.CENTER);
        paneForButtons.setStyle("-fx-border-color:green");

        BorderPane pane=new BorderPane();
        pane.setBottom(paneForButtons);

        Pane paneForText=new Pane();
        paneForText.getChildren().add(text);
        pane.setCenter(paneForText);
        btLeft.setOnAction(e->text.setX(text.getX()-10));
        btRight.setOnAction(e->text.setX(text.getX()+10));
        return pane;
    }
    public static void main(String[] args){
        Application.launch(args);
    }
    @Override
    public void start(Stage primaryStage){
        Scene scene=new Scene(getPane(),450,200);
        primaryStage.setTitle("Button Demo");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
