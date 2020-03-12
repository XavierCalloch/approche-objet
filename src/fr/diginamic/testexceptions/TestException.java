package fr.diginamic.testexceptions;

import fr.diginamic.testexceptions.Operation;

public class TestException {

	public static void main(String[] args) {
		
		try {
			//double res = Operation.diviser(4.0, 2.0); // 1er cas // ou pas oblig� en static dans la classe Operation et on instancie un objet Operation
			double res = Operation.diviser(4.0, 0.0); // 2�me cas
			System.out.println(res);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
