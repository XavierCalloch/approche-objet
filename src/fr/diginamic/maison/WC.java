package fr.diginamic.maison;

/**
 * 
 * Repr�sente un WC
 * 
 * @author xavie
 *
 */
public class WC extends Piece {
	
	/** Constructeur
	 * @param superficie	superficie du WC
	 * @param etage			num�ro de l'�tage du WC
	 */
	public WC(double superficie, int etage) {
		super(superficie, etage);
	}
	
	@Override
	public String afficherType() {
		return "WC";
	}
	
}
