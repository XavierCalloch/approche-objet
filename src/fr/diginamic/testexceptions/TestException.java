package fr.diginamic.testexceptions;

import fr.diginamic.testexceptions.Operation;

public class TestException {

	public static void main(String[] args) {
		
		try {
			double res = Operation.diviser(4.0, 2.0); // 1er cas // ou pas obligé en static dans la classe Operation et on instancie un objet Operation
			System.out.println(res);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		try {
			double res2 = Operation.diviser(4.0, 0.0); // 2ème cas
			System.out.println(res2);
		} catch (Exception e) {
			System.out.println("Une erreur s'est produite. Voici le message renvoyé par le système: " + e.getMessage());
		}

	}

}
