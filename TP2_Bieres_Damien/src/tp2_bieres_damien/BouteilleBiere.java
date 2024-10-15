/*
* TP2 bieres
* DamienGrebil
* Octobre 2024
*/
package tp2_bieres_damien;

/**
 *
 * @author damie
 */
public class BouteilleBiere {

    String nom;
    double degreAlcool;
    String brasserie;
    boolean ouvert;
    public void lireEtiquette() { 
        System.out.println ("Bouteille de " + nom + " (" + degreAlcool+ " degres) \nBrasserie : " + brasserie);
    }
    
    public boolean Decapsuler() {
        if (ouvert==false){
        ouvert=true;
        }else{
            System.out.println ("erreur: la biere est deja ouverte");
        }
    return ouvert;
    }
    
    public BouteilleBiere(String unNom, double unDegre, String uneBrasserie) {
        nom = unNom;
        degreAlcool = unDegre;
        brasserie = uneBrasserie;
        ouvert = false;
    }
    
    @Override 
    public String toString() { 
        String chaine_a_retourner; 
        chaine_a_retourner = nom + " (" + degreAlcool + " degrés) Ouverte ? ";   
        if (ouvert == true ) chaine_a_retourner += "oui" ; 
        else chaine_a_retourner += "non" ; 
        return chaine_a_retourner ;  
}
}
