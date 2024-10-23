/*
* TP2 Relation 1
* DamienGrebil
* Octobre 2024
 */
package tp2_relation_1_grebil;

/**
 *
 * @author damie
 */
public class Personne {
    String nom;
    String prenom;
    int nb_Voitures;
    Voiture[] liste_voitures;
    public Personne(String UnNom, String UnPrenom, Voiture[] Vagos){
        nom = UnNom;
        prenom = UnPrenom;
        liste_voitures = new Voiture[3];
        nb_Voitures= 0;
    }

    @Override
    public String toString() {
        return "Personne{" + "nom=" + nom + ", prenom=" + prenom + '}';
    }
        
}
