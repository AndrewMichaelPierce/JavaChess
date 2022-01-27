package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        //Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        FXMLLoader loader = new FXMLLoader(getClass().getResource("sample.fxml"));
        Parent root = loader.load();
        primaryStage.setTitle("Chess.Java");
        primaryStage.setScene(new Scene(root, 1200, 800));
        root.setStyle("-fx-font-family: 'Times New Roman'");
        primaryStage.show();
        Controller myController = loader.getController();
        myController.Controller();

        /*
        long startTime = System.currentTimeMillis();
        long endTime = System.currentTimeMillis();
        System.out.println("\nThe number of processors is " + Runtime.getRuntime().availableProcessors());
        System.out.println("Time elapsed: " + (endTime - startTime) + " milliseconds.");
         */

    }


    public static void main(String[] args) {
        launch(args);
    }
}
