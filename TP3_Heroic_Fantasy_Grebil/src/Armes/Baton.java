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

    @Override
    public String toString() {
        return "Baton{"+ super.toString() + "age=" + age + '}';
    }
    
}
