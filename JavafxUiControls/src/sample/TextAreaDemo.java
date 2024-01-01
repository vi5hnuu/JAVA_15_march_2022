package sample;

//--module-path "C:\JAVAFX\javafx-sdk-17.0.2\lib" --add-modules javafx.controls,javafx.fxml

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;

import java.util.ArrayList;

public class TextAreaDemo extends Application{
    @Override
    public void start(Stage primaryStage){
        DescriptionPane descriptionPane=new DescriptionPane();

        descriptionPane.setTitle("Canada");
        String description="The baby girl";
        ImageView img=new ImageView("D:\\ICONS\\baby.jpg");
        img.setFitWidth(100);
        img.setFitHeight(150);
        descriptionPane.setImageView(img);
        descriptionPane.setDescription(description);

        Scene scene=new Scene(descriptionPane,450,200);
        primaryStage.setTitle("TextAreaDemo");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args){
        launch(args);
    }

}
