package fr.diginamic.testexceptions;

public class Operation {
	
	public static double diviser(double a, double b) throws Exception {
		if (b == 0) {
			throw new Exception("La division par 0 est interdite");
		}
		return a / b;
	}
	
}
