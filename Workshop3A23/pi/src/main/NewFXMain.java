/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.io.IOException;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import pi.Entities.Etat;
import pi.Entities.Oeuvre;
import pi.Services.ServiceOeuvre;

/**
 *
 * @author octanet
 */
public class NewFXMain extends Application {
    
    @Override
    
    public void start(Stage primaryStage) {
      try {
                  // je veux aff une interface graphique donc c pourquoi on met FXLOADER et on recupére le url avec la methode getclass bech norbtouh bil GUI
        
           Parent root=FXMLLoader.load(getClass().getResource("../pi/GUI/Ajouteroeuvre.fxml"));
            Scene scene = new Scene(root);
            primaryStage.setTitle("ARTEC");
            primaryStage.setScene(scene); // le contenu
            primaryStage.show();  
            
        } catch (IOException ex) {
            System.out.println("Err"+ex.getMessage());
        }
       
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
            launch(args);
    }
    
}
