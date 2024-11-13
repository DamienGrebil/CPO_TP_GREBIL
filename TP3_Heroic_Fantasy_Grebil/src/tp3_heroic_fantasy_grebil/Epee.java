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
    
    
}
