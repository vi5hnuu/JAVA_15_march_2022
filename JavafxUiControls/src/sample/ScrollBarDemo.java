package sample;

//--module-path "C:\JAVAFX\javafx-sdk-17.0.2\lib" --add-modules javafx.controls,javafx.fxml
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.ScrollBar;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;

public class ScrollBarDemo extends Application{
    @Override
    public void start(Stage primaryStage){
        Text text=new Text(20,20,"JavaFx programming");

        ScrollBar sbHorizontal=new ScrollBar();
        ScrollBar sbVerticle=new ScrollBar();
        sbVerticle.setOrientation(Orientation.VERTICAL);
        Pane paneForText=new Pane();
        paneForText.getChildren().add(text);

        BorderPane pane=new BorderPane();
        pane.setCenter(paneForText);
        pane.setBottom(sbHorizontal);
        pane.setRight(sbVerticle);

        sbHorizontal.valueProperty().addListener(ov->{
            text.setX(sbHorizontal.getValue()*paneForText.getWidth()/sbHorizontal.getMax());
        });
        sbVerticle.valueProperty().addListener(ov->{
            text.setY(sbVerticle.getValue()*paneForText.getHeight()/sbVerticle.getMax());
        });
        Scene scene=new Scene(pane,450,200);
        primaryStage.setTitle("ScrollBarDemo");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args){
        launch(args);
    }
}
