package fr.diginamic.operations;

/**
 * 
 * Repr�sente le concept d'op�ration math�matique
 * 
 * @author xavie
 *
 */
public class Operations {
	
	/**
	 * @param a		un nombre de type double
	 * @param b		un nombre de type double
	 * @param ope	un op�rateur
	 * @return le r�sultat de l'op�ration
	 */
	public static double calcul(double a, double b, char ope) {
		double result = 0.0;
		if (ope == '+') {
			result = a + b;
		}
		else if (ope == '-') {
			result = a - b;
		}
		else if (ope == '*') {
			result = a * b;
		}
		else if (ope == '/') {
			result = a / b;
		}
		return result;
	}
	
}
