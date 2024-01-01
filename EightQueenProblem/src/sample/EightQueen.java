package sample;

//--module-path "C:\JAVAFX\javafx-sdk-17.0.2\lib" --add-modules javafx.controls,javafx.fxml

import javafx.animation.Animation;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.image.Image;
import javafx.geometry.Insets;
import javafx.scene.layout.GridPane;

import java.util.Arrays;

public class EightQueen extends Application {
    public static final int SIZE=8;
    private int[] queens={-1,-1,-1,-1,-1,-1,-1,-1};
    @Override
    public void start(Stage primaryStage){
//        Arrays.fill(queens,-1);
        search();

        GridPane chessBoard=new GridPane();
        chessBoard.setAlignment(Pos.CENTER);
        chessBoard.setHgap(5);
        chessBoard.setVgap(5);
        chessBoard.setGridLinesVisible(false);
        Label[][] labels=new Label[SIZE][SIZE];
        for(int i=0;i<SIZE;i++)
            for(int j=0;j<SIZE;j++){
                chessBoard.add(labels[i][j]=new Label(),j,i);
                labels[i][j].setStyle("-fx-border-color:black");
                labels[i][j].setPrefSize(55,55);
            }
        Image image=new Image("D:\\JAVA_UDEMY\\EightQueenProblem\\src\\sample\\image\\queen.png");
            for(int i=0;i<SIZE;i++) {
                ImageView imageView=new ImageView(image);
                imageView.setFitWidth(55);
                imageView.setFitHeight(55);
                labels[i][queens[i]].setGraphic(imageView);
            }
        Scene scene=new Scene(chessBoard,55*SIZE+55,55*SIZE+55);
        primaryStage.setScene(scene);
        primaryStage.setTitle("EITHT QUEEN");
        primaryStage.setResizable(false);
        primaryStage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }

    private boolean search(){
        int k=0;
        while(k>=0 && k<SIZE){
            int j=findPosition(k);
            if(j<0){
                queens[k]=-1;
                k--;
            }
            else{
                queens[k]=j;
                k++;
            }
        }
        if(k==-1)
            return false;
        else
            return true;
    }


    public int findPosition(int k){
        int start=queens[k]+1;
        for(int j=start;j<SIZE;j++) {
            if (isValid(k, j))
                return j;
        }
            return -1;
        }
    public boolean isValid(int row,int column){
        for(int i=1;i<=row;i++)
            if(queens[row-i]==column || queens[row-i]==column-i || queens[row-i]==column+i)
                return false;
            return true;
    }
}
