
public class Camion extends Véhicule{
	
	public Camion(int annee, double prix) {
		super(annee, prix);
	}

	@Override
	void demarrer() {
		// TODO Auto-generated method stub
		System.out.println("Je démarre");
	}

	@Override
	void accelerer() {
		// TODO Auto-generated method stub
		System.out.println("J'accélère mais pas trop vite");
	}
}
