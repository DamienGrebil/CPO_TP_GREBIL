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
public class magicien extends Personnages{
    Boolean Confirmé;
    int nbmag= 0 ;

    public magicien(Boolean Confirmé, String nom, int hp) {
        super(nom, hp);
        this.Confirmé = Confirmé;
        nbmag ++;
    }

    public void setConfirmé(Boolean Confirmé) {
        this.Confirmé = Confirmé;
    }
    
        @Override
    public void finalize() throws Throwable{
        nbmag -- ;
        super.finalize();
    }
}
