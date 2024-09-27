/*
* TP1 P3 GuessMyNumber
* DamienGrebil
* Septembre 2024
*/
package tp1_guessmynumber_damien;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author damie
 */
public class TP1_guessMyNumber_DAMIEN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int val;
        int compt=0;
        Random generateurAleat = new Random();
        int n = generateurAleat.nextInt(100);
        Scanner sc = new Scanner(System.in);
        System.out.println(n);
        System.out.println("Choississez une valeure entre 0 et 100");
        val = sc.nextInt();
        while (val != n) {
            compt += 1;
            if (val < n) {
                System.out.println("Trop petit ");
                System.out.println("Choississez une valeure entre 0 et 100");
                val = sc.nextInt();
            }else if (val > n) {
                System.out.println("Trop grand ");
                System.out.println("Choississez une valeure entre 0 et 100");
                val = sc.nextInt();
            }else if (val == n) {
                System.out.println("gagne, vous avez fait "+ compt+" essais");
            }
        }
    }
    
}
