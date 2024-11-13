/*
* TP3
* DamienGrebil
* Novembre 2024
 */
package Armes;

/**
 *
 * @author damie
 */
public abstract class Arme {
    String nom;
    int nivatt;

    public Arme(String nom, int nivatt) {
        this.nom = nom;
        if ( nivatt <= 100){
            this.nivatt = nivatt;
        }else{
            this.nivatt = 0;
        }
    }

    @Override
    public String toString() {
        return "Arme{" + "nom=" + nom + ", nivatt=" + nivatt + '}';
    }
    
}
