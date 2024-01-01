package sample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
//import javafx.scene.layout.VBox;
import javafx.scene.layout.Pane;
import javafx.geometry.Insets;
import javafx.stage.Stage;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class ShowImage extends Application{
    @Override
    public void start(Stage primaryStage){
        Pane pane=new HBox(100); //gap
        pane.setPadding(new Insets(5,5,5,5));
        Image image=new Image("D:\\JAVA_UDEMY\\MyJavaFXX\\src\\sample\\om.jpg");
        pane.getChildren().add(new ImageView(image));

        ImageView image1=new ImageView(image);
        image1.setFitHeight(100);
        image1.setFitWidth(100);
        pane.getChildren().add(image1);

        ImageView image2=new ImageView(image);
        image2.setRotate(90);
        pane.getChildren().add(image2);

        Scene scene=new Scene(pane);
        primaryStage.setTitle("Image and Image view");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args){
        Application.launch();
    }
}
