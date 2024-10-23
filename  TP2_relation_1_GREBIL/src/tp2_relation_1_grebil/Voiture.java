/*
* TP2 relation 1
* DamienGrebil
* Octobre 2024
 */
package tp2_relation_1_grebil;

/**
 *
 * @author damie
 */
public class Voiture {
    String Modele;
    String Marque;
    int PuissanceCV;
    public Voiture(String LeModele,String LaMarque,int LaPuissanceCV){
        Modele = LeModele;
        Marque = LaMarque;
        PuissanceCV = LaPuissanceCV;
    }

    @Override
    public String toString() {
        return "Voiture{" + "Modele=" + Modele + ", Marque=" + Marque + ", PuissanceCV=" + PuissanceCV + '}';
    }
    
}
