/*
* TP1 convertisseur
* DamienGrebil
* Septembre 2024
*/
package tp1_convertisseur_damien;

import java.util.Scanner;

/**
 *
 * @author damie
 */
public class TP1_convertisseur_DAMIEN {
    
    public static double CelciusVersKelvin(double tCelcius) {
        double val;
        Scanner sc = new Scanner(System.in);
        System.out.println("saisssissez une valeure reelle(la temperature)");
        val = sc.nextDouble();
        val += 273.15 ;
        System.out.println("Voici la temperature en Kelvin: ");
        return val;
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double val;
        Scanner sc = new Scanner(System.in);
        System.out.println("saisssissez une valeure reelle(la temperature)");
        val = sc.nextDouble();
        val += 273.15 ;
        System.out.println("Voici la temperature en Kelvin: "+val);
    }
    
}
