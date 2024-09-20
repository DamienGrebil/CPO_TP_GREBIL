/*
 * TP0 P3 Calculator
 * DamienGrebil
 * Septembre 2024
 */
package p3.exo1;

import java.util.Scanner;

/**
 *
 * @author damie
 */
public class P3Exo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int operateur ;
        int operante1; 
        int operante2;
        int result;
        Scanner sc = new Scanner(System.in);
        System.out.println(" 1) add\n 2)substract\n 3)multiply\n 4)divide\n 5)modulo");
        operateur = sc.nextInt();
        if ( operateur < 1||operateur > 5 ){
            System.out.println("La valeure choisie doit etre entre 1 et 5");
            System.exit(0);
        }
        System.out.println("Saisissez une premiere valeure: ");
        operante1 = sc.nextInt();
        System.out.println("Saisissez une deuxieme valeure: ");
        operante2 = sc.nextInt();
        if (operateur == 1) {
            result = operante1 + operante2;
            System.out.println("Le resultat est: "+ result);
        }
        if (operateur == 2) {
            result = operante1 - operante2;
            System.out.println("Le resultat est: "+ result);
        }
        if (operateur == 3) {
            result = operante1 * operante2;
            System.out.println("Le resultat est: "+ result);
        }
        if (operateur == 4){
            result = operante1 / operante2;
            System.out.println("Le resultat est: "+ result);
        }
        if (operateur == 5) {
            result = operante1 % operante2;
            System.out.println("Le resultat est: "+ result);
        }
    }
}
