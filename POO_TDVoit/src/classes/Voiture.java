package classes;

public class Voiture extends Véhicule{
	
	public Voiture(int annee, double prix) {
		super(annee, prix);
	}
	
	// fonctions passés par la classe mère
	public void demarrer() {
		System.out.println("Je démarre");
	}
	
	public void accelerer() {
		System.out.println("J'accélère");
	}
	
}
