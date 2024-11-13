/*
* TP3
* DamienGrebil
* Novembre 2024
 */
package tp3_heroic_fantasy_grebil;

import java.util.ArrayList;

/**
 *
 * @author damie
 */
public class TP3_Heroic_Fantasy_Grebil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Epee Exca = new Epee(7,"Exalibur",5);
        Epee Dur = new Epee(4,"Durandal",7);    
        Baton Chene = new Baton(4,"Chêne",5);
        Baton Charme = new Baton(5,"Charme",6);
    
        ArrayList<Arme> Armes = new ArrayList<Arme>();
        Armes.add(Exca);
        Armes.add(Dur);
        Armes.add(Chene);
        Armes.add(Charme);
        
        System.out.print("[");  
        for (int i = 0; i < Armes.size(); i++) {
        System.out.print(Armes.get(i));  if (i < Armes.size() - 1) {
            System.out.print(", ");
        }
        System.out.print("]");
        
        
        
        }
    }
}


