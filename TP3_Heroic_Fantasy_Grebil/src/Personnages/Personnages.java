/*
* TP3
* DamienGrebil
* Novembre 2024
 */
package Personnages;

import Armes.Arme;
import java.util.ArrayList;

/**
 *
 * @author damie
 */
public abstract class Personnages {
    String nom;
    int hp;
    int nbperso= 0;
    ArrayList<Arme> Sacados = new ArrayList<>();
    Arme arme_en_main = null;
    

    public Personnages(String nom, int hp) {
        this.nom = nom;
        this.hp = hp;
        nbperso ++ ;
    }

    @Override
    public String toString() {
        return "Personnages{" + "nom=" + nom + ", hp=" + hp + "arme equipe=" + arme_en_main +'}';
    }
    
    public  void newArme(Arme a){
        if ( Sacados.size()  <= 5){
            Sacados.add(a);
        }
    }

    public Arme getArme_en_main() {
        return arme_en_main;
    }
    
    public void Equipe(int x){
        if ( x <= Sacados.size()-1){
            arme_en_main = Sacados.get(x);
        System.out.print("nouvelle arme équipé");
        }
    }
    
    @Override
    public void finalize() throws Throwable{
        nbperso -- ;
        super.finalize();
    }
}
