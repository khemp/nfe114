package nfe114_gestion_parc_automobile;

//import java.sql.Connection;         // Gestion de la connection a une BD
//import java.sql.DriverManager;      //Librairy qui permet la chargement des drivers de connection aux bases sql
//import java.sql.Statement;          //Gestion des transfert de donnée des requetes SQL
import java.sql.*;
/**
 *
 * @author khemp
 */
public class VehiculeFactory {
    public static Boolean NouveauVehicule(String Marque,String Modele, Integer Prix,String Couleur) throws Exception  {
        Class.forName("org.apache.derby.jdbc.ClientDriver");
        // definition de la connection a la base derby sur un URL local
        Connection MaConnectionDerby = DriverManager.getConnection("jdbc:derby://localhost:1527/Application_nfe114", "nfe114", "nfe114");
        // ouvrir une connection a la base de donnée JavaDB
        Statement MonStatement = MaConnectionDerby.createStatement();
        // requete pour ajouter une nouveau vehicule dans la base de donnée
        Boolean RsultatRequete = MonStatement.execute("insert into NFE114.VEHICULE (Marque, Modele,Prix, Couleur)  values ('" + Marque + "','" + Modele + "'," + Prix + ",'" + Couleur + "')");
        // Fermer la connection a la base de donnée JavaDB
        MaConnectionDerby.close();
        return RsultatRequete;
    }
}
