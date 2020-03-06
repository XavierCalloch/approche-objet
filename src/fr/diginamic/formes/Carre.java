package fr.diginamic.formes;

/**
 * 
 * Représente un carré
 * 
 * @author xavie
 *
 */
public class Carre extends Rectangle {
	
	/** Constructeur
	 * @param longueur longueur du carré
	 */
	public Carre(double longueur) {
		super(longueur, longueur);
	}
	
	@Override
	public double calculerSurface() {
		double surface = longueur * longueur;
		return surface;
	}
	
	@Override
	public double calculerPerimetre() {
		double perimetre = 4 * longueur;
		return perimetre;
	}
	
}
