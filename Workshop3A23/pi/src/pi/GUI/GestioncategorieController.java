/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pi.GUI;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author octanet
 */
public class GestioncategorieController implements Initializable {

    @FXML
    private TextField idInput;
    @FXML
    private TextField nomInput;
    @FXML
    private TextField descriptionInput;
    @FXML
    private TableView<?> tableoeuvre;
    @FXML
    private TableColumn<?, ?> idColumn;
    @FXML
    private TableColumn<?, ?> nomColumn;
    @FXML
    private TableColumn<?, ?> descriptionColumn;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void ajouterOeuvre(ActionEvent event) {
    }

    @FXML
    private void afficherOeuvre(ActionEvent event) {
    }

    @FXML
    private void supprimerOeuvre(ActionEvent event) {
    }

    @FXML
    private void modifierOeuvre(ActionEvent event) {
    }
    
}
