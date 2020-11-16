package warehouseApp;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.*;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;


public class Main extends Application {

    static MyList<Floor> floorList = new MyList<>();

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("warehouseApp.fxml"));
        primaryStage.setTitle("Warehouse Application");
        primaryStage.setScene(new Scene(root, 600, 450));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}