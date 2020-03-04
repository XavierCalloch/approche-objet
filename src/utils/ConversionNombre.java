package utils;

import java.lang.Integer;

public class ConversionNombre {

	public static void main(String[] args) {
		
		String s = "Il est 6 heures";
		
		// Conversion d'une chaîne de caractères en nombre
		int convertedString = Integer.parseInt(s);
		
		int a = 3;
		int b = 5;
		
		// Calcul et affichage du nombre maximum entre a et b
		System.out.println(Integer.max(a, b));

	}

}
