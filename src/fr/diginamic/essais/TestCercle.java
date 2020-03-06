package fr.diginamic.essais;

import fr.diginamic.entites.Cercle;
import fr.diginamic.utils.CercleFactory;

public class TestCercle {

	public static void main(String[] args) {
		
		// On créé 2 cercles différents
		Cercle c1 = new Cercle(4.3);
		Cercle c2 = new Cercle(2.8);
		
		// On affiche les résultats des méthodes de calcul de périmètre et de calcul de surface	
		System.out.println(c1.calculPerimetre());
		System.out.println(c2.calculPerimetre());
		System.out.println(c1.calculSurface());
		System.out.println(c2.calculSurface());
		
		// On utilise la méthode static de CercleFactory pour créer des cercles
		Cercle c3 = CercleFactory.retourneCercle(5.0);
		Cercle c4 = CercleFactory.retourneCercle(2.4);

	}

}
