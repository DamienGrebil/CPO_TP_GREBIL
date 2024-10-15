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
        Tartiflette assiette3 = assiette2 ;  // Assiette 2 et 3 referencent la meme tartiflette
        System.out.println(assiette2);
        System.out.println(calorie);
    }
    
}
