package fr.diginamic.maison;

/**
 * 
 * Repr�sente une chambre
 * 
 * @author xavie
 *
 */
public class Chambre extends Piece {
	
	/** Constructeur
	 * @param superficie	superficie de la chambre
	 * @param etage			num�ro de l'�tage de la chambre
	 */
	public Chambre(double superficie, int etage) {
		super(superficie, etage);
	}
	
	@Override
	public String afficherType() {
		return "Chambre";
	}
	
}
