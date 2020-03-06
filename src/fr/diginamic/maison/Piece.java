package fr.diginamic.maison;

/**
 * 
 * Repr�sente le concept de pi�ce (maison)
 * 
 * @author xavie
 *
 */
public abstract class Piece {
	
	/** superficie de la pi�ce */
	private double superficie;
	/** num�ro de l'�tage de la pi�ce */
	private int etage;
	
	/** Constructeur
	 * @param superficie 	superficie de la pi�ce
	 * @param etage			num�ro de l'�tage de la pi�ce
	 */
	public Piece(double superficie, int etage) {
		this.superficie = superficie;
		this.etage = etage;
	}
	
	/**
	 * 
	 * Cette m�thode retourne le type de pi�ce
	 * 
	 * @return le type de pi�ce
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
