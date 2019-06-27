
public class Voiture extends Véhicule{
	
	public Voiture(int annee, double prix) {
		super(annee, prix);
	}
	
	// fonctions passés par la classe mère
	void demarrer() {
		System.out.println("Je démarre");
	}
	
	void accelerer() {
		System.out.println("J'accélère");
	}
	
}
