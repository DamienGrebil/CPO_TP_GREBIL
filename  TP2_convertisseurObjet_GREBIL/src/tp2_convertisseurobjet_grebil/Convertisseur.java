package tp2_convertisseurobjet_grebil;

import java.util.Scanner;

/*
* TP2 bieres
* DamienGrebil
* Octobre 2024
 */

/**
 *
 * @author damie
 */
public class Convertisseur {

    int nbConversions = 0;
    double temp;
    double C2K;
    int type;

    public float CelciusVersKelvin(float tKEL) {
        tKEL += 273.15;
        nbConversions++; // incremente le nombre de convertions
        return tKEL;
    }

    public float KelvinVersCelcius(float tCELC) {
        tCELC -= 273.15;
        nbConversions++; // incremente le nombre de convertions
        return tCELC;
    }

    public float CelciusVersFarenheit(float tFAR) {
        tFAR = (tFAR * 9 / 5) + 32;
        nbConversions++; // incremente le nombre de convertions
        return tFAR;
    }

    public float FarenheitVersCelcius(float tCEL) {
        tCEL = (tCEL - 32) * 5 / 9;
        nbConversions++; // incremente le nombre de convertions
        return tCEL;
    }

    public float KelvinVersFarenheit(float tFARE) {
        tFARE = KelvinVersCelcius(tFARE);
        tFARE = CelciusVersFarenheit(tFARE);
        nbConversions++; // incremente le nombre de convertions
        return tFARE;
    }

    public float FarenheitVersKelvin(float tKELV) {
        tKELV = FarenheitVersCelcius(tKELV);
        tKELV = CelciusVersKelvin(tKELV);
        nbConversions++; // incremente le nombre de convertions
        return tKELV;
    }
    
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
    @Override
    public String toString() {
        return "nb de conversions =" + nbConversions;
    }
}
