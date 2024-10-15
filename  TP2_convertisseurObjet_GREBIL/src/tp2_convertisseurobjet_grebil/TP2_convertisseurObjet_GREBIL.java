/*
* TP2 convertisseur
* DamienGrebil
* Octobre 2024
*/
package tp2_convertisseurobjet_grebil;

import java.util.Scanner;

/**
 *
 * @author damie
 */
public class TP2_convertisseurObjet_GREBIL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Convertisseur calcul = new Convertisseur();
        calcul.toString();
        System.out.println(calcul);
    
        double temp;
        double C2K;
        int type;
        Scanner sc = new Scanner(System.in);
        System.out.println ("saisssissez la temperature");
        temp  = sc.nextDouble();

        System.out.println ("Saisissez la conversion que vous souhaiter effectuer : \n 1|De Celcius vers Kelvin \n 2| De Kelvin vers Celcius \n 3| De Farenheit vers Celcius \n 4| De Celcius vers Farenheit \n 5| De Kelvin vers Farenheit \n 6| De Farenheit vers Kelvin  ");
        type  = sc.nextInt();
        if (type == 1){
            C2K = CelciusVersKelvin(temp);
            System.out.println("la temperature en Kelvin est:" + C2K);
        }
        if (type== 2){
            C2K = KelvinVersCelcius(temp);
            System.out.println("la temperature en Celcius est:" + C2K);
        }
        if (type== 3){
            C2K = FarenheitVersCelcius(temp);
            System.out.println("la temperature en Celcius est:" + C2K);
        }
        if (type== 4){
            C2K = CelciusVersFarenheit(temp);
            System.out.println("la temperature en Kelvin est:" + C2K);
        }
        if (type== 5){
           C2K = KelvinVersFarenheit(temp);
            System.out.println("la temperature en Farenheit est:" + C2K);
        }
        if (type== 6){
            C2K = FarenheitVersKelvin(temp);
            System.out.println("la temperature en Kelvin est:" + C2K);
        }
    }
}
