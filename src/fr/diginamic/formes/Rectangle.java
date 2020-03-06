package fr.diginamic.formes;

/**
 * 
 * Représente un rectangle
 * 
 * @author xavie
 *
 */
public class Rectangle extends Forme {
	
	/** Constructeur
	 * @param longueur 	longueur du rectangle
	 * @param largeur	largeur du rectangle
	 */
	public Rectangle(double longueur, double largeur) {
		super(longueur, largeur);
	}
	
	/** Constructeur
	 * @param longueur longueur du rectangle
	 */
	public Rectangle(double longueur) {
		super(longueur, longueur);
	}
	
	@Override
	public double calculerSurface() {
		double surface = longueur * largeur;
		return surface;
	}
	
	@Override
	public double calculerPerimetre() {
		double perimetre = 2 * (longueur + largeur);
		return perimetre;
	}
	
}
