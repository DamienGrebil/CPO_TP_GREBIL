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
        Moussaka[] tableauMouss = new Moussaka[10];
        tableauMouss[1] = Moussaka(100);
        tableauMouss[2] = Moussaka(120);
        tableauMouss[3] = Moussaka(150);
        tableauMouss[4] = Moussaka(160);
        tableauMouss[5] = Moussaka(300);
        tableauMouss[6] = Moussaka(450);
        tableauMouss[7] = Moussaka(230);
        tableauMouss[8] = Moussaka(540);
        tableauMouss[9] = Moussaka(240);
        tableauMouss[10] = Moussaka(500);
    }
}
