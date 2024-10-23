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
    Personne proprietaire;
    public Voiture(String LeModele,String LaMarque,int LaPuissanceCV, Personne Proprio){
        Modele = LeModele;
        Marque = LaMarque;
        PuissanceCV = LaPuissanceCV;
        proprietaire = Proprio;
    }

    @Override
    public String toString() {
        return "Voiture{" + "Modele=" + Modele + ", Marque=" + Marque + ", PuissanceCV=" + PuissanceCV + ", Proprio=" + proprietaire + '}';
    }
    
}
