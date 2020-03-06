package fr.diginamic.maison;

/**
 * 
 * Représente une cuisine
 * 
 * @author xavie
 *
 */
public class Cuisine extends Piece {
	
	/** Constructeur
	 * @param superficie	superficie de la cuisine
	 * @param etage			numéro de l'étage de la cuisine
	 */
	public Cuisine(double superficie, int etage) {
		super(superficie, etage);
	}
	
	@Override
	public String afficherType() {
		return "Cuisine";
	}
	
}
