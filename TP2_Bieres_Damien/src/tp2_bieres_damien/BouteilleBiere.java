/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_bieres_damien;

/**
 *
 * @author damie
 */
public class BouteilleBiere {

    String nom;
    String degreAlcool;
    String brasserie;
    Boolean ouverte;
    
    public void lireEtiquette() {
        System.out.println("Bouteille de " + nom + " (" + degreAlcool+ " degres) \nBrasserie : " + brasserie);
    }
    
}
