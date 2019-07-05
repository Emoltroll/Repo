package executeur;
import classes.Camion;
import classes.Voiture;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// On instancie les varibles de la classe appelé
		Voiture Voit = new Voiture(1997, 200);
		Camion Cam = new Camion(1845, 3223);
		
		// écriture dans la console
		System.out.println(Voit.toString());
		System.out.println(Cam.toString());
		
		// fonctions appelés
		Voit.demarrer();
		Voit.accelerer();
	}

}
