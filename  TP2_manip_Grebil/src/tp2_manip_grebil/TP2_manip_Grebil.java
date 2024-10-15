/*
* TP2 Manip
* DamienGrebil
* Octobre 2024
 */

package tp2_manip_grebil;

/**
 *
 * @author damie
 */
public class TP2_manip_Grebil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Tartiflette assiette1 = new Tartiflette(500) ; 
        Tartiflette assiette2 = new Tartiflette(600) ;
        Tartiflette assiette3 = assiette2;  // Assiette 2 et 3 referencent la meme tartiflette
        assiette2 = assiette1;
        assiette1 = assiette3;
        System.out.println("nb de calories de Assiette 2 : " + assiette2.nbCalories) ; 
        System.out.println("nb de calories de Assiette 3 : " + assiette3.nbCalories) ; 
    // Question six, non cela ne fonctionne pas car l'un ne peux pas etre convertit en l'autre.
        
    }
    
}
