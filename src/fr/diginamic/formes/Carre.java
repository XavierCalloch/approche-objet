package fr.diginamic.formes;

/**
 * 
 * Repr�sente un carr�
 * 
 * @author xavie
 *
 */
public class Carre extends Rectangle {
	
	/** Constructeur
	 * @param longueur longueur du carr�
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
