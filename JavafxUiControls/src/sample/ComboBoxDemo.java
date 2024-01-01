package sample;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;


public class ComboBoxDemo extends Application{
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
    private String[] flagDescription=new String[9];
    private DescriptionPane descriptionPane=new DescriptionPane();
    private ComboBox<String> cbo=new ComboBox<>();

    @Override
    public void start(Stage primaryStage){
         flagDescription[0] = "The Canadian national flag ... ";
         flagDescription[1] = "Description for China ... ";
         flagDescription[2] = "Description for Denmark ... ";
         flagDescription[3] = "Description for France ... ";
         flagDescription[4] = "Description for Germany ... ";
         flagDescription[5] = "Description for India ... ";
         flagDescription[6] = "Description for Norway ... ";
         flagDescription[7] = "Description for UK ... ";
         flagDescription[8] = "Description for US ... ";

         setDisplay(0);

         BorderPane pane=new BorderPane();
         BorderPane paneForComboBox=new BorderPane();
         paneForComboBox.setLeft(new Label("Select a country:"));
         paneForComboBox.setCenter(cbo);
         pane.setTop(paneForComboBox);
         cbo.setPrefWidth(400);
         cbo.setValue("Canada");

         ObservableList<String> items=FXCollections.observableArrayList(flagsTitles);
         cbo.getItems().addAll(items);
         pane.setCenter(descriptionPane);

         cbo.setOnAction(e->setDisplay(items.indexOf(cbo.getValue())));

        Scene scene = new Scene(pane, 450, 170);
        primaryStage.setTitle("ComboBoxDemo"); // Set the stage title
        primaryStage.setScene(scene); // Place the scene in the stage
        primaryStage.show(); // Display the stage
    }
    public void setDisplay(int index){
        descriptionPane.setTitle(flagsTitles[index]);
        descriptionPane.setImageView(flagImage[index]);
        descriptionPane.setDescription(flagDescription[index]);
    }
}
