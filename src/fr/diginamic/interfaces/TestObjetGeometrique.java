package fr.diginamic.interfaces;

import fr.diginamic.interfaces.Cercle;
import fr.diginamic.interfaces.Rectangle;

public class TestObjetGeometrique {

	public static void main(String[] args) {
		
		ObjetGeometrique[] tab = new ObjetGeometrique[2];
		
		tab[0] = new Cercle(2.0);
		tab[1] = new Rectangle(3.0, 2.0);
		
		for (int i = 0; i < tab.length; i++) {
			System.out.println("Périmètre: " + tab[i].perimetre());
			System.out.println("Surface: " + tab[i].surface());
		}

	}

}
