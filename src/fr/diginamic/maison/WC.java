package fr.diginamic.maison;

/**
 * 
 * Représente un WC
 * 
 * @author xavie
 *
 */
public class WC extends Piece {
	
	/** Constructeur
	 * @param superficie	superficie du WC
	 * @param etage			numéro de l'étage du WC
	 */
	public WC(double superficie, int etage) {
		super(superficie, etage);
	}
	
	@Override
	public String afficherType() {
		return "WC";
	}
	
}
