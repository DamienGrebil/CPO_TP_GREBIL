/*
* TP3
* DamienGrebil
* Novembre 2024
 */
package Personnages;

import Personnages.Personnages;

/**
 *
 * @author damie
 */
public class Guerrier extends Personnages {
    Boolean Cheval;

    public Guerrier(Boolean Cheval, String nom, int hp) {
        super(nom, hp);
        this.Cheval = Cheval;
    }

    public void setCheval(Boolean Cheval) {
        this.Cheval = Cheval;
    }
    
    
    
}
