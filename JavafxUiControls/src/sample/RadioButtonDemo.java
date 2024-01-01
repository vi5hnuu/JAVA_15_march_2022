package sample;

//--module-path "C:\JAVAFX\javafx-sdk-17.0.2\lib" --add-modules javafx.controls,javafx.fxml
import javafx.geometry.Insets;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;

public class RadioButtonDemo extends CheckBoxDemo_byinheritence{
    @Override
    protected  BorderPane getPane(){
        BorderPane pane=super.getPane();
        VBox paneForRadioButtons=new VBox(20);
        paneForRadioButtons.setPadding(new Insets(5,5,5,5));
        paneForRadioButtons.setStyle("-fx-border-width:2px; -fx-border-color:green");

        RadioButton rbRed=new RadioButton("RED");
        RadioButton rbGreen=new RadioButton("Green");
        RadioButton rbBlue=new RadioButton("Blue");
        paneForRadioButtons.getChildren().addAll(rbBlue,rbGreen,rbRed);
        pane.setLeft(paneForRadioButtons);

        ToggleGroup group=new ToggleGroup();
        rbRed.setToggleGroup(group);
        rbGreen.setToggleGroup(group);
        rbBlue.setToggleGroup(group);

        rbBlue.setOnAction(e->{
            if(rbBlue.isSelected()) {text.setFill(Color.BLUE);}

        });
        rbGreen.setOnAction(e->{if(rbGreen.isSelected()){text.setFill(Color.GREEN);}});
        rbRed.setOnAction(e->{if(rbRed.isSelected()){text.setFill(Color.RED);}});

        return pane;
    }
    public static void main(String[] args){
        launch(args);
    }
}
