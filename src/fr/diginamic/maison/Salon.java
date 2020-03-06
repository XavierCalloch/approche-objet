package fr.diginamic.maison;

/**
 * 
 * Repr�sente un salon
 * 
 * @author xavie
 *
 */
public class Salon extends Piece {
	
	/** Constructeur
	 * @param superficie	superficie du salon
	 * @param etage			num�ro de l'�tage du salon
	 */
	public Salon(double superficie, int etage) {
		super(superficie, etage);
	}
	
	@Override
	public String afficherType() {
		return "Salon";
	}
	
}
