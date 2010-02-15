package nfe114_gestion_parc_automobile;

//import java.sql.Connection;         // Gestion de la connection a une BD
//import java.sql.DriverManager;      //Librairy qui permet la chargement des drivers de connection aux bases sql
//import java.sql.Statement;          //Gestion des transfert de donnée des requetes SQL
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author khemp
 */
public class VehiculeFactory {

    private static String driver ="org.apache.derby.jdbc.ClientDriver";
    private static String url ="jdbc:derby://localhost:1527/Application";
    private static String login ="nfe114";
    private static String password = "nfe114";



    public static Boolean NouveauVehicule(String Marque,String Modele, Integer Prix,String Couleur) throws Exception  {
        Class.forName("org.apache.derby.jdbc.ClientDriver");
        // definition de la connection a la base derby sur un URL local
        Connection MaConnectionDerby = DriverManager.getConnection("jdbc:derby://localhost:1527/Application", "nfe114", "nfe114");
        // ouvrir une connection a la base de donnée JavaDB
        Statement MonStatement = MaConnectionDerby.createStatement();
        // requete pour ajouter une nouveau vehicule dans la base de donnée
        Boolean RsultatRequete = MonStatement.execute("insert into NFE114.VEHICULE (Marque, Modele,Prix, Couleur)  values ('" + Marque + "','" + Modele + "'," + Prix + ",'" + Couleur + "')");
        // Fermer la connection a la base de donnée JavaDB
        MaConnectionDerby.close();
        return RsultatRequete;
    }



    public static List<Vehicule> rechercherVehiculeParMarque(String marque) throws Exception {

        Class.forName(driver);
        Connection conn = DriverManager.getConnection(url, login, password);
        Statement st = conn.createStatement();
        String sql = "select * from NFE114.VEHICULE where Marque like '%"+marque+"%'";
        ResultSet result =
                st.executeQuery(sql);
        if(result == null)
            return null;
        List<Vehicule> vehicules = new ArrayList<Vehicule>();
        while (result.next()) {
            String modele = result.getString("Modele");
            Integer prix = result.getInt("Prix");
            String couleur = result.getString("Couleur");
            marque = result.getString("Marque");
            Vehicule v = new Vehicule(marque, modele, prix, couleur);
            vehicules.add(v);
        }
        conn.close();
        return vehicules;
    }




}
