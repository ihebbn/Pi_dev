/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestion_rh;

import entite.evenement;
import service.Sevenement;
import service.Sparticipation;

/**
 *
 * @author iheb
 */
public class Gestion_rh {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Sevenement e = new Sevenement();
          Sparticipation s = new Sparticipation();

   // evenement p = new evenement(2,"dinner","16/11/2022","les dents de la mer");
   //  e.ajoutevenement(p);

   //e.suppevenement(1);
  // e.modifevenement(2,3,"soirée","25/10/2022","toys room");

    //   s.modifparticipation(2,1,5);
    
    //e.ModifierEvent(2,3,"soirée","25/10/2022","toys room");
  System.out.println( e.afficherevenement().toString());

      
    }
    
}
