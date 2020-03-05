package fr.diginamic.essais;

import fr.diginamic.entites.Cercle;

public class TestCercle {

	public static void main(String[] args) {
		
		Cercle c1 = new Cercle(4.3);
		Cercle c2 = new Cercle(2.8);
		
		System.out.println(c1.calculPerimetre());
		System.out.println(c2.calculPerimetre());
		System.out.println(c1.calculSurface());
		System.out.println(c2.calculSurface());

	}

}
