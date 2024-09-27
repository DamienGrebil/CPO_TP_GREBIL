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
        int compt = 1;
        int jeu;
        Random generateurAleat = new Random();
        int n = generateurAleat.nextInt(100);
        Scanner sc = new Scanner(System.in);
        System.out.println(n);
        System.out.println("Choississez le niveau de difficulte: \n1)facile \n2)normal \n3)difficile");
        jeu = sc.nextInt();
        System.out.println("Choississez une valeure entre 0 et 100");
        val = sc.nextInt();
        if (jeu == 1) {/*Mode facile*/
            while (val != n) {
                compt += 1;
                if (val < n) {
                    if (n - val > 10) {
                        System.out.println("Trop petit ");
                    }
                    if (n - val < 10) {
                        System.out.println("Trop petit mais pas loin ");
                    }
                    System.out.println("Choississez une valeure entre 0 et 100");
                    val = sc.nextInt();
                } else if (val > n) {
                    if (val - n > 10) {
                        System.out.println("Trop grand ");
                    }
                    if (val - n < 10) {
                        System.out.println("Trop grand mais pas loin ");
                    }
                    System.out.println("Choississez une valeure entre 0 et 100");
                    val = sc.nextInt();
                } else if (val == n) {
                    break;
                }
            }
            System.out.println("gagne, vous avez fait " + compt + " essais");
        }
        if (jeu == 2) {/*Mode normal*/
            while (val != n) {
                compt += 1;
                if (val < n) {
                    System.out.println("Trop petit ");
                    System.out.println("Choississez une valeure entre 0 et 100");
                    val = sc.nextInt();
                } else if (val > n) {
                    System.out.println("Trop grand ");
                    System.out.println("Choississez une valeure entre 0 et 100");
                    val = sc.nextInt();
                } else if (val == n) {
                    break;
                }
            }
            System.out.println("gagne, vous avez fait " + compt + " essais");
        }
        if (jeu == 3) {/*Mode difficile*/
            while (val != n) {
                compt += 1;
                if (compt < 7) {
                System.out.println("vous etes en mode difficile vous n'avez plus que 6 ESSAIS"); 
                    if (val < n) {
                        System.out.println("Trop petit ");
                        System.out.println("Choississez une valeure entre 0 et 100");
                        val = sc.nextInt();
                    } else if (val > n) {
                        System.out.println("Trop grand ");
                        System.out.println("Choississez une valeure entre 0 et 100");
                        val = sc.nextInt();
                    } else if (val == n) {
                        break;
                    }
                } else {
                    System.out.println("C'est perdu, vous navez plus de vies!!");
                    break;
                }
            }
            if(compt<7){
                System.out.println("gagne, vous avez fait " + compt + " essais");
            }
        }
    }
}
