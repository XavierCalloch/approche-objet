package fr.diginamic.banque.entites;

/**
 * 
 * Repr�sente une op�ration de cr�dit bancaire
 * 
 * @author xavie
 *
 */
public class Credit extends Operation {
	
	/** Constructeur
	 * @param date		date de l'op�ration
	 * @param montant	montant de l'op�ration
	 */
	public Credit(String date, double montant) {
		super(date, montant);
	}
	
	@Override
	public String afficherType() {
		return "Cr�dit";
	}
	
}
