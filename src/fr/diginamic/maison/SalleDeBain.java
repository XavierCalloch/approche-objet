package fr.diginamic.maison;

/**
 * 
 * Repr�sente une salle de bains
 * 
 * @author xavie
 *
 */
public class SalleDeBain extends Piece {
	
	/** Constructeur
	 * @param superficie	superficie de la salle de bains
	 * @param etage			num�ro de l'�tage de la salle de bains
	 */
	public SalleDeBain(double superficie, int etage) {
		super(superficie, etage);
	}
	
	@Override
	public String afficherType() {
		return "Salle de bains";
	}
	
}
