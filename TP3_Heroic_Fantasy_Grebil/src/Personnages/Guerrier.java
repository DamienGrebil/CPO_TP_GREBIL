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
    int nbguer=0;

    public Guerrier(Boolean Cheval, String nom, int hp) {
        super(nom, hp);
        this.Cheval = Cheval;
        nbguer ++ ;
    }

    public void setCheval(Boolean Cheval) {
        this.Cheval = Cheval;
    }
    
    
        @Override
    public void finalize() throws Throwable{
        nbguer -- ;
        super.finalize();
    }
    
    
}
