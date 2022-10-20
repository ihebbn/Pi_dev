package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author iheb
 */
public class conexion {
    
    public  String url="jdbc:mysql://localhost:3306/gestionrh";
    public String login="root";
    public  String pwd="";
    private static Connection connexion;
    public static conexion instance;
    
    private conexion(){
        try {
            connexion =DriverManager.getConnection(url, login, pwd);
            if(connexion!=null){
                System.out.println("Cnx etablie ...");
            }
            
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            System.out.println("ERREUR");
            
        }
    }
    
    
    public Connection getcnx (){
        return connexion;
    }
    public static conexion getInstance(){
        if(instance== null){
            instance = new conexion();
        }
        return instance;
    }

    
    
    
    
}
