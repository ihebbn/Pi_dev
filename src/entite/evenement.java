/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entite;

/**
 *
 * @author iheb
 */
public class evenement {
    private int idEvent;
    private int idUser;
    private String type;
    private String dateEvent;
    private String adresse;

    public evenement() {
    }

    public evenement(int idEvent, int idUser, String type, String dateEvent, String adresse) {
        this.idEvent = idEvent;
        this.idUser = idUser;
        this.type = type;
        this.dateEvent = dateEvent;
        this.adresse = adresse;
    }

    public evenement(int idUser, String type, String dateEvent, String adresse) {
        this.idUser = idUser;
        this.type = type;
        this.dateEvent = dateEvent;
        this.adresse = adresse;
    }
    

    public int getIdEvent() {
        return idEvent;
    }

    public void setIdEvent(int idEvent) {
        this.idEvent = idEvent;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDateEvent() {
        return dateEvent;
    }

    public void setDateEvent(String dateEvent) {
        this.dateEvent = dateEvent;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    @Override
    public String toString() {
        return "evenement{" + "idEvent=" + idEvent + ", idUser=" + idUser + ", type=" + type + ", dateEvent=" + dateEvent + ", adresse=" + adresse + '}';
    }
    
    
}
