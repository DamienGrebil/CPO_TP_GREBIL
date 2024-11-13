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
public class Baton extends Arme{
    int age;

    public Baton(int age, String nom, int nivatt) {
        super(nom, nivatt);
        if (age < 100){
            this.age = age;
        }else{
            this.age = 0;
        }
    }
    
}
