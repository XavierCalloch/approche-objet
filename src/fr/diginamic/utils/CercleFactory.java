package fr.diginamic.utils;

import fr.diginamic.entites.Cercle;

/**
 * 
 * Représente le concept de CercleFactory (factory de la classe Cercle)
 * 
 * @author xavie
 *
 */
public class CercleFactory {
	
	/**
	 * @param rayon	rayon du cercle
	 * @return un cercle
	 */
	public static Cercle retourneCercle(double rayon) {
		Cercle c = new Cercle(rayon);
		return c;
	}
}
