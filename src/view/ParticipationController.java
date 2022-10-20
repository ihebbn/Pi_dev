/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import entite.participation;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import service.Sparticipation;

/**
 * FXML Controller class
 *
 * @author iheb
 */
public class ParticipationController implements Initializable {

    @FXML
    private TextField ide;
    @FXML
    private TextField idp;
    @FXML
    private TextField idu;
    @FXML
    private Button ajtp;
    @FXML
    private Button modp;
    @FXML
    private Button supp;
    @FXML
    private TableView<participation> affiche;
    @FXML
    private TableColumn<participation, String> iduu;
    @FXML
    private TableColumn<participation, String> idee;
    @FXML
    private TableColumn<participation, String> idpp;
    @FXML
    private Label lisp;
    @FXML
    private Button affp;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
     /*   
        Sparticipation us = new Sparticipation();
       
        List<participation> l = new ArrayList<>();
       
        l = (ArrayList<participation>) us.afficherparticipation();
        ObservableList<participation> data = FXCollections.observableArrayList(l);
        FilteredList<participation> fle = new FilteredList(data, e -> true);
        idee.setCellValueFactory(new PropertyValueFactory<>("idee"));
        idpp.setCellValueFactory(new PropertyValueFactory<>("idpp"));
        iduu.setCellValueFactory(new PropertyValueFactory<>("iduu"));
     
        affiche.setItems(fle);
        int nbe=affiche.getItems().size();
        */
        
        
    }   
    
    @FXML
    private void ajouter(ActionEvent event)throws Exception {
          
        

  
     Sparticipation sa = new Sparticipation() ;   
      StringBuilder errors=new StringBuilder();
        
         if(idu.getText().trim().isEmpty()&&ide.getText().trim().isEmpty()&&idp.getText().trim().isEmpty()){
            errors.append("svp enter un id user et id evenement et id participant\n");
        }
     
     if(errors.length()>0){
            Alert alert=new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Erreur");
            alert.setContentText(errors.toString());
            alert.showAndWait();
        }
       participation a = new participation(Integer.parseInt(ide.getText()),Integer.parseInt(idp.getText()),Integer.parseInt(idu.getText()));
        
            
        sa.ajoutparticipation(a);
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Success");
            alert.setContentText("participation est ajoutée avec succès!");
            alert.show();
            idu.setText("");
            ide.setText("");
            idp.setText("");
        
  
    }

    @FXML
    private void modifier(ActionEvent event) {
    }

    @FXML
    private void suprimer(ActionEvent event) {
     Sparticipation sa = new Sparticipation() ;   

            

      StringBuilder errors=new StringBuilder();
        
        if(idp.getText().trim().isEmpty()){
            errors.append("svp enter un id\n");
        }
     
     if(errors.length()>0){
            Alert alert=new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Erreur");
            alert.setContentText(errors.toString());
            alert.showAndWait();
        }
     
                   sa.suppparticipation(Integer.parseInt(idp.getText()));

      Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Success");
            alert.setContentText("participation est supprimée avec succès!");
            alert.show();
           
    }

    @FXML
     
    private void afficher(ActionEvent event) throws IOException {
                 Sparticipation sa = new Sparticipation() ;   
        
            lisp.setText(sa.afficherparticipation().toString());

   
    }
    
}
