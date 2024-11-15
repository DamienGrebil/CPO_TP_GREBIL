/*
* TP3
* DamienGrebil
* Novembre 2024
 */
package Personnages;

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
