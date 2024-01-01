package sample;

//--module-path "C:\JAVAFX\javafx-sdk-17.0.2\lib" --add-modules javafx.controls,javafx.fxml
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.collections.FXCollections;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.SelectionMode;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.geometry.Orientation;

public class ListViewDemo extends Application{
    private String[] flagsTitles={"Canada","China","Denmark","France","GErmany","India","Norway","United kingdom","United States of America"};
    private ImageView[] flagImage={
            new ImageView("D:\\ICONS\\country-flags-main\\png100px\\ca.png"),
            new ImageView("D:\\ICONS\\country-flags-main\\png100px\\cn.png"),
            new ImageView("D:\\ICONS\\country-flags-main\\png100px\\de.png"),
            new ImageView("D:\\ICONS\\country-flags-main\\png100px\\fr.png"),
            new ImageView("D:\\ICONS\\country-flags-main\\png100px\\ge.png"),
            new ImageView("D:\\ICONS\\country-flags-main\\png100px\\in.png"),
            new ImageView("D:\\ICONS\\country-flags-main\\png100px\\no.png"),
            new ImageView("D:\\ICONS\\country-flags-main\\png100px\\us.png"),
            new ImageView("D:\\ICONS\\country-flags-main\\png100px\\um.png")
    };
    @Override
    public void start(Stage primaryStage){
        ListView<String> lv=new ListView<>(FXCollections.observableArrayList(flagsTitles));
        lv.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);

        FlowPane imagePane=new FlowPane(10,10);
//        imagePane.setAlignment(Pos.TOP_RIGHT);
        ScrollPane scrollPane=new ScrollPane(imagePane);
        BorderPane pane=new BorderPane();
        pane.setLeft(new ScrollPane(lv));
        pane.setCenter(scrollPane);
        lv.getSelectionModel().selectedItemProperty().addListener(ov->{
            imagePane.getChildren().clear();
            for(Integer i:lv.getSelectionModel().getSelectedIndices())
                imagePane.getChildren().add(flagImage[i]);
        });

        Scene scene=new Scene(pane,450,170);
        primaryStage.setTitle("ListViewDemo");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args){
        launch(args);
    }
}
