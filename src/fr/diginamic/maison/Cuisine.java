package fr.diginamic.maison;

/**
 * 
 * Repr�sente une cuisine
 * 
 * @author xavie
 *
 */
public class Cuisine extends Piece {
	
	/** Constructeur
	 * @param superficie	superficie de la cuisine
	 * @param etage			num�ro de l'�tage de la cuisine
	 */
	public Cuisine(double superficie, int etage) {
		super(superficie, etage);
	}
	
	@Override
	public String afficherType() {
		return "Cuisine";
	}
	
}
