/*
* TP3
* DamienGrebil
* Novembre 2024
 */
package tp3_heroic_fantasy_grebil;

/**
 *
 * @author damie
 */
public abstract class Personnages {
    String nom;
    int hp;

    public Personnages(String nom, int hp) {
        this.nom = nom;
        this.hp = hp;
    }

    @Override
    public String toString() {
        return "Personnages{" + "nom=" + nom + ", hp=" + hp + '}';
    }
    
    
}
