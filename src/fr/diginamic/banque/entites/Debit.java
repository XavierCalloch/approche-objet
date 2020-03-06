/**
 * 
 */
package fr.diginamic.banque.entites;

/**
 * 
 * Représente une opération de débit bancaire
 * 
 * @author xavie
 *
 */
public class Debit extends Operation {

	/** Constructeur
	 * @param date		date de l'opération
	 * @param montant	montant de l'opération
	 */
	public Debit(String date, double montant) {
		super(date, montant);
	}
	
	@Override
	public String afficherType() {
		return "Débit";
	}

}
