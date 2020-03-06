package fr.diginamic.formes;

/**
 * 
 * Représente le concept de forme (géométrie)
 * 
 * @author xavie
 *
 */
public abstract class Forme {
	
	/** rayon d'un cercle */
	protected double rayon;
	/** longueur d'un rectangle */
	protected double longueur;
	/** largeur d'un rectangle */
	protected double largeur;
	
	/** Constructeur
	 * @param rayon rayon d'un cercle
	 */
	public Forme(double rayon) {
		this.rayon = rayon;
	}
	
	/** Constructeur
	 * @param longueur	longueur d'un rectangle
	 * @param largeur	largeur d'un rectangle
	 */
	public Forme(double longueur, double largeur) {
		this.longueur = longueur;
		this.largeur = largeur;
	}
	
	/**
	 * 
	 * Cette méthode retourne la surface de la forme
	 * 
	 * @return la surface de la forme
	 */
	public abstract double calculerSurface();
	
	/**
	 * 
	 * Cette méthode retourne le périmètre de la forme
	 * 
	 * @return le périmètre de la forme
	 */
	public abstract double calculerPerimetre();

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
