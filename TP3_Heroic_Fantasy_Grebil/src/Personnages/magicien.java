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

    public magicien(Boolean Confirmé, String nom, int hp) {
        super(nom, hp);
        this.Confirmé = Confirmé;
    }

    public void setConfirmé(Boolean Confirmé) {
        this.Confirmé = Confirmé;
    }
    
    
}
