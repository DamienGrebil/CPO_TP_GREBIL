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
        int m;
        int [] tab =new int [6];
        Scanner sc = new Scanner(System.in);
        System.out.println("saississez un nombre entier");
        m = sc.nextInt();
        for (int i=0;i<m;i++){
            Random generateurAleat = new Random();
            tab[i] = generateurAleat.nextInt(6);
            System.out.print(tab[i]+" ");
        }
        
    }
    
}
