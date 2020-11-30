/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package saio.pkginterface;


import javafx.application.Application;
import javafx.scene.Parent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

/**
 *
 * @author rizwan
 */
public class SAIOInterface extends Application {
    public static Stage mainstage;
   @Override
public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("FXML.fxml"));
        Scene scene = new Scene(root);
        mainstage=stage;
        mainstage.setScene(scene);
        mainstage.show();
        SAIOInterface.mainstage.setTitle("SAIO Interface");
        mainstage.setResizable(false);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}