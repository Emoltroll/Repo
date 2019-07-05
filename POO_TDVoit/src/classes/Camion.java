package classes;

public class Camion extends Véhicule{
	
	public Camion(int annee, double prix) {
		super(annee, prix);
	}

	void demarrer() {
		// TODO Auto-generated method stub
		System.out.println("Je démarre");
	}

	void accelerer() {
		// TODO Auto-generated method stub
		System.out.println("J'accélère mais pas trop vite");
	}
}
