package fr.diginamic.essais;

import fr.diginamic.formes.Cercle;
import fr.diginamic.formes.Rectangle;
import fr.diginamic.formes.Carre;
import fr.diginamic.essais.AffichageForme;

public class TestForme {

	public static void main(String[] args) {
		
		Cercle cercle = new Cercle(5.0);
		Rectangle rectangle = new Rectangle(4.0, 2.0);
		Carre carre = new Carre(3.0);
		
		AffichageForme aff = new AffichageForme();
		
		System.out.println("Cercle - " + aff.afficher(cercle));
		System.out.println("Rectangle - " + aff.afficher(rectangle));
		System.out.println("Carré - " + aff.afficher(carre));

	}

}
