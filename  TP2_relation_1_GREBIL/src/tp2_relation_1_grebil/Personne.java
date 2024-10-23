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
    public Personne(String UnNom, String UnPrenom){
        nom = UnNom;
        prenom = UnPrenom;
    }

    @Override
    public String toString() {
        return "Personne{" + "nom=" + nom + ", prenom=" + prenom + '}';
    }
        
}
