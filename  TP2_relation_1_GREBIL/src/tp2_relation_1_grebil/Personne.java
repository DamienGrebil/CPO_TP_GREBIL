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
    Voiture[] liste_voiture;
    public Personne(String UnNom, String UnPrenom, Voiture[] Vagos){
        nom = UnNom;
        prenom = UnPrenom;
        liste_voiture = Vagos;
        
    }

    @Override
    public String toString() {
        return "Personne{" + "nom=" + nom + ", prenom=" + prenom + ", Vagos=" + liste_voiture + '}';
    }
        
}
