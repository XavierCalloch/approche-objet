package fr.diginamic.essais;

import fr.diginamic.operations.CalculMoyenne;

public class TestMoyenne {

	public static void main(String[] args) {
		
		// 1er test
		CalculMoyenne calc1 = new CalculMoyenne();
		double[] tab1 = {1.0, 2.5, -1.5, 3.6, 4.7};
		for (int i = 0; i < tab1.length; i++) {
			calc1.ajout(tab1[i]);
		}
		System.out.println(calc1.calcul());
		
		// 2ème test
		CalculMoyenne calc2 = new CalculMoyenne();
		double[] tab2 = {5.4, 4.5, 4.1, 4.8, 5.9};
		for (int i = 0; i < tab2.length; i++) {
			calc2.ajout(tab2[i]);
		}
		System.out.println(calc2.calcul());

	}

}
