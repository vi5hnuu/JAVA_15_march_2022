package sample;
//--module-path "C:\JAVAFX\javafx-sdk-17.0.2\lib" --add-modules javafx.controls,javafx.fxml
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.image.ImageView;
import javafx.scene.image.Image;

public class ShowHboxVbox extends Application{
    @Override
    public void start(Stage primaryStage){
        BorderPane pane=new BorderPane();
        pane.setTop(getHbox());
        pane.setLeft(getVbox());

        Scene scene=new Scene(pane);
        primaryStage.setTitle("ShowHboxVbox");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private HBox getHbox(){
        HBox hBox=new HBox(15);
        hBox.setPadding(new Insets(15,15,15,15));
        hBox.setStyle("-fx-background-color:gold;");
        hBox.getChildren().add(new Button("Computer science"));
        hBox.getChildren().add(new Button("Chemistry"));
        Image img=new Image("D:\\JAVA_UDEMY\\MyJavaFXX\\src\\sample\\om.jpg");
        ImageView imageview=new ImageView(img);
//        ImageView imageview=new ImageView(new Image("D:\\JAVA_UDEMY\\MyJavaFXX\\src\\sample\\om.jpg"));
        imageview.setFitWidth(50);
        imageview.setFitHeight(50);
        imageview.setStyle("-fx-border-radius:50");
        hBox.getChildren().add(imageview);
        return hBox;
    }
    private VBox getVbox(){
        VBox vBox=new VBox(15);
        vBox.setPadding(new Insets(15,5,5,15));
        vBox.getChildren().add(new Label("Courses"));
        Label[] courses={new Label("SCE316"),new Label("INT208"),new Label("MTH403"),new Label("CSE203")};
        for(Label x:courses){
            VBox.setMargin(x,new Insets(0,0,0,15));
            vBox.getChildren().add(x);
        }
        return vBox;
    }
    public static void main(String[] args){
        Application.launch(args);
    }
}
