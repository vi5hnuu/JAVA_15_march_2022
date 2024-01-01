package com.company;

//--module-path "C:\JAVAFX\javafx-sdk-17.0.2\lib" --add-modules javafx.controls,javafx.fxml

import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class FlashText extends Application{
    private String text;
    @Override
    public void start(Stage primaryStage){
        StackPane pane=new StackPane();
//        Pane pane=new Pane();
        Label lblText=new Label("Programming is fun");
        pane.getChildren().add(lblText);

        new Thread(new Runnable() {
            @Override
            public void run() {
                try{
                    while (true){
                        if(lblText.getText().trim().length()==0)
                        text="Welcome";
                        else
                            text="";

                        Platform.runLater(new Runnable() {
                            @Override
                            public void run() {
                                lblText.setText(text);
                            }
                        });
                        Thread.sleep(200);
                    }
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        }).start();
    Scene scene=new Scene(pane,200,50);
    primaryStage.setTitle("Flash Text");
    primaryStage.setScene(scene);;
    primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
