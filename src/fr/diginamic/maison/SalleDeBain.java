package fr.diginamic.maison;

/**
 * 
 * Représente une salle de bains
 * 
 * @author xavie
 *
 */
public class SalleDeBain extends Piece {
	
	/** Constructeur
	 * @param superficie	superficie de la salle de bains
	 * @param etage			numéro de l'étage de la salle de bains
	 */
	public SalleDeBain(double superficie, int etage) {
		super(superficie, etage);
	}
	
	@Override
	public String afficherType() {
		return "Salle de bains";
	}
	
}
