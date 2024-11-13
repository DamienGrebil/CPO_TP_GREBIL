/*
* TP3
* DamienGrebil
* Novembre 2024
 */
package Armes;

import Armes.Arme;

/**
 *
 * @author damie
 */
public class Epee extends Arme{
    int finesse;

    public Epee(int finesse, String nom, int nivatt) {
        super(nom, nivatt);
        if (finesse < 100){
            this.finesse = finesse;    
        }else{
           this.finesse= 0; 
        }
        
        
    }

    @Override
    public String toString() {
        return "Epee{" + super.toString() + "finesse=" + finesse + '}';
    }
    
    
}
