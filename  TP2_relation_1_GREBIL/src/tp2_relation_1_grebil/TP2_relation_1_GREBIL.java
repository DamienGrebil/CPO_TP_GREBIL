/*
* TP2 relation 1
* DamienGrebil
* Octobre 2024
 */
package tp2_relation_1_grebil;

/**
 *
 * @author damie
 */
public class TP2_relation_1_GREBIL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Voiture uneClio = new Voiture ("Clio", "Renault", 5 ) ; 
        Voiture uneAutreClio = new Voiture ("Clio", "Renault", 5 ) ; 
        Voiture une2008 = new Voiture ("2008", "Peugeot", 6 ) ; 
        Voiture uneMicra = new Voiture ("Micra", "Nissan", 4 ) ; 
        Personne bob = new Personne("Bobby", "Sixkiller"); 
        Personne reno = new Personne("Reno", "Raines");  
        System.out.println("liste des voitures disponibles: " + "\n" + uneClio  + "\n" + uneAutreClio   + "\n" + une2008   + "\n" + uneMicra ) ;
        
        bob.liste_voitures[0] = uneClio ; 
        bob.nb_Voitures = 1 ; 
        uneClio.proprietaire = bob ;
        System.out.println("la premiere voiture de Bob est " + bob.liste_voitures[0] ) ; 
        
        bob.liste_voitures[1] = une2008 ; 
        bob.nb_Voitures = 2 ; 
        une2008.proprietaire = bob ;
        System.out.println("la deuxieme voiture de Bob est " + bob.liste_voitures[1] ) ;
        
        reno.liste_voitures[0] = uneAutreClio ; 
        reno.nb_Voitures = 1 ; 
        uneAutreClio.proprietaire = reno ;
        System.out.println("la premiere voiture de reno est " + reno.liste_voitures[0] ) ;
        
        reno.liste_voitures[1] = uneMicra ; 
        reno.nb_Voitures = 2 ; 
        uneMicra.proprietaire = reno ;
        System.out.println("la deuxieme voiture de reno est " + reno.liste_voitures[1] ) ;
        
    }
    
}
