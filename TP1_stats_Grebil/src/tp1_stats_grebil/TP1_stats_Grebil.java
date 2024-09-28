/*
* TP1 stats
* DamienGrebil
* Septembre 2024
*/
package tp1_stats_grebil;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author damie
 */
public class TP1_stats_Grebil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] facesDes = new int[6];
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrez le nombre de lancers de dés : ");
        int m = sc.nextInt();
        Random rand = new Random();
        for (int i = 0; i < m; i++) {
            int lancer = rand.nextInt(6); // Génère un nombre aléatoire entre 0 et 5
            facesDes[lancer]++; // Incrémente la face correspondante
        }
        System.out.println("Résultats des lancers de dés :");
        for (int i = 0; i < facesDes.length; i++) {
            System.out.println("Face " + (i + 1) + " : " + facesDes[i] + " fois");
        }
        System.out.println("\nRésultats en pourcentages :");
        for (int i = 0; i < facesDes.length; i++) {
            double pourcentage = ((double) facesDes[i] / m) * 100;
            System.out.printf("Face %d : %.2f%%\n", (i + 1), pourcentage);
        }
    }
}


