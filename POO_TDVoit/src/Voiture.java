
public class Voiture extends V�hicule{
	
	public Voiture(int annee, double prix) {
		super(annee, prix);
	}
	
	// fonctions pass�s par la classe m�re
	void demarrer() {
		System.out.println("Je d�marre");
	}
	
	void accelerer() {
		System.out.println("J'acc�l�re");
	}
	
}
