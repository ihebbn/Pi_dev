/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import entite.evenement;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import service.Sevenement;

/**
 * FXML Controller class
 *
 * @author iheb
 */
public class EvnementController implements Initializable {

    @FXML
    private Button ajte;
    @FXML
    private TextField idu;
    @FXML
    private TextField type;
    @FXML
    private TextField dt;
    @FXML
    private TextField adr;
    @FXML
    private Button supe;
    @FXML
    private TextField ide;
    @FXML
    private Button affe;
    @FXML
    private Label liste;
    @FXML
    private Button pr;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void ajouter(ActionEvent event)throws Exception {
          
        

  
     Sevenement sa = new Sevenement() ;   
      StringBuilder errors=new StringBuilder();
        
         if(type.getText().trim().isEmpty()&&adr.getText().trim().isEmpty()&&adr.getText().trim().isEmpty()){
            errors.append("svp enter un type et adresse et date\n");
        }
     
     if(errors.length()>0){
            Alert alert=new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Erreur");
            alert.setContentText(errors.toString());
            alert.showAndWait();
        }
       evenement a = new evenement(Integer.parseInt(idu.getText()),type.getText(),dt.getText(),adr.getText());
        
            
        sa.ajoutevenement(a);
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Success");
            alert.setContentText("événement est ajouté avec succès!");
            alert.show();
            idu.setText("");
            type.setText("");
            dt.setText("");
        
  
    }


    @FXML
    private void supprimer(ActionEvent event) {
        
    Sevenement sa = new Sevenement() ;   

            

      StringBuilder errors=new StringBuilder();
        
        if(ide.getText().trim().isEmpty()){
            errors.append("svp enter un id\n");
        }
     
     if(errors.length()>0){
            Alert alert=new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Erreur");
            alert.setContentText(errors.toString());
            alert.showAndWait();
        }
     
                   sa.suppevenement(Integer.parseInt(ide.getText()));

      Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Success");
            alert.setContentText("événement est supprimé avec succès!");
            alert.show();
           
    }

    @FXML
    private void afficher(ActionEvent event) throws IOException {
                 Sevenement sa = new Sevenement() ;   
        
            liste.setText(sa.afficherevenement().toString());

   
    }

    @FXML
    private void nextp(ActionEvent event)  throws IOException{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/participation.fxml"));
                Parent root = loader.load();
               ParticipationController aa = loader.getController();
                pr.getScene().setRoot(root);
    }
    }
    

