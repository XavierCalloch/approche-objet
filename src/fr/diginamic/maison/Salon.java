package fr.diginamic.maison;

/**
 * 
 * Représente un salon
 * 
 * @author xavie
 *
 */
public class Salon extends Piece {
	
	/** Constructeur
	 * @param superficie	superficie du salon
	 * @param etage			numéro de l'étage du salon
	 */
	public Salon(double superficie, int etage) {
		super(superficie, etage);
	}
	
	@Override
	public String afficherType() {
		return "Salon";
	}
	
}
