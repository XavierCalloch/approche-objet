package fr.diginamic.operations;

/**
 * 
 * Représente le concept d'opération mathématique
 * 
 * @author xavie
 *
 */
public class Operations {
	
	/**
	 * @param a		un nombre de type double
	 * @param b		un nombre de type double
	 * @param ope	un opérateur
	 * @return le résultat de l'opération
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
