
public class Camion extends V�hicule{
	
	public Camion(int annee, double prix) {
		super(annee, prix);
	}

	@Override
	void demarrer() {
		// TODO Auto-generated method stub
		System.out.println("Je d�marre");
	}

	@Override
	void accelerer() {
		// TODO Auto-generated method stub
		System.out.println("J'acc�l�re mais pas trop vite");
	}
}
