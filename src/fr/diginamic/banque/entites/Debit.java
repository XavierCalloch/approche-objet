/**
 * 
 */
package fr.diginamic.banque.entites;

/**
 * 
 * Repr�sente une op�ration de d�bit bancaire
 * 
 * @author xavie
 *
 */
public class Debit extends Operation {

	/** Constructeur
	 * @param date		date de l'op�ration
	 * @param montant	montant de l'op�ration
	 */
	public Debit(String date, double montant) {
		super(date, montant);
	}
	
	@Override
	public String afficherType() {
		return "D�bit";
	}

}
