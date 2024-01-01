package com.example._static;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application{

   @Override
    public void start(Stage primaryStage){
       primaryStage.setResizable(false);
    primaryStage.setTitle("Hello world");
    primaryStage.show();
   }

    public static void main(String[] args) {
        Application.launch(args);
    }
}
