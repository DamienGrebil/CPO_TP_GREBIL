/*
 * TP1
 * DamienGrebil
 * Septembre 2024
 */
package p1_manipnombresint_damien;

import java.util.Scanner;

/**
 *
 * @author damie
 */
public class P1_manipNombresInt_Damien {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int Valeure1; 
        int Valeure2;
        int Somme;
        int Diff;
        int Produit;
        int Div;
        int Reste;
        Scanner sc = new Scanner(System.in);
        System.out.println(" Choississez une valeure:");
        Valeure1 = sc.nextInt();
        System.out.println(" Choississez une deuxieme valeure:");
        Valeure2 = sc.nextInt();
        Somme = Valeure1+Valeure2;
        Diff = Valeure1-Valeure2;
        Produit = Valeure1*Valeure2;
        System.out.println("La somme des deux valeures est:"+ Somme +"\n La difference des deux valeures est: "+ Diff +"\n Le produit des deux valeures est: "+ Produit );
        Div = Valeure1/Valeure2;
        Reste = Valeure1%Valeure2;
        System.out.println("Le resultat entier de la division est: "+Div +"\nLe reste est: "+ Reste );
    }
    
}
