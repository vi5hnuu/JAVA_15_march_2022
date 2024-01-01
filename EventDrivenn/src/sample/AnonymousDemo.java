package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class AnonymousDemo extends Application{
    @Override
    public void start(Stage primaryStage){
        Text text=new Text(40,40,"Programming is fun");
        Pane pane=new Pane(text);
        Button btUp=new Button("UP");
        Button btdown=new Button("DOWN");
        Button btleft=new Button("LEFT");
        Button btright=new Button("RIGHT");
        HBox hBox=new HBox(btUp,btdown,btleft,btright);
        hBox.setSpacing(10);
        hBox.setAlignment(Pos.CENTER);

//        BorderPane borderPane=new BorderPane(pane);
        BorderPane borderPane=new BorderPane();
        borderPane.setCenter(pane);
        borderPane.setBottom(hBox);

        btUp.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                text.setY(text.getY()>10?text.getY()-5:10);
            }
        });
        btdown.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                text.setY(text.getY()<pane.getHeight()?text.getY()+5:pane.getHeight());
            }
        });
        btleft.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent e){
                text.setX(text.getX()>0?text.getX()-5:0);
            }
        });
        btright.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                text.setX(text.getX()<pane.getWidth()-100?text.getX()+5:pane.getWidth()-100);
            }
        });

        Scene scene=new Scene(borderPane,400,350);
        primaryStage.setTitle("AnonymousHAndlerDemo");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args){
        Application.launch(args);
    }
}
