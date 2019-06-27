// classe m�re abstract
abstract class V�hicule {
	
	// Variables d la classe
	private int Matricule;
	private int Annee;
	private double Prix;
	private int i = 0;
	
	// r�cup�ration des valeurs du test
	public V�hicule(int annee, double prix) {
		// Les valeurs de la classe local prennent celles de la classe test
		Matricule = ++i;
		Annee = annee;
		Prix = prix;
	}
	
	// On passe les fonctions d�clar�s aux enfants
	abstract void demarrer();
	abstract void accelerer();

	// getters et setters
	public int getMatricule() {
		return Matricule;
	}

	public void setMatricule(int matricule) {
		Matricule = matricule;
	}

	public int getAnnee() {
		return Annee;
	}

	public void setAnnee(int annee) {
		Annee = annee;
	}

	public double getPrix() {
		return Prix;
	}

	public void setPrix(double prix) {
		Prix = prix;
	}

	// retour en string avec les variables d�clar�s
	@Override
	public String toString() {
		return "" + this.getClass() + "[Matricule=" + Matricule + ", Annee=" + Annee + ", Prix=" + Prix + "]";
	}
	
	
}
