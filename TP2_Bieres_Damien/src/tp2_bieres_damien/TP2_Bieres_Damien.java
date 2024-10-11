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
public class TP2_Bieres_Damien {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BouteilleBiere uneBiere = new BouteilleBiere() ;
        uneBiere.nom = "Cuvee des trolls"; 
        uneBiere.degreAlcool = 7.0 ; 
        uneBiere.brasserie = "Dubuisson"; 
        uneBiere.ouverte = false ; 
        uneBiere.lireEtiquette();
        uneBiere.nom = "Leffe"; 
        uneBiere.degreAlcool = 6.6 ; 
        uneBiere.brasserie = " Abbaye de Leffe"; 
        uneBiere.lireEtiquette();
    }
}
