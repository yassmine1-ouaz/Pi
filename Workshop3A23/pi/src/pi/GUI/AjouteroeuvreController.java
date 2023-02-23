/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pi.GUI;
import java.sql.Connection;
import java.net.URL;
import java.security.Provider;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

import pi.Entities.Etat;
import pi.Entities.Oeuvre;
import pi.Services.ServiceOeuvre;
import pi.Utils.MyDB;

/**
 * FXML Controller class
 *
 * @author octanet
 */

public class AjouteroeuvreController implements Initializable {
    

    ObservableList<String> etatList = FXCollections.observableArrayList("En_prét", "Nondisponible", "Enstock_Dispo"); // teba3 l'enum d'etat
     
    @FXML 
    ChoiceBox etatInput; // 1ere etape 
    // TEXT INPUT 
    @FXML
    private TextField nomInput;
    @FXML
    private TextField prixInput;
    @FXML
    private TextField titreInput;
    @FXML
    private TextField id_catInput;
    
     //private Etat Etat ;

    
    ServiceOeuvre s = new ServiceOeuvre();  // on va créer un nouv constr et aussi il faut importer le service au m temps !! bech najmou n' applique les methodes CRUD
    
    //TABLE
    @FXML
    private TableView<Oeuvre> tableoeuvre;
     
    @FXML
    private TableColumn<Oeuvre, Integer> Id;
    @FXML
    private TableColumn<Oeuvre, String> titre_oeuvre; 
    @FXML
    private TableColumn<Oeuvre, String> artiste;
    @FXML
    private TableColumn<Oeuvre, String> prix_oeuvre;
    @FXML
    private TableColumn<Oeuvre, Integer> Id_cat_oeuv;
    @FXML
     private TableColumn<Oeuvre, Etat> Etat;
   // private ServiceOeuvre ServiceOeuvre;
    
   // ObservableList<Oeuvre> listO;
     //Connextion cnx = null;

      ObservableList<Oeuvre>  oList = FXCollections.observableArrayList ();
    
   

    public void initialize() {
         // etatInput.setItems(etatList);
         // Etatfield.setValue("Nondisponible");
          //etatfield.setEtat(Etat.Enstock_Dispo);
         
    }  

    
    //BUTTON AJOUTER
    @FXML
    private void ajouterOeuvre(ActionEvent event) {
       Oeuvre o = new  Oeuvre();
         
         //o.setAge(Integer.parseInt(getText())); // puisque houwa entier donc ybadlou l texte filed string
           o.setId(Integer.parseInt(Id.getText()));
          o.setTitre_oeuvre(titreInput.getText());
          o.setArtiste(nomInput.getText());
          o.setPrix_oeuvre(prixInput.getText());
          o.setId_cat_oeuv(Integer.parseInt(id_catInput.getText()));
        //  o.setEtat1(Etat.valueOf(Etat.getValue().toString()));

          // o.setEtat(Etat.valueOf(etatInput.getText()));
           //  o.setEtat(Etat.Enstock_Dispo); // hethy ila tikhdem mouch f choicebox
           
          etatInput.setItems(etatList);
          etatInput.setValue("Nondisponible");
          s.add(o);
           
            ObservableList<Oeuvre>  oeuvres =  tableoeuvre.getItems();
            oeuvres.add(o);
            tableoeuvre.setItems(oList);
            
            // Vérifier que tous les champs sont remplis
           if (nomInput.getText().isEmpty() || prixInput.getText().isEmpty() || 
                   titreInput.getText().isEmpty() || id_catInput.getText().isEmpty() || etatInput.getValue() == null) {
               // Afficher un message d'erreur
               Alert alert = new Alert(AlertType.ERROR);
               alert.setTitle("Erreur");
               alert.setHeaderText(null);
               alert.setContentText("Veuillez remplir tous les champs");
               alert.showAndWait();
               return;
           }
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
         //To change body of generated methods, choose Tools | Templates.
    }

    
    
    //// AFFICHER OEUVRE
   @FXML
   private void afficherOeuvre(ActionEvent event) {
       
     ObservableList<Oeuvre>  Oeuvre =  tableoeuvre.getItems();
     
         Id.setCellValueFactory(new PropertyValueFactory<Oeuvre , Integer> ("Id"));
         titre_oeuvre.setCellValueFactory(new PropertyValueFactory<Oeuvre , String> ("titre_oeuvre"));
         artiste.setCellValueFactory(new PropertyValueFactory<Oeuvre , String> ("artiste"));
         prix_oeuvre.setCellValueFactory(new PropertyValueFactory<Oeuvre , String> ("prix_oeuvre"));
         Id_cat_oeuv.setCellValueFactory(new PropertyValueFactory<Oeuvre , Integer> ("Id_cat_oeuv"));
         Etat.setCellValueFactory(new PropertyValueFactory<Oeuvre , Etat> ("Etat1"));
         
        System.out.println(s.afficher());
        
    //   tableoeuvre.setItems(oList);
   }

   //SUPPRIMER OEUVRE
    @FXML
    private void supprimerOeuvre(ActionEvent event) {
    }

    
    
    //MODIFIER OEUVRE
    @FXML
    private void modifierOeuvre(ActionEvent event) {
        
    }

    
    
}
