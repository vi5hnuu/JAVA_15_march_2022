package sample;

//--module-path "C:\JAVAFX\javafx-sdk-17.0.2\lib" --add-modules javafx.controls,javafx.fxml
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.image.Image;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Ellipse;

public class LaelWithGraphic extends Application{
    @Override
    public void start(Stage primaryStage){
        Image img=new Image("D:\\JAVA_UDEMY\\JavafxUiControls\\src\\sample\\author.jpg");
        ImageView us=new ImageView(img);
        us.setFitHeight(200);
        us.setFitWidth(200);
        Label lb1=new Label("Name\nAuthor image",us);
        lb1.setStyle("-fx-border-color:green; -fx-border-width:2");
        lb1.setContentDisplay(ContentDisplay.BOTTOM);
        lb1.setTextFill(Color.RED);

        Label lb2=new Label("Circle",new Circle(50,50,25));
        lb2.setContentDisplay(ContentDisplay.TOP);
        lb2.setTextFill(Color.ORANGE);

        Label lb3=new Label("Rectangle",new Rectangle(10,10,50,25));
        lb3.setContentDisplay(ContentDisplay.RIGHT);

        Label lb4=new Label("Ellipse",new Ellipse(50,50,50,25));
        Ellipse ellipse=new Ellipse(50,50,50,25);
        ellipse.setStroke(Color.GREEN);
        ellipse.setFill(Color.WHITE);
        StackPane stackPane=new StackPane();
        stackPane.getChildren().addAll(ellipse,new Label("JavaFx"));
        Label lb5=new Label("A pane inside a Label",stackPane);
        lb5.setContentDisplay(ContentDisplay.BOTTOM);
        HBox pane=new HBox(20);
        pane.getChildren().addAll(lb1,lb2,lb3,lb4,lb5);

        Scene scene=new Scene(pane);
        primaryStage.setTitle("Label ith Graphic");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args){
        Application.launch(args);
    }
}
