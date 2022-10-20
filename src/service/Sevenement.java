/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;
import entite.evenement;
import java.awt.Event;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import utils.conexion;



import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author iheb
 */
public class Sevenement {
    private Connection cnx;
    private Statement stm;
    private PreparedStatement pst;
    private ResultSet rs;
    
 
public Sevenement() {
    cnx = conexion.getInstance().getcnx();
} 

 public List<evenement> afficherevenement() {
List<evenement> ch = new ArrayList();
    
        try {
        Statement stm =cnx.createStatement();
        String querry ="SELECT * FROM `evenement`";
     
        ResultSet rs= stm.executeQuery(querry);
        
        while(rs.next()){
            evenement e = new evenement();
            e.setIdEvent(rs.getInt(1));
            e.setIdUser(rs.getInt(2));
            e.setType(rs.getString(3));
            e.setDateEvent(rs.getString(4));
            e.setAdresse(rs.getString(5));
            
            ch.add(e);
        }
        
    } catch (SQLException ex) {
            System.out.println(ex.getMessage()); 
    
    }
   
        return ch;

    }
 
 
 public void ajoutevenement(evenement e) {
        
        try {
             String querry="INSERT INTO `evenement`(`idUser`, `type`,`dateEvent`,`adresse`) VALUES ('"+e.getIdUser()+"','"+e.getType()+"','"+e.getDateEvent()+"','"+e.getAdresse()+"')";
            Statement stm =cnx.createStatement();
        
        stm.executeUpdate(querry);
        System.out.println("Evénement ajouté");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage()); 
        }
        
    }
public void suppevenement(int idEvent) {
        try {
            String querry = "DELETE FROM `evenement` WHERE idEvent="+idEvent;
            Statement stm =cnx.createStatement();
            stm.executeUpdate(querry);
            System.out.println("Evenement supprimé ");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
}
        
public void modifevenement(evenement m) {
        try {
            String querry = "UPDATE `evenement` SET `idEvent`='" + m.getIdEvent() +"' , `idUser`='" + m.getIdUser()+ "' , `type`='" + m.getType() + "' , `dateEvent`='" + m.getDateEvent() + "', `adresse`='" + m.getAdresse() + "' WHERE idEvent=" + m.getIdEvent();
            Statement stm =cnx.createStatement();
            stm.executeUpdate(querry);
            System.out.println("L'evenemnet  est modifée !");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    
    
    
 }    

   

}

 
 
 
 
   
   
   

