package com.company;
//--module-path "C:\JAVAFX\javafx-sdk-17.0.2\lib" --add-modules javafx.controls,javafx.fxml
import java.sql.*;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class FindGrade extends Application{
    private Statement stmt;
    private TextField tfSSN=new TextField();
    private TextField tfCourseId=new TextField();
    private Label lblStatus=new Label();
    @Override
    public void start(Stage primaryStage){
        initilizeDB();
        Button btShowGrade=new Button("Show Grade");
        HBox hBox=new HBox(5);
        hBox.getChildren().addAll(new Label("SSN"),tfSSN,new Label("Course Id"),tfCourseId,btShowGrade);
        VBox vBox=new VBox(10);
        vBox.getChildren().addAll(hBox,lblStatus);
        tfSSN.setPrefColumnCount(6);
        tfCourseId.setPrefColumnCount(6);
        btShowGrade.setOnAction(e->showGrade());

        Scene scene=new Scene(vBox,420,80);
        primaryStage.setTitle("Show Grade");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args){
        Application.launch(args);
    }
    private void initilizeDB(){
    try{
        Connection connection=DriverManager.getConnection("jdbc:mysql://localhost/javabook","scott","tiger");
        System.out.println("Database connected");
        stmt=connection.createStatement();
    }catch (Exception ex){ex.printStackTrace();}
    }

    private void showGrade(){
        String ssn=tfSSN.getText();
        String courseId=tfCourseId.getText();
        try{
            String queryString="select firstname,mi,lastname,title,grade from Student,Enrollment,Course "+
                " where Student.ssn='"+ssn+"' and Enrollment.courseid=Course.courseid"+
                " and Enrollment.ssn=Student.ssn";
        ResultSet resultSet=stmt.executeQuery(queryString);
        if(resultSet.next()){
            String lastName=resultSet.getString(1);
            String mi=resultSet.getString(2);
            String firstName=resultSet.getString(3);
            String title=resultSet.getString(4);
            String grade=resultSet.getString(5);
            lblStatus.setText(firstName+" "+mi+" "+lastName+"'s grade on course "+title+" is "+grade);
        }else {
            lblStatus.setText("not found");
        }
        }catch (SQLException ex){
            ex.printStackTrace();
        }
    }
}
