package fr.diginamic.testexceptions;

public class Operation {
	
	public static double diviser(double a, double b) throws Exception {
		if (b == 0) {
			throw new Exception("Il est interdit de diviser par 0 ");
		}
		return a / b;
	}
	
}
