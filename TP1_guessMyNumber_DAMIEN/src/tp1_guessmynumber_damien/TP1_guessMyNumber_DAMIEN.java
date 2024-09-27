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
        Random generateurAleat = new Random();
        int n = generateurAleat.nextInt(100);
         Scanner sc = new Scanner(System.in);
        System.out.println("Choississez une valeure entre 0 et 100");
        val = sc.nextInt();
    }
    
}
