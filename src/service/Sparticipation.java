/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;
import entite.evenement;
import entite.participation;
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
public class Sparticipation {
    private Connection cnx;
    private Statement stm;
    private PreparedStatement pst;
    private ResultSet rs;
    
 
public Sparticipation() {
    cnx = conexion.getInstance().getcnx();
}  
public List<participation> afficherparticipation() {
List<participation> ch = new ArrayList();
    
        try {
        Statement stm =cnx.createStatement();
        String querry ="SELECT * FROM `participation`";
     
        ResultSet rs= stm.executeQuery(querry);
        
        while(rs.next()){
            participation p = new participation();
            p.setIdEvent(rs.getInt(1));
            p.setIdParticipation(rs.getInt(2));
            p.setIdUser(rs.getInt(3));
            
            ch.add(p);
        }
        
    } catch (SQLException ex) {
            System.out.println(ex.getMessage()); 
    
    }
   
        return ch;
}
public void ajoutparticipation(participation p) {
        
        try {
             String querry="INSERT INTO `participation`(`idEvent`, `idParticipation`, `idUser`) VALUES ('"+p.getIdEvent()+"','"+p.getIdParticipation()+"','"+p.getIdUser()+"')";
            Statement stm =cnx.createStatement();
        
        stm.executeUpdate(querry);
        System.out.println("Participation ajoutée");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage()); 
        }
    }
public void suppparticipation(int idParticipation) {
        try {
            String querry = "DELETE FROM `Participation` WHERE idParticipation="+idParticipation;
            Statement stm =cnx.createStatement();
            stm.executeUpdate(querry);
            System.out.println("Participation supprimé");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    
    }


    
public void modifparticipation(participation m) {
        try {
            String querry = "UPDATE `participation` SET `idEvent`='" + m.getIdEvent() +"' , `idParticipation`='" + m.getIdParticipation()+ "' , `idUser`='" + m.getIdUser() + "' WHERE idParticipation=" + m.getIdParticipation();
            Statement stm =cnx.createStatement();
            stm.executeUpdate(querry);
            System.out.println("La participation est modifée !");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    
    
    
 }    
}