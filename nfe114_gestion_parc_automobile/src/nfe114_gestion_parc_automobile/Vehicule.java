
package nfe114_gestion_parc_automobile;

import java.util.Arrays;

/**
 * Cours nfe114
 * @author khemp
 */

public class Vehicule {
    private Integer Prix;
    private String Marque;
    private String Modele;
    private String Couleur;
//Contructeur de la classe vehicule qui prend tout les attibuts du vehicule en entres
//Tous les parametres sont obligatoires
    Vehicule(String Marque,String Modele, String Couleur,Integer Prix)
    {
        //Verifier si ca couleur fait partie des couleurs autorisées
        String[] CouleurAutorise = new String[] {"Bleu","Rouge","Vert","Gris"};
        for (int i = 0; i < 3; i++){
            boolean CouleurOk=false;
            if (Couleur.equals(CouleurAutorise[i])){
                CouleurOk=true;
            }
            if (CouleurOk){
                throw new IllegalArgumentException("Couleur invalide " + Couleur);
            }
        }

        this.Marque = Marque;
        this.Modele=Modele;
        this.Couleur= Couleur;
        this.Prix= Prix;
    }


    //Fonction GetMarque, retourne la marque de la voiture (champ prive)
    public String GetMarque()
    {
        return this.Marque;
    }

    //Fonction GetPrix, retourne le prix de la voiture (champ prive)
    public Integer GetPrix()
    {
        return this.Prix;
    }

    //Fonction GetModele, retourne le model de la voiture (champ prive)
    public String GetModele()
    {
        return this.Modele;
    }

    //Fonction GetModele, retourne la couleur de la voiture (champ prive)
    public String GetCouleur()
    {
        return this.Couleur;
    }

}
