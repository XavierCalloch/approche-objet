package fr.diginamic.entites;

/**
 * 
 * Repr�sente un cercle
 * 
 * @author xavie
 *
 */
public class Cercle {
	
	/** rayon du cercle */
	private double rayon;

	/** Constructeur
	 * @param rayon	rayon du cercle
	 */
	public Cercle(double rayon) {
		this.rayon = rayon;
	}
	
	/**
	 * 
	 * Cette m�thode retourne le p�rim�tre du cercle
	 * 
	 * @return le p�rim�tre du cercle
	 */
	public double calculPerimetre() {
		double perimetre = 2 * Math.PI * rayon;
		return perimetre;
	}
	
	/**
	 * 
	 * Cette m�thode retourne la surface du cercle
	 * 
	 * @return la surface du cercle
	 */
	public double calculSurface() {
		double surface = Math.PI * rayon * rayon;
		return surface;
	}

	/** Getter
	 * @return the rayon
	 */
	public double getRayon() {
		return rayon;
	}

	/** Setter
	 * @param rayon the rayon to set
	 */
	public void setRayon(double rayon) {
		this.rayon = rayon;
	}

}
