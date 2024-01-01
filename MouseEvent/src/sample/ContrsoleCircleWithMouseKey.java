package sample;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.KeyCode;
import javafx.scene.input.MouseButton;
import javafx.scene.layout.HBox;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class ContrsoleCircleWithMouseKey extends Application{
    private CirlePane cirlePane=new CirlePane();
    @Override
    public void start(Stage primaryStage){
        HBox hBox=new HBox();
        hBox.setSpacing(10);
        hBox.setAlignment(Pos.CENTER);
        Button btEnlarge=new Button("Enlarge");
        Button btShrink=new Button("Shrink");
        hBox.getChildren().add(btEnlarge);
        hBox.getChildren().add(btShrink);

        btEnlarge.setOnAction(e->cirlePane.enlarge());
        btShrink.setOnAction(e->cirlePane.shrink());

        BorderPane borderPane=new BorderPane();
        borderPane.setCenter(cirlePane);
        borderPane.setBottom(hBox);
        BorderPane.setAlignment(hBox,Pos.CENTER);

        Scene scene=new Scene(borderPane,200,150);
        primaryStage.setTitle("ControleCircle");
        primaryStage.setScene(scene);
        primaryStage.show();

        cirlePane.setOnMouseClicked(e->{if(e.getButton()==MouseButton.PRIMARY){cirlePane.enlarge();}
        else if(e.getButton()==MouseButton.SECONDARY){cirlePane.shrink();}});
        scene.setOnKeyPressed(e->{if(e.getCode()==KeyCode.UP){cirlePane.enlarge();}
        else if(e.getCode()==KeyCode.DOWN){cirlePane.shrink();}});
    }
}
