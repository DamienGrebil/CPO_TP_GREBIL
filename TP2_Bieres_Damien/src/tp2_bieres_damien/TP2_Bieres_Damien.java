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
        BouteilleBiere uneBiere = new BouteilleBiere("Cuvee des trolls",7.0,"Dubuisson") ; 
        uneBiere.lireEtiquette();
        BouteilleBiere secondeBiere = new BouteilleBiere("Leffe",6.6," Abbaye de Leffe") ;
        secondeBiere.lireEtiquette();
        BouteilleBiere troisiemeBiere = new BouteilleBiere("MegaDemon", 16.0,"Mort") ;
        troisiemeBiere.lireEtiquette();
        troisiemeBiere.Decapsuler();
    }
}
