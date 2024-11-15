/*
* TP3
* DamienGrebil
* Novembre 2024
 */
package tp3_heroic_fantasy_grebil;

import Personnages.Guerrier;
import Personnages.magicien;
import Personnages.Personnages;
import Armes.Epee;
import Armes.Arme;
import Armes.Baton;
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
    
        ArrayList<Arme> Armes = new ArrayList<>();
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
        
        magicien Gandalf = new magicien(true,"Gandalf",68);
        magicien Gar = new magicien(false,"Garcimore",44);    
        Guerrier Conan = new Guerrier(false,"Conan",78);
        Guerrier Lan = new Guerrier(true,"Lannister",45);
        
        
        ArrayList<Personnages> Personnages = new ArrayList<>();
        Personnages.add(Gandalf);
        Personnages.add(Gar);
        Personnages.add(Conan);
        Personnages.add(Lan);
        
        System.out.print("[");  
        for (int i = 0; i < Personnages.size(); i++) {
        System.out.print(Personnages.get(i));  if (i < Personnages.size() - 1) {
            System.out.print(", ");
        }
        System.out.print("]");
        }
        
        Gandalf.newArme(Chene);
        Gandalf.Equipe(0);
        Conan.newArme(Dur);
        Conan.newArme(Exca);
        Conan.Equipe(1);
        System.out.println("\n" + Conan);
    }
}


