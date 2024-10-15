package tp2_convertisseurobjet_grebil;

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

    @Override
    public String toString() {
        return "nb de conversions =" + nbConversions;
    }
}
