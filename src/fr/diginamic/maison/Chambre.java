package fr.diginamic.maison;

/**
 * 
 * Représente une chambre
 * 
 * @author xavie
 *
 */
public class Chambre extends Piece {
	
	/** Constructeur
	 * @param superficie	superficie de la chambre
	 * @param etage			numéro de l'étage de la chambre
	 */
	public Chambre(double superficie, int etage) {
		super(superficie, etage);
	}
	
	@Override
	public String afficherType() {
		return "Chambre";
	}
	
}
