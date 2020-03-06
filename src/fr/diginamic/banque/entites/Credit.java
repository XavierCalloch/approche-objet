package fr.diginamic.banque.entites;

/**
 * 
 * Représente une opération de crédit bancaire
 * 
 * @author xavie
 *
 */
public class Credit extends Operation {
	
	/** Constructeur
	 * @param date		date de l'opération
	 * @param montant	montant de l'opération
	 */
	public Credit(String date, double montant) {
		super(date, montant);
	}
	
	@Override
	public String afficherType() {
		return "Crédit";
	}
	
}
