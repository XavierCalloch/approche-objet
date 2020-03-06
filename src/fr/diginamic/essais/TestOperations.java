package fr.diginamic.essais;

import fr.diginamic.operations.Operations;

public class TestOperations {

	public static void main(String[] args) {
		
		double add = Operations.calcul(8.1, 3.4, '+'); // une addition
		double soustr = Operations.calcul(5.9, 3.2, '-'); // une soustraction
		double mult = Operations.calcul(6.0, 4.0, '*'); // une multiplication
		double div = Operations.calcul(15.0, 5.0, '/'); // une division
		
		// On affiche les résultats
		System.out.println(add + "\n" + soustr + "\n" + mult + "\n" + div);

	}

}
