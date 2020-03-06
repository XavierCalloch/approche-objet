package fr.diginamic.maison;

/**
 * 
 * Représente le concept de pièce (maison)
 * 
 * @author xavie
 *
 */
public abstract class Piece {
	
	/** superficie de la pièce */
	private double superficie;
	/** numéro de l'étage de la pièce */
	private int etage;
	
	/** Constructeur
	 * @param superficie 	superficie de la pièce
	 * @param etage			numéro de l'étage de la pièce
	 */
	public Piece(double superficie, int etage) {
		this.superficie = superficie;
		this.etage = etage;
	}
	
	/**
	 * 
	 * Cette méthode retourne le type de pièce
	 * 
	 * @return le type de pièce
	 */
	public abstract String afficherType();

	/** Getter
	 * @return the superficie
	 */
	public double getSuperficie() {
		return superficie;
	}

	/** Setter
	 * @param superficie the superficie to set
	 */
	public void setSuperficie(double superficie) {
		this.superficie = superficie;
	}

	/** Getter
	 * @return the etage
	 */
	public int getEtage() {
		return etage;
	}

	/** Setter
	 * @param etage the etage to set
	 */
	public void setEtage(int etage) {
		this.etage = etage;
	}
	
}
