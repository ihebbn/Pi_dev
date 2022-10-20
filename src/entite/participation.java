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
public class participation {
    private int idEvent;
    private int idParticipation;
    private int idUser;

    public participation() {
    }

    public participation(int idEvent, int idParticipation, int idUser) {
        this.idEvent = idEvent;
        this.idParticipation = idParticipation;
        this.idUser = idUser;
    }

    public participation(int idEvent, int idUser) {
        this.idEvent = idEvent;
        this.idUser = idUser;
    }

    public int getIdEvent() {
        return idEvent;
    }

    public void setIdEvent(int idEvent) {
        this.idEvent = idEvent;
    }

    public int getIdParticipation() {
        return idParticipation;
    }

    public void setIdParticipation(int idParticipation) {
        this.idParticipation = idParticipation;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    @Override
    public String toString() {
        return "participation{" + "idEvent=" + idEvent + ", idParticipation=" + idParticipation + ", idUser=" + idUser + '}';
    }
    
    
    
}



