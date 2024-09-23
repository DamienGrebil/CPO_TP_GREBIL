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
    
    public static double CelciusVersKelvin(double tKEL) {
        tKEL += 273.15 ;
        return tKEL ;
    }
    
    public static double KelvinVersCelcius(double tCELC) {
        tCELC -= 273.15 ;
        return tCELC;
    }
    
    public static double CelciusVersFarenheit(double tFAR) {
        tFAR = (tFAR * 9/5) + 32;
        return tFAR;
    }
    
    public static double FarenheitVersCelcius(double tCEL) {
        tCEL = (tCEL - 32) * 5/9;
        return tCEL;
    }
    
    public static double KelvinVersFarenheit(double tFARE ) {
        tFARE = KelvinVersCelcius(tFARE);
        tFARE = CelciusVersFarenheit(tFARE);
        return tFARE;
    }
    
    public static double FarenheitVersKelvin(double tKELV ) {
        tKELV = KelvinVersCelcius(tKELV);
        tKELV = CelciusVersFarenheit(tKELV);
        return tKELV;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double temp;
        double C2K ;
        double C2F ;
        double F2C ;
        double F2K ;
        double K2F ;
        double K2C ;
        int type;
        Scanner sc = new Scanner(System.in);
        System.out.println("saisssissez la temperature");
        temp = sc.nextDouble();
        System.out.println("Saisissez la conversion que vous souhaiter effectuer : \n 1|De Celcius vers Kelvin \n 2| De Kelvin vers Celcius \n 3| De Farenheit vers Celcius \n 4| De Celcius vers Farenheit \n 5| De Kelvin vers Farenheit \n 6| De Farenheit vers Kelvin  ");
        type = sc.nextInt();
        if (type == 1){
            C2K = CelciusVersKelvin(temp);
            System.out.println("la temperature en Kelvin est:" + C2K);
        }
        if (type == 2){
            C2K = KelvinVersCelcius(temp);
            System.out.println("la temperature en Celcius est:" + C2K);
        }
        if (type == 3){
            C2K = FarenheitVersCelcius(temp);
            System.out.println("la temperature en Celcius est:" + C2K);
        }
        if (type == 4){
            C2K = CelciusVersFarenheit(temp);
            System.out.println("la temperature en Kelvin est:" + C2K);
        }
        if (type == 5){
            C2K = KelvinVersFarenheit(temp);
            System.out.println("la temperature en Farenheit est:" + C2K);
        }
        if (type == 6){
            C2K = FarenheitVersKelvin(temp);
            System.out.println("la temperature en Kelvin est:" + C2K);
        }
        
    }
    
}
