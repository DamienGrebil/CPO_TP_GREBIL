/*
 * TP0 Exercice2
 * DamienGrebil
 * Septembre 2024
 */
package exo.pkg2;

/**
 *
 * @author damien
 */
public class Exo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Declaration des variables
        int nb; // nombre dentiers a additionner
        int result; // resultat
        int ind; //indice
        nb = 5;
        result = 0;
        // Addition des nb premiers entiers
        ind = 1;
        while (ind <= nb) {
            result = result + ind;
        }
        // Affichage du resultat
        System.out.println();
        System.out.println("La somme des " + nb + "entiers est: " + result);
    }
}
