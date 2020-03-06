package fr.diginamic.formes;

/**
 * 
 * Représente un cercle
 * 
 * @author xavie
 *
 */
public class Cercle extends Forme {
	
	/** Constructeur
	 * @param rayon rayon du cercle
	 */
	public Cercle(double rayon) {
		super(rayon);
	}
	
	@Override
	public double calculerSurface() {
		double surface = Math.PI * rayon * rayon;
		return surface;
	}
	
	@Override
	public double calculerPerimetre() {
		double perimetre = 2 * Math.PI * rayon;
		return perimetre;
	}

}
