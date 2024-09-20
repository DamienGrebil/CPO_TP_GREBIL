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
        Scanner sc = new Scanner(System.in);
        System.out.println(" 1) add\n 2)substract\n 3)multiply\n 4)divide\n 5)modulo");
        operateur = sc.nextInt();
        System.out.println("Saisissez une premiere valeure: ");
        operante1 = sc.nextInt();
       System.out.println("Saisissez une deuxieme valeure: ");
        operante2 = sc.nextInt();
    }
}
