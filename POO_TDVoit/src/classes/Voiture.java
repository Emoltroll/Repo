package classes;

public class Voiture extends V�hicule{
	
	public Voiture(int annee, double prix) {
		super(annee, prix);
	}
	
	// fonctions pass�s par la classe m�re
	public void demarrer() {
		System.out.println("Je d�marre");
	}
	
	public void accelerer() {
		System.out.println("J'acc�l�re");
	}
	
}
